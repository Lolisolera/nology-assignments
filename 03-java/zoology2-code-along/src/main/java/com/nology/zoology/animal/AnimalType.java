package com.nology.zoology.animal;

public enum AnimalType {
    crocodile, lion, llama(true), tiger;
    boolean pettable = false;


    AnimalType() {
        this.pettable = false;
    }

    AnimalType(boolean pettable) {
        this.pettable = pettable;
    }

    public boolean isPettable() {
        return pettable;
    }
}
