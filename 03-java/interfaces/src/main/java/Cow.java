
public class Cow extends Animal implements CanMakeSound {

    @Override
    public AnimalType getType() {
        return AnimalType.cow;
    }
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}
