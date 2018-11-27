package main.java.animal.core.living;

/**
 * jumping is a kind of walking style on land
 */
public interface Jumpable extends Walkable {

    default void jump() {
        System.out.println("I am jumping.");
    }

    @Override
    default void walk() {
        jump();
    }

}
