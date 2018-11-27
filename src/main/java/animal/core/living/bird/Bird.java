package main.java.animal.core.living.bird;

import main.java.animal.core.living.*;

public class Bird extends Animal implements Flyable, Singable, Walkable {

    @Override
    public void say() {
        System.out.println("I can squawk.");
    }

    @Override
    public AnimalCategory getCategory() {
        return AnimalCategory.BIRD;
    }

}