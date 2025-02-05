package com.nology.zoology.command;

import com.nology.zoology.user.UserType;
import com.nology.zoology.zoo.Zoo;

import java.util.List;

public abstract class AnimalCommandRunner extends CommandRunner {

    protected Zoo zoo;
    protected UserType userType;

    public AnimalCommandRunner(String[] commands, Zoo zoo, UserType userType) {
        super(commands, "Animal");
        this.zoo = zoo;
        this.userType = userType;
    }

    protected void listAllAnimals() {
        printMessage("All animals in the zoo:");
        zoo.listAnimals();
    }

    @Override
    protected void beforeCommands() {
        // do nothing
    }

    @Override
    protected boolean handleUserSelection(int userSelection) {
        if( userSelection == this.commands.length ) {
            return false;
        }

        System.out.println("Performing user selection " + userSelection);
        switch (userSelection) {
            case 1:
                listAllAnimals();
                break;
        }

        return true;
    }

}
