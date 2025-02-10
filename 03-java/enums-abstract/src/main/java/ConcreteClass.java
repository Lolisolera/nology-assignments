public class ConcreteClass extends AbstractClass2{

    public void doSomethingElse() {
        System.out.println("Do Something Else");
    }

    public void doSomething() {
        System.out.println("Do Something");
    }

    @Override
    public void nonAbstractMethod() {
        System.out.println("I am not OVERIWRITTEN abstract");
    }
}
