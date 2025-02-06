public class Main {

    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 5);
        System.out.println(result);
        if( result != 7 ) {
            System.out.println("Not correct");
        }
    }
}
