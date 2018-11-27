package main.java.animal.core.living.bird;

import main.java.animal.core.living.*;

/**
 * This model of Rooster does not use inheritance, instead using delegate
 * pattern to delegate method call to chicken mandatory passed to it during instantiation
 */
public class RoosterWithoutInheritance implements Speakable, Flyable, Walkable, Singable, HasGender {

    private Chicken delegate;

    public RoosterWithoutInheritance(Chicken chicken) {
        this.delegate = chicken;
    }

    @Override
    public void fly() {
        delegate.fly();
    }

    @Override
    public void say() {
        System.out.println("Cock-a-doodle-doo");
    }

    @Override
    public void sing() {
        delegate.sing();
    }

    @Override
    public Gender getGender() {
        return Gender.MALE;
    }

}
