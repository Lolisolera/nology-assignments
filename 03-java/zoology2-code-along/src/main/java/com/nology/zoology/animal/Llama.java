package com.nology.zoology.animal;

public class Llama extends Animal{
    public Llama(int id, String name, int age) {
        super(id, name, age);
    }


    @Override
    public void makeSound() {
        System.out.println("Hmmmmmmmmsssss");
    }


    @Override
    public String getInformation() {
        return String.format("Animal with ID: %d, is called %s, and is %d " +
                "years old", this.getId(), this.name, this.age);
    }
}
