import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Abstract method - has no body ie. implementation only a name and
//        return type. (also access modifier public)

        // We can not instantiate an ABSTRACT class into a 'new' object (copy
        // of that class

        // An abstract class contains one or more abstract methods
        // It can also contain many concrete methods
        ArrayList<CanAccelerate> myListOfAcceleratingThings = new ArrayList<>();
        Car myCar = new Car(200);
        CanAccelerate aCar = new Car(100);
        // Object with   Behaviour A, B and C matches Interfaces type that
        // defines A, B and C

//        CanFly myNewCar = new Car(200);
        // Eat animal = new Cricket()
//        Eat otherAnimal = new Bat()

        Dog dog = new Dog();
        Duck duck = new Duck();

        if(duck instanceof Animal){
            System.out.println("Is a Animal");
        }

        if(duck instanceof CanMakeSound){
            System.out.println("Implements CanMakeSound");
        }

        if(duck instanceof CanFly){
            System.out.println("Implements CanFly");
        }


        Dog newDog = new Dog();
        CanMakeSound makesSound = newDog;

        Duck newDuck = new Duck();
        CanFly flier = newDuck;
        makesSound = newDuck;

        Duck anotherDuck =  (Duck) flier;

    }

}
