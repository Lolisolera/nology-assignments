package com.nology.zoology.animal;

public class Animal {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getSpecies() {
        return "Unknown species";
    }

    public String getInformation() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
