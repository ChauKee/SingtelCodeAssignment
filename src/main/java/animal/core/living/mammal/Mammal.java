package main.java.animal.core.living.mammal;

import main.java.animal.core.living.Animal;
import main.java.animal.core.living.AnimalCategory;

public class Mammal extends Animal {

    @Override
    public AnimalCategory getCategory() {
        return AnimalCategory.MAMMAL;
    }
}
