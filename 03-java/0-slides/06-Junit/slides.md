<!-- _class: lead -->

# JUnit

---

<!-- _class: objectives -->

## Learning objectives

- Why do we test - recap
- What is JUnit?
- Testing with JUnit

---

<!-- _class: mind-map -->

## Recap

![w:280](./assets/images/java-logo.png)

- Static methods
- Utility classes
- Static variables
- Constants
- Instance vs Static
- `Math`

---

<!-- _class: mind-map -->

## Why test?

- Confidence in code
- Documentation
- Deployments/Pipeline
- E2E Testing
- Integration Testing
- Unit Testing

![w:560](./assets/images/junit-testing-img.png)

---

<!-- _class: thought-box -->

## What is JUnit?

<div class="grid">

<article>

- Simple but powerful testing framework written in Java
- Designed to do the heavy lifting when writing unit tests
- It's been around since 1990s, the first of the XUnit frameworks.
- Allows writing of _simple_, repeatable tests for a single class
- Mimics typical development and testing when coding
- Tests for a class are gathered together into a test class.

<br/>

</article>

<div width="100%";>

```java

class CalculatorTest {

    private Calculator target;

    @BeforeEach
    void setUp() {
        target = new Calculator();
    }

    @Test
    void add_ValidInput_CorrectAnswer() {
        int result = target.add( 2, 5);
        assertEquals(7, result);
    }

}

```

</div>
</div>

Each method will test the class using **Annotations** the framework provides 🧪

---

## JUnit Annotation reference

A list of common `Annotations` used with JUnit.

| Annotation     | Description                                          |
| -------------- | ---------------------------------------------------- |
| `@Test`        | A method that performs a test                        |
| `@BeforeEach`  | Will be called before each test                      |
| `@AfterEach`   | Will be called after each test                       |
| `@BeforeAll`   | Will be called before any tests                      |
| `@AfterAll`    | Will be called after all tests have run              |
| `@DisplayName` | Displays a message instead of method name in results |
| `@Disabled`    | Method will be ignored in test run                   |

---

## Writing a JUnit test

- Name of test class is typically target class with Test appended
- Test class should be in same package as target class
- Use @Test to indicate a test method
- Test method name should be 'method_StateUnderTest_ExpectedBehaviour'

---

## Assertions

- Assertions are used to check whether the test succeeded or failed
- Perform the test action and then check the result
- If assertion **fails** then JUnit throws an exception and fails the test

<br/>

| Assertion         | Description                                 |
| ----------------- | ------------------------------------------- |
| `assertTrue()`    | Is the result true?                         |
| `assertFalse()`   | Is the result false?                        |
| `assertNotNull()` | Is the result not null?                     |
| `assertNull()`    | Is the result null?                         |
| `assertEquals()`  | Is the result equal to the expected result? |
| `fail()`          | Has the test failed?                        |

---

## What to test

- Treat the target class as a **black box** most of the time
- Only test the public methods
- Test as much as is needed - and no more!
- Typically don't test
  - getters
  - setters - unless have guard conditions
  - toString()
- Test for **positive** outcomes - success - _and_ **negative** outcomes - failure
- A naming convention:

  `methodName_StateUnderTest_ExpectedBehaviour`

---

<!-- _class: activity -->

## Challenge

<div class="grid" >
<article>

Write a test for the `Film` class, to determine the method `isAllowedToView()` works correctly.

You will need to create test data for each of the film categories.

🤞 Remember to add both positive and negative tests.

For example:

```java

    @Test
    void isAllowedToView_18FilmValidAge_ReturnsTrue() {
        assertTrue( film18.isAllowedToView(18 ));
    }
    @Test
    void isAllowedToView_18FilmInvalidAge_ReturnsFalse() {
        assertFalse( film18.isAllowedToView( 17 );

        // any other ages to check ??
    }

```

</article>

<article class="flex" >

![w:480](./assets/images/film-spooling-bar.jpg)

</article>

</div>

---

## How does JUnit work?

A few things to be aware of...!

- A new test class is created with **every** test

  - can't rely on data stored in instance variables

- Tests are run in **any order** 😛

  - can't rely on testA running before testB

- A test method runs in **isolation**
  - a test method must setup its own data
  - or can use @BeforeEach etc

---

<!-- _class: image-panel-right -->

## Zoology Time ! 🐯🐵🐼

At the **Zoology Zoo** we want ensure all the animals we create are fine and dandy!

We also want to know whether an animal is hungry - very important for animal welfare! 💓

We can have a **hunger percentage**, which shows how hungry an animal is. If we feed an animal their hunger decreases - makes sense!

We can add a variable and some methods to implement these **requirements**, and we can test them to make sure they work!

Sounds like some JUnit tests are called for! 💡

![w:400](../../_assets/images/zoo-image-bar.png)

---

<!-- _class: activity -->

## Challenge 🐯🐵🐼

These challenges use the Zoology application.

### Animal JUnit test

<div class="grid" >

<div>


Create a new test class for `Animal`, use IntelliJ to create the test class.
In the `AnimalTest` class

- create some constants to represent animal test data

- use a @BeforeEach to create an Animal object to test

- add tests for the id getters and setters

- add tests for the getHunger(), isHungry() and feed() methods
- add tests for the name and age getters and setters

</div>
<div>

Should we be writing tests for Tiger, Llama and the rest? 🤔

</div>

</div>
