package main.java.animal.core.living;

public interface Flyable extends Characteristic {

    default void fly() {
        System.out.println("I am flying.");
    }
}
