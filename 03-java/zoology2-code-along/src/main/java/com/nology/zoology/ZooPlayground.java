package com.nology.zoology;
import com.nology.zoology.animal.AnimalUtils;
import com.nology.zoology.animal.Crocodile;
import com.nology.zoology.animal.Llama;
import com.nology.zoology.command.UserCommandRunner;
import com.nology.zoology.zoo.Zoo;
import com.nology.zoology.zoo.ZooUtils;

import java.util.Random;
import static com.nology.zoology.zoo.ZooUtils.*;

public class ZooPlayground {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
//        Java intro to basics (variables, types, control flow, loops, arrays)
//        Abstraction
//        Encapsulation
//        Polymorphism pt.1

        Crocodile myCroc = new Crocodile(AnimalUtils.nextUniqueId(),
                AnimalUtils.generateName(),AnimalUtils.generateAge());

        Llama lla = new Llama(AnimalUtils.nextUniqueId(),
                AnimalUtils.generateName(),AnimalUtils.generateAge());

        System.out.println(myCroc.getType().isPettable());
        System.out.println(lla.getType().isPettable());



        Zoo myZoo = new Zoo();

       setZooAnimalCreationMethod();
       populateZoo(myZoo);

        System.out.println(myZoo.getAnimalCount());

        UserCommandRunner userCommandRunner = new UserCommandRunner(myZoo);
        userCommandRunner.runCommands();

    }

}
