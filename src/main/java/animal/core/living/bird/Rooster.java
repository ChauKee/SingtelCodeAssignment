package main.java.animal.core.living.bird;

import main.java.animal.core.living.Gender;
import main.java.animal.core.living.HasGender;

/**
 * A rooster is a male chicken
 */
public class Rooster extends Chicken implements HasGender {

    @Override
    public void say() {
        System.out.println("Cock-a-doodle-doo");
    }

    @Override
    public Gender getGender() {
        return Gender.MALE;
    }
}
