package main.java.animal.core.living.bird.parrot;

import main.java.animal.core.living.bird.Parrot;
import main.java.animal.core.living.mammal.Cat;

public class ParrotLivingWithCat extends Parrot {

    // Singleton instance so that no need to instantiate a new Cat instance everytime instantiate this class
    private static final Cat CAT_HOUSEMATE = new Cat();

    public ParrotLivingWithCat() {
        learnVoice(CAT_HOUSEMATE);
    }

}
