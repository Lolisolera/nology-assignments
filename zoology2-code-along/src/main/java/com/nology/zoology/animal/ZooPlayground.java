package com.nology.zoology.animal;

public class ZooPlayground {

    public static void main(String[] args) {

        Animal tiger = new Tiger(2, "Tigress", 9);
        System.out.println(tiger.getInformation());
        tiger.makeSound();
    }
}


