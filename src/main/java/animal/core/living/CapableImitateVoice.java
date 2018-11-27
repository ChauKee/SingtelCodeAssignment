package main.java.animal.core.living;

public interface CapableImitateVoice extends Characteristic {

    void imitate();

    void learnVoice(VoiceProduceable... learningSource);

}
