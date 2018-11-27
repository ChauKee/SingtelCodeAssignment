package main.java.animal.web.service;

import main.java.animal.core.living.Animal;
import main.java.animal.core.living.AnimalCategory;

import java.util.Collection;

public interface AnimalQueryService {

    Collection<Animal> queryByCategory(AnimalCategory category);

    Collection<Animal> queryByCharacteristic(Collection<String> characteristicNames);

}
