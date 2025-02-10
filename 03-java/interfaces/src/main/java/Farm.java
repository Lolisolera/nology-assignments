package main;

import java.util.ArrayList;
import java.util.List;
import animals.Cow;
import animals.Dog;
import animals.Chicken;
import animals.Duck;
import animals.Butterfly;
import animals.Fish;
import animals.Animal;
import animals.CanMakeSound;
import animals.CanFly;

public class Farm {
    private List<Animal> animals;

    public Farm() {
        this.animals = new ArrayList<>();
        populateFarm();
    }

    private void populateFarm() {
        animals.add(new Cow());
        animals.add(new Chicken());
        animals.add(new Dog());
        animals.add(new Duck());
        animals.add(new Butterfly());
        animals.add(new Fish());
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<CanMakeSound> getAnimalsThatMakeSound() {
        List<CanMakeSound> soundMakers = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof CanMakeSound) {
                soundMakers.add((CanMakeSound) animal);
            }
        }
        return soundMakers;
    }

    public List<CanFly> getAnimalsThatFly() {
        List<CanFly> flyers = new ArrayList<>();
        for (Animal animal : animals) { // Fix: Iterate over Animal
            if (animal instanceof CanFly) {
                flyers.add((CanFly) animal);
            }
        }
        return flyers;
    }
}
