package com.nology.zoology.zoo;

import com.nology.zoology.animal.Crocodile;
import com.nology.zoology.animal.Lion;
import com.nology.zoology.animal.Llama;
import com.nology.zoology.animal.Tiger;

import java.util.Random;
import java.util.Scanner;

import static com.nology.zoology.animal.AnimalUtils.*;
import static com.nology.zoology.animal.AnimalUtils.generateAge;

public class ZooUtils {
    private static int maxLions;
    private static int maxLlamas;
    private static int maxTigers;
    private static int maxCrocodiles;
    private static int maxZooSize;
    private static boolean isRandom;

    public static int getMaxLions() {
        return maxLions;
    }

    public static int getMaxLlamas() {
        return maxLlamas;
    }

    public static int getMaxTigers() {
        return maxTigers;
    }

    public static int getMaxCrocodiles() {
        return maxCrocodiles;
    }

    public static int getMaxZooSize() {
        return maxZooSize;
    }

    public static boolean isRandom() {
        return isRandom;
    }

    public static void setIsRandom(boolean isRandom) {
        ZooUtils.isRandom = isRandom;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void setZooAnimalCreationMethod() {
        System.out.println("Do you want a specific number for each animal? (Y" +
                " / N)");
        String userInput = scanner.nextLine().toUpperCase();

        if(userInput.equals("N")) {
            setIsRandom(true);
            setRandomAnimalCount();
        } else if (userInput.equals("Y")) {
            setManualAnimalCount();
        } else {
            System.out.println( "This choice is not valid");
        }
        System.out.println( "Your zoo has been populated");
    }

    private static void setRandomAnimalCount() {
        System.out.println("How many animals would like in the zoo?");
        maxZooSize = scanner.nextInt();
        scanner.nextLine();
    }

    private static void setManualAnimalCount() {
        System.out.println("How many crocs would you like in the zoo?");
        maxCrocodiles = scanner.nextInt();
        System.out.println("How many lions would you like in the zoo?");
        maxLions = scanner.nextInt();
        System.out.println("How many llamas would you like in the zoo?");
        maxLlamas = scanner.nextInt();
        System.out.println("How many tigers would you like in the zoo?");
        maxTigers = scanner.nextInt();
    }
    
    public static void populateZoo(Zoo zoo){
        Random RANDOM = new Random();
        if (isRandom()) {
            for (int i = 0; i < getMaxZooSize(); i++) {
                switch (RANDOM.nextInt(4)) {
                    case 0:
                        zoo.addAnimal(new Lion(nextUniqueId(),
                                generateName(), generateAge()));
                        break;
                    case 1:
                        zoo.addAnimal(new Tiger(nextUniqueId(), generateName(), generateAge()));
                        break;
                    case 2:
                        zoo.addAnimal(new Llama(nextUniqueId(), generateName(), generateAge()));
                        break;
                    case 3:
                        zoo.addAnimal(new Crocodile(nextUniqueId(), generateName(),
                                generateAge()));
                        break;
                }
            }
        } else {
            for (int i = 0; i < getMaxLions(); i++) {
                zoo.addAnimal(new Lion(nextUniqueId(),
                        generateName(), generateAge()));
            }
            for (int i = 0; i < getMaxTigers(); i++) {
                zoo.addAnimal(new Tiger(nextUniqueId(), generateName(), generateAge()));
            }
            for (int i = 0; i < getMaxLlamas(); i++) {
                zoo.addAnimal(new Llama(nextUniqueId(), generateName(), generateAge()));
            }
            for (int i = 0; i < getMaxCrocodiles(); i++) {
                zoo.addAnimal(new Crocodile(nextUniqueId(), generateName(),
                        generateAge()));
            }
        }
    }
}
