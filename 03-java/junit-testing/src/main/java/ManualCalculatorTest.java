public class ManualCalculatorTest {

    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        System.out.println(result);
        if( result != 7 ) {
           throw new Exception("This is wrong!");
        }
    }


}
