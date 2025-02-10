package com.nology.zoology.command;

import com.nology.zoology.animal.Animal;
import com.nology.zoology.zoo.Zoo;

/**
 * Command runner for a single {@link Animal}.
 */
public class VisitorSingleAnimalCommandRunner extends SingleAnimalCommandRunner {

    private static final String[] SINGLE_ANIMAL_COMMANDS = {
            "Visit another animal",
            "Back"
    };

    public VisitorSingleAnimalCommandRunner(Zoo zoo, Animal animal) {
        super(SINGLE_ANIMAL_COMMANDS, zoo, animal);
        this.zoo = zoo;
        this.animal = animal;
    }

    @Override
    protected boolean handleUserSelection(int userSelection) {
        if( userSelection == this.commands.length ) {
            return false;
        }

        System.out.println("Performing user selection " + userSelection);
        switch (userSelection) {
            case 1:
                switchAnimal();
                break;
        }

        return true;
    }

}
