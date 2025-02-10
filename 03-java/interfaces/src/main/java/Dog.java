public class Dog extends Animal implements CanMakeSound {

    public AnimalType getType() {
        return AnimalType.dog;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
