package main.java.animal.core.living.bird.parrot;

import main.java.animal.core.living.bird.Parrot;
import main.java.animal.core.living.mammal.Dog;

public class ParrotLivingWithDogs extends Parrot {

    // Singleton instance so that no need to instantiate a new Dog instance everytime instantiate this class
    private static final Dog DOG_HOUSEMATE = new Dog();


    public ParrotLivingWithDogs() {
        learnVoice(DOG_HOUSEMATE);
    }
}
