public class Dog extends Animal implements CanMakeSound {

    public Dog() {
        setName("Dog");
        setLegs(4);
    }

    @Override
    public AnimalType getType() {
        return AnimalType.MAMMAL;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

