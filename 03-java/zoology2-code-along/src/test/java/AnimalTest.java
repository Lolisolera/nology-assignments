import com.nology.zoology.animal.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

//getter tests:  id, name, age and hunger level

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

    @Test
    void getHunger_level() {
        assertEquals(50, animal.getHunger()); // 50 is the default hunger level
    }


    //setter tests: age, id and name

    @Test
    void setAge_updatesAge_returns30() {
        animal.setAge(30); // Change the age
        assertEquals(30, animal.getAge()); //check if age is updated
    }

    @Test
    void setId_updatesId_returns2() {
        animal.setId(2); // Change the ID
        assertEquals(2, animal.getId()); // Check if ID is updated
    }

    @Test
    void setName_updatesName_returnsSimba() {
        animal.setName("Simba"); // Change the name
        assertEquals("Simba", animal.getName()); // Check if name is updated
    }


    //Hunger tests

    @Test
    void getHunger_returnsDefaultHungerLevel() {
        assertEquals((short) 50, animal.getHunger()); // Cast to short
    }

    @Test
    void isHungry_whenHungerAbove30_returnsTrue() {
        animal.setHunger((short) 40); // Cast to short
        assertTrue(animal.isHungry());
    }

    @Test
    void isHungry_whenHungerBelow30_returnsFalse() {
        animal.setHunger((short) 20);
        assertFalse(animal.isHungry());
    }

    @Test
    void feed_reducesHungerBy20() {
        animal.setHunger((short) 50);
        animal.feed();
        assertEquals((short) 30, animal.getHunger());
    }

    @Test
    void feed_doesNotReduceHungerBelow0() {
        animal.setHunger((short) 10);
        animal.feed();
        assertEquals((short) 0, animal.getHunger());
    }



}



