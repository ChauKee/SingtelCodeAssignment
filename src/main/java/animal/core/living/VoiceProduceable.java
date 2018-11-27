package main.java.animal.core.living;

public interface VoiceProduceable extends Characteristic {

    default void voice() {
        System.out.println("I can produce voice.");
    }

}
