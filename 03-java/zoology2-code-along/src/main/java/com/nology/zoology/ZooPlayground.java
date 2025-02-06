package com.nology.zoology;
import com.nology.zoology.command.UserCommandRunner;
import com.nology.zoology.zoo.Zoo;
import java.util.Random;
import static com.nology.zoology.zoo.ZooUtils.*;

public class ZooPlayground {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
//        Java intro to basics (variables, types, control flow, loops, arrays)
//        Abstraction
//        Encapsulation
//        Polymorphism pt.1

        Zoo myZoo = new Zoo();

       setZooAnimalCreationMethod();
       populateZoo(myZoo);

        System.out.println(myZoo.getAnimalCount());

        UserCommandRunner userCommandRunner = new UserCommandRunner(myZoo);
        userCommandRunner.runCommands();

    }

}
