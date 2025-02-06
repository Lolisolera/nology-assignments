import com.nology.zoology.animal.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    // Declare the animal object to be used in the tests
    private Animal animal;

    @BeforeEach
    void setup() {
        // Initialize the animal object before each test
        animal = new Animal(1, "Josh", 44);
    }

    @Test
    void showsHunger_level() {
        // Assuming getHunger() returns the hunger level
        assertEquals(50, animal.getHunger());
    }

    @Test
    void getId_showsId_returns1() {
        // Test to check if the ID is 1
        assertEquals(1, animal.getId());
    }

    @Test
    void getName_showsName_returnsJosh() {
        // Test to check if the name is "Josh"
        assertEquals("Josh", animal.getName());
    }

    @Test
    void getAge_showsAge_returns44() {
        // Test to check if the age is 44
        assertEquals(44, animal.getAge());
    }
}
