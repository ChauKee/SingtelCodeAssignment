package main.java.animal.core.living.bird;

import main.java.animal.core.living.Swimmable;

public class Duck extends Bird implements Swimmable {

    @Override
    public  void say() {
        System.out.println("Quack, quack.");
    }

    @Override
    public void sing() {
        System.out.println("I cannot sing");
        throw new UnsupportedOperationException("I cannot sing");
    }
}
