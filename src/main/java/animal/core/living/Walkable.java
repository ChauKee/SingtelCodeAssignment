package main.java.animal.core.living;

public interface Walkable extends Moveable {

    default void walk() {
        System.out.println("I am walking.");
    }

    @Override
    default void move() {
        walk();
    }
}
