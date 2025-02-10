package com.nology.zoology.zoo;

import com.nology.zoology.animal.*;

import java.util.ArrayList;
import java.util.List;


public class Zoo {
    public Zoo() {
        System.out.println("Zoo starting up!");
    }

//    Arrays v. ArrayList<>
//    1. arrays are fixed size v. ArrayList are resizable dynamically (it can
//    grow to any size needed)
//      2. array can hold primitives and objects v. ArrayList<> can only hold
//      objects (Integer not int / Boolean not boolean etc)
// array.length => arrayList.size()
// array[i] = value => arrayList.add(value)

    private final ArrayList<Animal> animals = new ArrayList<>();

//Polymorphism - Method overloading
    public void addAnimal(Tiger tiger) {
        this.animals.add(tiger);
    }

    public void addAnimal(Crocodile croc) {
        this.animals.add(croc);
    }

    public void addAnimal(Llama llama) {
        this.animals.add(llama);
    }

    public void addAnimal(Lion lion) {
        this.animals.add(lion);
    }

    public int getAnimalCount() {
        return this.animals.size();
    }

    public void listAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getInformation());
        }
    }


    public List<Animal> getAllAnimals() {
        return this.animals;
    }


    public void shutdownZoo() {
        System.out.println("Zoo shutdown");
    }


}
