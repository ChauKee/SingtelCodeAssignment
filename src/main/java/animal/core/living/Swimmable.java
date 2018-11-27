package main.java.animal.core.living;

public interface Swimmable extends Characteristic {

    default void swim() {
        System.out.println("I can swim.");
    }
}
