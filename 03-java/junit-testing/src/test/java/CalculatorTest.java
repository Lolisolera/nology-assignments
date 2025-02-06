import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
     void setUp() {
        calculator = new Calculator();
    }


//methodName_StateUnderTest_ExpectedBehaviour

    @Test
    @DisplayName("Two plus Three equals Five")
    void add_ValidInput_CorrectAnswer() {
        assertEquals(5, calculator.add(2, 3));
    }

}
