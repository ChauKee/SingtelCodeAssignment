package main.java.animal.web.controller;

import main.java.animal.core.living.Animal;
import main.java.animal.core.living.AnimalCategory;
import main.java.animal.core.living.AnimalCharacteristic;
import main.java.animal.core.living.Characteristic;
import main.java.animal.web.service.AnimalQueryService;

import java.util.*;

/**
 * We can use Spring MVC package or servlet 3.1 package to build up
 * this controller as part of MVC pattern implementation
 */
//@Controller("/animal")
public class AnimalController {

    // Perform dependency injection in a inversion of control container
    // @Inject
    // @Autowired
    private AnimalQueryService animalQueryService;

    // Return type can be Spring ResponseEntity<Collection<Animal>
    // Get category from Request Param of HTTP.GET or @PathVariable
    //@RequestMapping("/category/{category}"
    public Collection<Animal> getAnimalByCategory(String category) {
        AnimalCategory animalCategory;
        if (category != null && !category.isEmpty()) {
            animalCategory = AnimalCategory.getCategory(category);
            if (animalCategory == null)
                throw new IllegalArgumentException("Return HttpStatus 401 - Bad Request");
            return animalQueryService.queryByCategory(animalCategory);
        }
        // if null or empty string passed in, then we treat it as null
        return animalQueryService.queryByCategory(null);
    }

    //@RequestMapping("/{category}"
    public Collection<Animal> getAnimalByCharacteristic(String[] characteristic) {
        if (characteristic == null || characteristic.length == 0) return Collections.emptyList();
//        List<Class<? extends Characteristic>> characteristicClasses = new ArrayList<>();
//        Class<? extends Characteristic> matched;
//        for (String characteristicName : characteristic) {
//            matched = AnimalCharacteristic.getCharacteristicClass(characteristicName);
//            // Omit those invalid passed in characteristic names
//            if (matched != null) characteristicClasses.add(matched);
//        }
        return animalQueryService.queryByCharacteristic(Arrays.asList(characteristic));
    }

}
