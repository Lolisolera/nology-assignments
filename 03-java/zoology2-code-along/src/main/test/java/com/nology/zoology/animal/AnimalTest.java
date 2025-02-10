package com.nology.zoology.animal;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//Animal JUnit test
//
//Create a new test class for Animal, use IntelliJ to create the test class. In the AnimalTest class
//create some constants to represent animal test data
//                use a @BeforeEach to create an Animal object to test
//add tests for the id getters and setters
//add tests for the getHunger(), isHungry() and feed() methods
//add tests for the name and age getters and setters
//
//Should we be writing tests for Tiger, Llama and the res

class AnimalTest {
    private static final int ANIMAL_ID = 99;
    private static final String ANIMAL_NAME = "Jonny";
    private static final int ANIMAL_AGE = 2;
    private static int HUNGER = 50;

    private Animal animal;

    public AnimalTest() {
        System.out.println("Creating a new AnimalTest!");
    }



    @BeforeEach
    void setUp() {
        System.out.println("Creating a new Animal");
        this.animal = new Animal(ANIMAL_ID, ANIMAL_NAME, ANIMAL_AGE);
    }

    @AfterEach
    void tidyUp(){
        System.out.println("Cleaning up after animal... ");
    }

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Should run once before any testing begins");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("Tests have concluded!!! :)");
    }

    @Test
    @DisplayName("Get ID returns the correct ID")
    void getId_ValidData_ReturnId() {
        assertEquals(ANIMAL_ID, animal.getId());
    }


    @Test
    @DisplayName("getHunger should return the correct level of hunger")
    void getHunger_ValidData_ReturnCorrectHungerLevel() {
        assertEquals(HUNGER, animal.getHunger());
    }

    @Test
    @DisplayName("setHunger should set the hunger to the correct level")
    void setHunger_HungerSetTo20_ReturnVoid () {
        animal.setHunger((short) 20);
        assertEquals(20, animal.getHunger());
    }

    @Test
    @DisplayName("When Hunger is 25, animal should not be hungry")
    void isHungry_Hunger25_ReturnsFalse() {
        animal.setHunger((short) 25);
        assertFalse(animal.isHungry());
    }


    @Test
    @DisplayName("When Hunger is 50, animal should be hungry")
    void isHungry_Hunger50_ReturnsTrue() {
        animal.setHunger((short) 50);
        assertTrue(animal.isHungry());
    }

    @Test
    @DisplayName("Feed should reduce hunger")
    void feed_NoInputs_ReducesHunger() {
        animal.feed();
        assertEquals(40, animal.getHunger());
    }
}
