package main.java.animal.core.living;

import java.util.Map;

/**
 * Marker interface that an object is able to speak in multiple languages
 */
public interface Multilinguistic extends Speakable {

    void sayInForeignLanguage();

    void sayInForeignLanguage(String targetForeignLanguage);

    void setTranslation(Map<String, String> translation);

}
