package main.java.animal.core.living;

public enum AnimalCategory {

    MAMMAL("mammal"), BIRD("bird"), FISH("fish"), INSECT("insect"), AMPHIBIAN("amphibian");

    private String name;

    AnimalCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static AnimalCategory getCategory(String name) {
        for (AnimalCategory category : values()) {
            if (category.getName().equalsIgnoreCase(name))
                return category;
        }
        return null;
    }

}
