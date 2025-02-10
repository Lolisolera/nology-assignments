package com.nology.zoology.command;

import com.nology.zoology.animal.Animal;
import com.nology.zoology.zoo.Zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Command runner for a single {@link Animal}.
 */
public abstract class SingleAnimalCommandRunner extends CommandRunner {

    protected Zoo zoo;
    protected Animal animal;

    public SingleAnimalCommandRunner(String[] commands,  Zoo zoo, Animal animal) {
        super(commands, "Animal");
        this.zoo = zoo;
        this.animal = animal;
    }

    protected void listAllAnimals() {
        printMessage("All animals in the zoo:");
        this.zoo.listAnimals();
    }

    protected void feedAnimal() {
        animal.feed();
    }

    protected void selectAnimalIfMissing() {
        if (this.animal == null) {
            this.animal = selectAnimal();
        }
    }

    protected void switchAnimal() {
        this.animal = selectAnimal();
    }

    private Animal selectAnimal() {
        Animal selected = null;
        while(true) {
            listAllAnimals();
            List<Animal> animalsToSearch = zoo.getAllAnimals();
            String idOrName = readStringInput("Enter the id or name for the animal:");
            Animal found = null;
            try {
                int id = Integer.valueOf( idOrName );
                Optional<Animal> animalById = findAnimalById(animalsToSearch, id);
                if( animalById.isPresent() ) {
                    selected = animalById.get();
                    break;
                }
            } catch (NumberFormatException e) {
                List<Animal> animalsByName = findAnimalsByName( animalsToSearch, idOrName );
                if (animalsByName.size() == 1) {
                    selected = animalsByName.get(0);
                    break;
                }
                printMessage("Oh no, there's more than one animal with the name " + idOrName + ", please use the id.");
            }
        }
        if (selected != null) {
            printMessage(String.format("You have selected %s (%d), %s", selected.getName(), selected.getId(), selected.getInformation()));
        }
        return selected;
    }

    /**
     * Find animal with given id.
     * @param animals
     * @param id
     * @return
     */
    private Optional<Animal> findAnimalById(List<Animal> animals, int id) {
        for (Animal animal1 : animals) {
            if( animal1.getId() == id ) {
                return Optional.of(animal1);
            }
        }
        return Optional.empty();
    }

    /**
     * Find all animals with the given name.
     * @param animals
     * @param name
     * @return
     */
    private List<Animal> findAnimalsByName(List<Animal> animals, String name) {
        List<Animal> results = new ArrayList<>();
        for (Animal animal1 : animals) {
            if( animal1.getName().equalsIgnoreCase(name) ) {
                results.add( animal1 );
            }
        }
        return results;
    }

    @Override
    protected void beforeCommands() {
        selectAnimalIfMissing();
    }

    @Override
    protected boolean handleUserSelection(int userSelection) {
        if( userSelection == this.commands.length ) {
            return false;
        }

        System.out.println("Performing user selection " + userSelection);
        switch (userSelection) {
            case 1:
                feedAnimal();
                break;
            case 2:
                switchAnimal();
                break;
        }

        return true;
    }

}
