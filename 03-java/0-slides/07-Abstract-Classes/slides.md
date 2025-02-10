<!-- _class: lead -->

# Enums and abstract classes

---

<!-- _class: objectives -->

## Learning objectives

- Enums
- Abstract classes

---

<!-- _class: mind-map -->

## Recap

![w:280](./assets/images/java-logo.png)

- JUnit
- `@Test`
- `@BeforeEach`
- `@DisplayName`
- `@BeforeAll`
- `assertTrue`
- `assertNotNull`
- `fail`

---

<!-- _class: thought-box -->

## Enums

- Common to have types with a finite set of values
- An enumeration is a fixed set of constants
- Enums - **enumerated types** - provide this in Java
- Some examples:
  - Days of week - Monday, Tuesday, Wednesday ...
  - Months of year - January, February, March ...
  - Seasons - Spring, Summer, Autumn, Winter
  - Film ratings - U, PG, 12, 15, 18

You used to have to use constants for enums 😛

---

## Enums in Java

<div class="grid" >

<article>

- Declared using `enum` keyword
- Similar to a class or interface (class behind the scenes)
- Values have an implied order - order they are declared
- Can compare using `equals()` and `==` 😃
- Easy to use in `switch` statements
- Static method `values()` returns an array of values
- Static method `valueOf()` converts between String and enum value
- Far safer than using number or String constants

</article>
<article>

```java

public enum Season {
    Spring, Summer, Autumn, Winter;
}

Season season = Season.Spring;

if( season == Spring.Summer ) {
    System.out.println("It's summer!");
} else if( season.equals( Spring.Autumn ) ) {
    System.out.println("It's autumn!");
}

Season anotherSeason = Season.valueOf("Winter");

```

</article>

</div>

---

<!-- _class: image-panel-right -->

## Zoology Time ! 🐯🐵🐼

So at the Nology Zoo we want to classify our animals at bit better.

And also, while we're at it, it would be good to add some more information about an animal.

- Can we pet it?
- How popular is it?

Let's go to work 😎

![w:400](../../_assets/images/zoo-image-bar.png)

---

<!-- _class: activity -->

## Challenges 🐯🐵🐼

These challenges use the Zoology application.

<div class="grid" >

<div>

### 1. Animal type

In the `com.nology.zoology.animal` package

Create a new enum called `AnimalType`

- add values: crocodile, lion, tiger, llama, monkey

In the `Animal` class

- add new method `getType()` that returns type of AnimalType
- it can return `null` here for now (more on this later!)

Now implement this `getType()` method and return the correct enum value in the `Animal` subclasses; Tiger, Llama and so on.

</div>

<div>

### 2. More Animal details

Still in `Animal` class.

- add boolean variable `pettable`, with getter and setter
- add int variable `popularity`, with getter and setter
- add overloaded constructor that takes id, name, age and pettable. 🤔 What does this allow?

**Extension**

- Improve implementation `getInformation()` with a more meaningful message, say: <br/>

"Leo, a lion, is 7 years old, popularity is 33 and hunger is 45%"

- Do you still need all those overriding methods?

</div>
</div>

---

## Variables in enums

<div class="grid" >

<article>

- Enums can have more than just values
- It's possible to have instance variables, constructors and methods...
- Allows extra information about the values to be stored
- Constructors are used to set the variables
- Constructors are implicitly **private**

</article>
<article>

```java

public enum Season {

    Spring("21-March"), Summer("21-June"), Autumn("21-September"), Winter("21-December");

    private String startFrom;

    Season(String startFrom) {
        this.startFrom = startFrom;
    }

    public String getStartFrom() {
        return this.startFrom;
    }
}

Season season = Season.Spring;

season.getStartFrom(); // 21-March

```

</article>

</div>

---

<!-- _class: activity -->

## Challenges 🐯🐵🐼

These challenges use the Zoology application.

<div class="grid" >

<div>

### 1. Animal type extension

In the `AnimalType` enum

- add an instance variable `pettable`, type boolean
- add a constructor to set new variable
- set variable appropriately for each animal type
- add a getter to access variable

</div>

<div>

### 2. Using isPettable()

Where is the best place to use the new AnimalType.isPettable()?

It should be used to default the Animal's pettable variable when created.

Note the user is still free to change for an individual animal.

</div>
</div>

---

<!-- _class: thought-box -->

## Abstract classes

<div class="grid" >

<article>

- What is an Animal object?
  - will it have a type?
  - will it have a form?

<br/>

- Some classes should not be created!

<br/>

🚫 You shouldn't be able to create an **Animal** object, just its subclasses

</article>

<article>

```java

public class Animal {
    private String name;
    private int legs;
    private AnimalType type;
   // .. getters and setters etc
}

public class Tiger extends Animal {
    // looks like a Tiger, growls like a tiger etc
}

public class Lion extends Animal {
    // looks like a Lion, roars like a lion etc
}

Animal animal = new Animal(); // What type is this??

```

</article>

</div>

💡 **abstract** classes to the rescue!

---

<!-- _class: thought-box -->

## Abstract classes in Java

<div class="grid" >

<article>

- Abstract classes are advanced **inheritance**! 😃
- An abstract class **cannot** be created - syntax error
- Use `abstract` keyword to make a class abstract
- Abstract methods are advanced **polymorphism**! 😃
- Methods can also be abstract - use `abstract`
- An abstract method has **no body**
- A class with one or more abstract methods **must be** abstract
- A concrete subclass must implement all abstract methods

</article>

<article>

```java

public abstract class Animal {
    private String name;
    private int legs;
    // .. getters and setters etc

    public abstract void makeSound();
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

```

</article>

</div>

👉 A **concrete** class is one that can be created!

---

## Why use abstract classes?

- Abstract classes can make classes more reusable and extendable
- Abstract classes force users to implement certain methods
- Abstract classes ensure a lot of code reuse
- Abstract classes allow flexibility going forward
- Abstract classes are tied to inheritance

---

<!-- _class: activity -->

## Challenge 🐯🐵🐼

These challenges use the Zoology application.

<div class="grid" >

<div>

### 1. Abstract animal

In the `Animal` class

- make the class abstract

- make the `getType()` method abstract

- make the `makeSound()` method abstract

**Extra**

🤔 any other changes required now that Animal is abstract? Hint: think about testing...

</div>

<div>

</div>
</div>
