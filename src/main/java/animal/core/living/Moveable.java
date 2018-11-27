package main.java.animal.core.living;

public interface Moveable extends Characteristic {

    default void move() {
        System.out.println("I am moving.");
    }
}
