package main.java.animal.core.living;

import main.java.animal.core.Living;

public abstract class Animal implements Moveable, Living {

    public abstract AnimalCategory getCategory();

}