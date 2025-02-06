package com.nology.zoology.animal;
//Lion inherits everything from Animal because
// Lion IS-A Animal

public class Lion extends Animal {
    public boolean hasPack;

    public Lion(int id, String name, int age) {
        // super is referencing the parent class
        super(id, name, age);
        this.hasPack = true;
    }


    @Override
    public String getInformation() {
        return String.format("Animal with ID: %d, is called %s, and is %d " +
                "years old", this.getId(), this.name, this.age);
    }

    @Override
    public void makeSound() {
        System.out.println("Rooaaaaaarrrr!!!!!");
    }
}
