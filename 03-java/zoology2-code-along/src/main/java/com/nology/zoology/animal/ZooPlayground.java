package com.nology.zoology.animal;

import com.nology.zoology.zoo.Zoo;

public class ZooPlayground {

    public static void main(String[] args) {
        System.out.println("HELLO");

//        Java intro to basics (variables, types, control flow, loops, arrays)
//        Abstraction
//        Encapsulation
//        Polymorphism pt.1

        Lion simba = new Lion(1, "Simba", 2);
        Llama kuzco = new Llama(2, "Kuzco", 5);
        Tiger tony = new Tiger(3, "Tony", 23);
        Crocodile krok = new Crocodile(4, "Krok", 7);

        System.out.println(simba.getInformation());
        System.out.println(kuzco.getInformation());
        System.out.println(tony.getInformation());
        System.out.println(krok.getInformation());

        String[] movies = {"Lion King", "Emperor's new groove", "The Jungle " +
                "Books"};

        System.out.println(movies.length);

        for (String movie : movies) {
            System.out.println(movie);
        }

        Zoo myZoo = new Zoo();

        for(int i = 0; i < 3; i++) {
            myZoo.addAnimal(tony);
        }

        for(int i = 0; i < 4; i++) {
            myZoo.addAnimal(kuzco);
        }

        for(int i = 0; i < 5; i++) {
            myZoo.addAnimal(krok);
        }

        System.out.println(myZoo.getAnimalCount());
        myZoo.listAnimals();


    }

}
