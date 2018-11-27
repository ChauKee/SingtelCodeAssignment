package main.java.animal.core.living.fish;

import main.java.animal.core.living.Animal;
import main.java.animal.core.living.AnimalCategory;
import main.java.animal.core.living.Swimmable;

public class Fish extends Animal implements Swimmable {

    protected String color;
    protected String size;

    String getColor() {
        return color;
    }

    String getSize() {
        return size;
    }

    @Override
    public AnimalCategory getCategory() {
        return AnimalCategory.FISH;
    }

}
