public class Duck {
    public class Duck extends Animal implements CanMakeSound, CanFly {

        public Duck() {
            setName("Duck");
            setLegs(2);
        }

        @Override
        public AnimalType getType() {
            return AnimalType.BIRD;
        }

        @Override
        public void makeSound() {
            System.out.println("Quack!");
        }

        @Override
        public void fly() {
            System.out.println("Flying over the pond...");
        }
    }

}
