package com.nology.zoology;

import com.nology.zoology.animal.*;
import com.nology.zoology.animal.AnimalUtils;
import com.nology.zoology.command.UserCommandRunner;
import com.nology.zoology.zoo.Zoo;

import java.util.Random;

import static com.nology.zoology.animal.AnimalUtils.*;

public class ZooPlayground {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
//        Java intro to basics (variables, types, control flow, loops, arrays)
//        Abstraction
//        Encapsulation
//        Polymorphism pt.1

        Zoo myZoo = new Zoo();
//    NOT RANDOM
//        for (int i = 0; i < 2; i++) {
//            myZoo.addAnimal(new Lion(nextUniqueId(),
//                    generateName(), generateAge()));
//        }
//        for (int i = 0; i < 2; i++) {
//            myZoo.addAnimal(new Tiger(nextUniqueId(), generateName(), generateAge()));
//        }
//        for (int i = 0; i < 2; i++) {
//            myZoo.addAnimal(new Llama(nextUniqueId(), generateName(), generateAge()));
//        }
//RANDOM
        for(int i = 0; i < 13; i++) {
            switch (RANDOM.nextInt(4)) {
                case 0:
                    myZoo.addAnimal(new Lion(nextUniqueId(),
                            generateName(), generateAge()));
                    break;
                case 1:
                    myZoo.addAnimal(new Tiger(nextUniqueId(), generateName(), generateAge()));
                    break;
                case 2:
                    myZoo.addAnimal(new Llama(nextUniqueId(), generateName(), generateAge()));
                    break;
                case 3:
                    myZoo.addAnimal(new Crocodile(nextUniqueId(), generateName(),
                            generateAge()));
                    break;
            }
        }



        System.out.println(myZoo.getAnimalCount());

        UserCommandRunner userCommandRunner = new UserCommandRunner(myZoo);
        userCommandRunner.runCommands();

    }

}
