public class Butterfly {
    public class Butterfly extends Animal implements CanFly {

        public Butterfly() {
            setName("Butterfly");
            setLegs(6);
        }

        @Override
        public AnimalType getType() {
            return AnimalType.INSECT;
        }

        @Override
        public void fly() {
            System.out.println("Flutters gracefully...");
        }
    }

}
