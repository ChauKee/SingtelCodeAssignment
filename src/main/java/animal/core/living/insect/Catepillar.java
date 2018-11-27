package main.java.animal.core.living.insect;

import main.java.animal.core.living.Crawlable;
import main.java.animal.core.living.UndergoMetamorphosis;
import main.java.animal.core.living.Animal;

public class Catepillar extends Insect implements Crawlable, UndergoMetamorphosis<Butterfly> {

    @Override
    public Butterfly metamorphosis() {
        System.out.println("I undergo metamorphosis and become butterfly.");
        return new Butterfly();
    }

}
