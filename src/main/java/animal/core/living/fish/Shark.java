package main.java.animal.core.living.fish;

public class Shark extends Fish {

    public Shark() {
        this.color = "grey";
        this.size = "large";
    }

    void eatOtherFish() {
        System.out.println("I eat other fish.");
    }
}
