package main.java.animal.core.living.insect;

import main.java.animal.core.living.Animal;
import main.java.animal.core.living.AnimalCategory;

public class Insect extends Animal {

    @Override
    public AnimalCategory getCategory() {
        return AnimalCategory.INSECT;
    }
}
