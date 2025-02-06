package com.nology.zoology.animal;

import java.util.ArrayList;
import java.util.Random;

public class AnimalUtils {
//1. Animal utilities
//
//    In the"AnimalUtils"class
//    add a"static"
//    ArrayList to hold possible animal names
//    populate the list in a"static"block - see examples
//    add method generateName() to return a random name from the list
//    add method generateAge() to return a random age"between"1 and 15
//
//
//    In the main method of the"ZooPlayground"class:
//    modify how the animals are created using the new AnimalUtil methods
//😃 this should simplify the process
//    Extension
//    Using the new methods can you generate a"random"number of animals for the zoo
    private static int nextId = 0;
    private static final Random RANDOM = new Random();
    private static ArrayList<String> names = new ArrayList<>();


    // We want to be able to use this method without have to instantiate the
    // AnimalUtils class.
    public static int nextUniqueId() {
        return ++nextId;
    }

    public static String generateName() {
        return names.get(RANDOM.nextInt(names.size()));
    }

    public static int generateAge() {
        return 1 + RANDOM.nextInt(15);
    }

    static {
        names.add("Abbie");
        names.add("Kuzco");
        names.add("Tony");
        names.add("Krok");
        names.add("Alfred");
        names.add("Beth");
        names.add("Bob");
        names.add("Bonzo");
        names.add("Butch");
        names.add("Charlotte");
        names.add("Clyde");
        names.add("Ermintrude");
        names.add("Eve");
        names.add("Florence");
        names.add("Fluffy");
        names.add("Freddie");
        names.add("Grumpy");
        names.add("Holly");
        names.add("Kate");
        names.add("Knuckles");
        names.add("Lauren");
        names.add("Leo");
        names.add("Maisie");
        names.add("Max");
        names.add("Nigel");
        names.add("Rex");
        names.add("Roger");
        names.add("Scoobie");
        names.add("Spangle");
        names.add("Star");
        names.add("Sydney");
        names.add("Tiddles");
    }
}
