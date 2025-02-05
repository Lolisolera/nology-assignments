package com.nology.zoology.animal;

public class Crocodile extends Animal{
//
//    +++++++++++++
    public Crocodile(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Sssssssss");
    }

    @Override
    public String getInformation() {
        return String.format("Animal with ID: %d, is called %s, and is %d " +
                "years old", this.getId(), this.name, this.age);
    }
//    +++++++++++++



}
