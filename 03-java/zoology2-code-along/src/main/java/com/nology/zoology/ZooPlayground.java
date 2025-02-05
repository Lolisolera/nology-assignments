package com.nology.zoology;

import com.nology.zoology.animal.*;
import com.nology.zoology.command.UserCommandRunner;
import com.nology.zoology.user.User;
import com.nology.zoology.zoo.Zoo;

public class ZooPlayground {

    public static void main(String[] args) {
        System.out.println("HELLO");

//        Java intro to basics (variables, types, control flow, loops, arrays)
//        Abstraction
//        Encapsulation
//        Polymorphism pt.1

        Lion simba = new Lion(AnimalUtils.nextUniqueId(), "Simba", 2, true);
        Llama kuzco = new Llama(2, "Kuzco", 5);
        Tiger tony = new Tiger(3, "Tony", 23);
        Crocodile krok = new Crocodile(4, "Krok", 7);

        Zoo myZoo = new Zoo();

        for (int i = 0; i < 3; i++) {
            myZoo.addAnimal(tony);
        }

        for (int i = 0; i < 4; i++) {
            myZoo.addAnimal(kuzco);
        }

        for (int i = 0; i < 5; i++) {
            myZoo.addAnimal(krok);
        }

        System.out.println(myZoo.getAnimalCount());

        UserCommandRunner userCommandRunner = new UserCommandRunner(myZoo);
        userCommandRunner.runCommands();

    }

}
