package com.nology.zoology.animal;

public class AnimalUtils {

    private static int nextId = 0;

    // We want to be able to use this method without have to instantiate the
    // AnimalUtils class.
    public static int nextUniqueId() {
        return ++nextId;
    }
}
