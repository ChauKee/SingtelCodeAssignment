package main.java.animal.core.living.bird.parrot;

import main.java.animal.core.living.bird.Parrot;
import main.java.animal.core.nonliving.Phone;

public class ParrotLivingWithPhone extends Parrot {

    // Singleton instance so that no need to instantiate a new Phone instance everytime instantiate this class
    private static final Phone PARROT_PHONE = new Phone();


    public ParrotLivingWithPhone() {
        learnVoice(PARROT_PHONE);
    }
}
