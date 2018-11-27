package main.java.animal.web.service.impl;

import main.java.animal.core.living.Animal;
import main.java.animal.core.living.AnimalCategory;
import main.java.animal.core.living.AnimalCharacteristic;
import main.java.animal.core.living.Characteristic;
import main.java.animal.core.living.amphibian.Frog;
import main.java.animal.core.living.bird.*;
import main.java.animal.core.living.fish.Clownfish;
import main.java.animal.core.living.fish.Fish;
import main.java.animal.core.living.fish.Shark;
import main.java.animal.core.living.insect.Butterfly;
import main.java.animal.core.living.insect.Catepillar;
import main.java.animal.core.living.mammal.Cat;
import main.java.animal.core.living.mammal.Dog;
import main.java.animal.core.living.mammal.Dolphin;
import main.java.animal.web.service.AnimalQueryService;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

public class DefaultAnimalQueryServiceImpl implements AnimalQueryService {

    public static final Collection<Animal> IN_MEMORY_ANIMAL_DATABASE = Collections.unmodifiableCollection(Arrays.asList(
            new Bird(), new Butterfly(), new Cat(), new Catepillar(), new Chicken(), new Clownfish(),
            new Dog(), new Dolphin(), new Duck(), new Fish(), new Frog(), new Parrot(), new Rooster(),
            new Shark()
    ));

    @Override
    public Collection<Animal> queryByCategory(AnimalCategory animalCategory) {
        // Return whole collection if category is not specified
        if (animalCategory == null) return IN_MEMORY_ANIMAL_DATABASE;
        return IN_MEMORY_ANIMAL_DATABASE.stream()
                .filter(animal -> animal.getCategory() == animalCategory)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Animal> queryByCharacteristic(Collection<String> characteristicNames) {
        List<Class<? extends Characteristic>> characteristicClasses = new ArrayList<>();
        Class<? extends Characteristic> matched;
        for (String characteristicName : characteristicNames) {
            matched = AnimalCharacteristic.getCharacteristicClass(characteristicName);
            // Omit those invalid passed in characteristic names
            if (matched != null) characteristicClasses.add(matched);
        }
        if (characteristicClasses.isEmpty()) return Collections.emptyList();
        return IN_MEMORY_ANIMAL_DATABASE.stream()
                .filter(animal -> characteristicClasses.stream()
                        .allMatch(characteristicClass -> {
                            try {
                                return characteristicClass.isAssignableFrom(animal.getClass()) &&
                                        characteristicClass.getMethod(AnimalCharacteristic.getCharacteristicMethodName(characteristicClass)).invoke(animal) == null;
                            } catch (UnsupportedOperationException | InvocationTargetException e) {
                                // Some animals haven their inherited characteristics overriden and throw UnsupportedOperationException
                                // which is wrapped in an InvocationException
                                return false;
                            } catch (NoSuchMethodException | IllegalAccessException e) {
                                throw new RuntimeException("Encountered unexpected runtime error.", e);
                            }
                        }))
                .collect(Collectors.toList());
    }
}
