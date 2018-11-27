package main.java.animal.core.living;

public interface Speakable extends VoiceProduceable {

    default void say() {
        System.out.println("I can speak.");
    }

    @Override
    default void voice() {
        say();
    }

}
