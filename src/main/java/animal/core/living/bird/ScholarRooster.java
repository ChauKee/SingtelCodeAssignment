package main.java.animal.core.living.bird;

import main.java.animal.core.living.Multilinguistic;

import java.util.HashMap;
import java.util.Map;

/**
 * This genius scholar rooster used to be studying overseas
 * and thus can speak in multiple languages that he knows
 */
public class ScholarRooster extends Chicken implements Multilinguistic {

    public static final String FAVORED_FOREIGN_LANGUAGE = "Japanese";

    private Map<String, String> translation;

    public ScholarRooster() {
        Map<String, String> translation = new HashMap<>();
        translation.put("Danish", "kykyliky");
        translation.put("Dutch", "kukeleku");
        translation.put("Finnish", "kukko kiekuu");
        translation.put("French", "cocorico");
        translation.put("German", "kikeriki");
        translation.put("Greek", "kikiriki");
        translation.put("Hebrew", "coo-koo-ri-koo");
        translation.put("Hungarian", "kukuriku");
        translation.put("Italian", "chicchirichi");
        translation.put("Japanese", "ko-ke-kok-ko-o");
        translation.put("Portuguese", "cucurucu");
        translation.put("Russian", "kukareku");
        translation.put("Swedish", "kuckeliku");
        translation.put("Turkish", "kuk-kurri-kuuu");
        translation.put("Urdu", "kuklooku");
        setTranslation(translation);
    }

    @Override
    public void sayInForeignLanguage() {
        sayInForeignLanguage(null);
    }

    @Override
    public void sayInForeignLanguage(String targetForeignLanguage) {
        if (targetForeignLanguage != null && !targetForeignLanguage.isEmpty()) {
            String wordInForeignLanguage = translation.get(targetForeignLanguage);
            if (wordInForeignLanguage == null)
                System.out.println("I have never learned to speak in the target foreign language.");
            else
                System.out.println(wordInForeignLanguage);
        } else {
            System.out.println(this.translation.get(FAVORED_FOREIGN_LANGUAGE));
        }
    }

    @Override
    public void setTranslation(Map<String, String> translation) {
        this.translation = translation;
    }

}
