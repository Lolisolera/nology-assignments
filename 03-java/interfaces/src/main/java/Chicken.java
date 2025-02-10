public class Chicken extends Animal implements CanMakeSound, CanFly {

    public Chicken() {
        setName("Chicken");
        setLegs(2);
    }

    @Override
    public AnimalType getType() {
        return AnimalType.BIRD;
    }

    @Override
    public void makeSound() {
        System.out.println("Cluck!");
    }

    @Override
    public void fly() {
        System.out.println("Flapping wings...");
    }
}

