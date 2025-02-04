package com.nology.zoology.animal;

public class Tiger extends Animal {
    public Tiger(int id, String name, int age) {
        super(id, name, age);
    }

    // Methods unique to the class before inherited methods

    @Override
    public void makeSound() {
        System.out.println("Roaaarrs like a kitten");
    }


    @Override
    public String getInformation() {
        return String.format("Animal with ID: %d, is called %s, and is %d " +
                "years old", this.getId(), this.name, this.age);
    }
}
