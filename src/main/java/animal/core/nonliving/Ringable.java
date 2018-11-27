package main.java.animal.core.nonliving;

import main.java.animal.core.living.VoiceProduceable;

public interface Ringable extends VoiceProduceable {

    default void ring() {
        System.out.println("Ring, ring, ring.");
    }

    @Override
    default void voice() {
        ring();
    }

}
