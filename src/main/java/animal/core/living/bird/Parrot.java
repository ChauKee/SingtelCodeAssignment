package main.java.animal.core.living.bird;

import main.java.animal.core.living.CapableImitateVoice;
import main.java.animal.core.living.VoiceProduceable;

import java.util.HashSet;
import java.util.Set;

public class Parrot extends Bird implements CapableImitateVoice {

    private Set<VoiceProduceable> learningSources = new HashSet<>();

    private Object mutex = new Object();

    @Override
    public void imitate() {
        if (learningSources.isEmpty())
            System.out.println("I can only squawk. I have not learned from any external voice producing party yet.");
        synchronized (mutex) {
            for (VoiceProduceable learningSource : learningSources) {
                learningSource.voice();
            }
        }
    }

    @Override
    public void learnVoice(VoiceProduceable... learningSources) {
        synchronized (mutex) {
            for (VoiceProduceable learningSource : learningSources) {
                this.learningSources.add(learningSource);
            }
        }
    }

    @Override
    public void say() {
        imitate();
    }

    @Override
    public void voice() {
        say();
    }
}
