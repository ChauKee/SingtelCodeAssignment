package main.java.animal.core.living.bird.parrot;

import main.java.animal.core.living.bird.Parrot;
import main.java.animal.core.living.bird.Rooster;

public class ParrotLivingWithRoosters extends Parrot {

    // Singleton instance so that no need to instantiate a new Rooster instance everytime instantiate this class
    private static final Rooster ROOSTER_HOUSEMATE = new Rooster();

    public ParrotLivingWithRoosters() {
        learnVoice(ROOSTER_HOUSEMATE);
    }
}
