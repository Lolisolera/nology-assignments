package org.example;

public class Dog {
    private String name;
    private int age;
    private String breed;

    // omitting

    public Dog(String name, int age) {
        // this refers to the object itself
        this.name = name;
        this.age = age;
    }

    public Dog(int age , String breed, String name) {
        this(name, age);
//        Dog(name, age)
        this.breed =  breed;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 1;
    }
}
