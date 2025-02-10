public class Car extends Vehicle implements CanAccelerate {
    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void accelerate() {
        this.maxSpeed += 10;
    }

    //    Behaviour A
//    Behaviour B
//    Behaviour C
}
