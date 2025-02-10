public class Fish extends Animal {

    public Fish() {
        setName("Fish");
        setLegs(0);
    }

    @Override
    public AnimalType getType() {
        return AnimalType.FISH;
    }
}
