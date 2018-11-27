package main.java.animal.core;

import main.java.animal.core.living.*;
import main.java.animal.core.living.amphibian.Frog;
import main.java.animal.core.living.bird.*;
import main.java.animal.core.living.fish.Clownfish;
import main.java.animal.core.living.fish.Fish;
import main.java.animal.core.living.fish.Shark;
import main.java.animal.core.living.insect.Butterfly;
import main.java.animal.core.living.mammal.Cat;
import main.java.animal.core.living.mammal.Dog;
import main.java.animal.core.living.mammal.Dolphin;
import main.java.animal.web.service.AnimalQueryService;
import main.java.animal.web.service.impl.DefaultAnimalQueryServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {

    private static Collection<Animal> ANIMALS = Collections.unmodifiableCollection(Arrays.asList(
            new Bird(),
            new Duck(),
            new Chicken(),
            new Rooster(),
            new Parrot(),
            new Fish(),
            new Shark(),
            new Clownfish(),
            new Dolphin(),
            new Frog(),
            new Dog(),
            new Butterfly(),
            new Cat()
    ));

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        System.out.println("Total flyable: " + countFlyable());
        System.out.println("Total walkable: " + countWalkable());
        System.out.println("Total singable: " + countSingable());
        System.out.println("Total swimmable: " + countSwimmable());

        //testAnimalQueryService();
    }

    public static int countFlyable() {
        return count(Flyable.class, "fly");
    }

    public static int countWalkable() {
        return count(Walkable.class, "walk");
    }

    public static int countSingable() {
        return count(Singable.class, "sing");
    }

    public static int countSwimmable() {
        return count(Swimmable.class, "swim");
    }

    private static int count(Class<? extends Characteristic> characteristic, String methodName) {
        return ANIMALS
                .stream()
                .reduce(0,
                        (count, animal) -> {
                            try {
                                // System.out.println("Count: " + count + ", Animal: " + animal.getClass().getSimpleName() + ", chac: " + characteristic.getSimpleName());
                                return characteristic.isAssignableFrom(animal.getClass()) &&
                                        characteristic.getMethod(methodName).invoke(animal) == null ? ++count : count;
                            } catch (UnsupportedOperationException | InvocationTargetException e) {
                                // Some animals haven their inherited characteristics overriden and throw UnsupportedOperationException
                                // which is wrapped in an InvocationException
                                return count;
                            } catch (NoSuchMethodException | IllegalAccessException e) {
                                throw new RuntimeException("Encountered unexpected runtime error.", e);
                            }
                        }, Integer::sum);
    }

    private static void testAnimalQueryService() {
        AnimalQueryService s = new DefaultAnimalQueryServiceImpl();
        Collection<Animal> c = s.queryByCharacteristic(Arrays.asList("singable", "capableImitateVoice"));
        System.out.println(c.toString());
    }

}