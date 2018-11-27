package main.java.animal.core.living;

public interface Singable extends Speakable {

    default void sing() {
        System.out.println("I am singing.");
    }

}
