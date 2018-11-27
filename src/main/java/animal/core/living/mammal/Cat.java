package main.java.animal.core.living.mammal;

import main.java.animal.core.living.Speakable;
import main.java.animal.core.living.Walkable;

public class Cat extends Mammal implements Speakable, Walkable {

    @Override
    public void say() {
        System.out.println("Meow.");
    }

}
