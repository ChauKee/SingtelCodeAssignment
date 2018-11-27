package main.java.animal.core.living.bird.parrot;

import main.java.animal.core.living.bird.Duck;
import main.java.animal.core.living.bird.Parrot;

public class ParrotLivingWithDucks extends Parrot {

    // Singleton instance so that no need to instantiate a new Duck instance everytime instantiate this class
    private static final Duck DUCK_HOUSEMATE = new Duck();


    public ParrotLivingWithDucks() {
        learnVoice(DUCK_HOUSEMATE);
    }
}
