package com.nology.zoology.animal;

public class Tiger extends Animal {

    public Tiger(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void makeSound() { // Return type should be void
        System.out.println("Roar!"); // Corrected typo
    }
}

