package main.java.animal.core.living.bird;

public class Chicken extends Bird {

    @Override
    public void fly() {
        System.out.println("I cannot fly.");
        throw new UnsupportedOperationException("I cannot fly.");
    }

    @Override
    public void say() {
        System.out.println("“Cluck, cluck.");
    }

    @Override
    public void sing() {
        System.out.println("I cannot sing");
        throw new UnsupportedOperationException("I cannot sing");
    }

}
