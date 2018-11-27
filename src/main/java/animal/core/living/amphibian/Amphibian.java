package main.java.animal.core.living.amphibian;

import main.java.animal.core.living.Animal;
import main.java.animal.core.living.AnimalCategory;
import main.java.animal.core.living.Swimmable;
import main.java.animal.core.living.Walkable;

/**
 * Amphian can live in water and on land
 */
public class Amphibian extends Animal implements Swimmable, Walkable {

    @Override
    public AnimalCategory getCategory() {
        return AnimalCategory.AMPHIBIAN;
    }
}
