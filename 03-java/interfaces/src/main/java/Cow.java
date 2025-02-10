
public class Cow extends Animal implements CanMakeSound {

    public Cow() {
        setName("Cow");
        setLegs(4);
    }

    @Override
    public AnimalType getType() {
        return AnimalType.MAMMAL;
    }

    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}

