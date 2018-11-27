package main.java.animal.core.living;

public enum AnimalCharacteristic {

    CAPABLE_IMITATE_VOICE("capableImitateVoice", CapableImitateVoice.class, "imitate"),
    CRAWLABLE("crawlable", Crawlable.class, "crawl"),
    FLYABLE("flyable", Flyable.class, "fly"),
    HAS_GENDER("hasGender", HasGender.class, "getGender"),
    JUMPABLE("jumpable", Jumpable.class, "jump"),
    MOVEABLE("moveable", Moveable.class, "move"),
    MULTILINGUISTIC("multilinguistic", Multilinguistic.class, "sayInForeignLanguage"),
    SINGABLE("singable", Singable.class, "sing"),
    SPEAKABLE("speakable", Speakable.class, "say"),
    SWIMMABLE("swimmable", Swimmable.class, "swim"),
    UNDERGO_METAPMORPHOSIS("undergoMetamorphosis", UndergoMetamorphosis.class, "metamorphosis"),
    VOICE_PRODUCEABLE("voiceProduceable", VoiceProduceable.class, "voice"),
    WALKABLE("walkable", Walkable.class, "walk");

    private String name;
    private Class<? extends Characteristic> aClass;
    private String methodName;

    AnimalCharacteristic(String name, Class<? extends Characteristic> aClass, String methodName) {
        this.name = name;
        this.aClass = aClass;
        this.methodName = methodName;
    }

    public String getName() {
        return name;
    }

    public Class<? extends Characteristic> getCharacteristicClass() {
        return aClass;
    }

    public String getMethodName() {
        return methodName;
    }

    public static Class<? extends Characteristic> getCharacteristicClass(String name) {
        for (AnimalCharacteristic animalCharacteristic : values()) {
            if (animalCharacteristic.getName().equalsIgnoreCase(name)) {
                return animalCharacteristic.getCharacteristicClass();
            }
        }
        return null;
    }

    public static String getCharacteristicMethodName(Class<? extends Characteristic> aClass) {
        for (AnimalCharacteristic animalCharacteristic : values()) {
            // We can use == to compare class object since they are loaded by same classloader
            if (animalCharacteristic.getCharacteristicClass() == aClass) {
                return animalCharacteristic.getMethodName();
            }
        }
        return null;
    }
}









