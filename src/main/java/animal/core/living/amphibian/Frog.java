package main.java.animal.core.living.amphibian;

import main.java.animal.core.living.Jumpable;
import main.java.animal.core.living.Speakable;

public class Frog extends Amphibian implements Speakable, Jumpable {

    @Override
    public void say() {
        System.out.println("Kuak, kuak, kuak.");
    }
}
