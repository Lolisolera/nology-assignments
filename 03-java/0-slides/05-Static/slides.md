<!-- _class: lead -->

# Static methods and variables

---

<!-- _class: objectives -->

## Learning objectives

- What are static variables?
- What are static methods?
- When to use static

---

<!-- _class: mind-map -->

## Recap

![w:280](./assets/images/java-logo.png)

- Package
- `import`
- Arrays
- `ArrayList`
- Wrapper class
- Autoboxing
- Integer

---

<!-- _class: thought-box -->

## Static methods

<div class="grid" >

<article>

- _Instance_ methods belong to the **object** - the instance
- _Instance_ methods can access the _instance_ variables
- You **must** have an object to access _instance_ methods
- A `static` method belongs to the **class**
- A `static` can only access other static methods and static variables
- You **don't** have to create a class to use a static method!

</article>

<div class="flex" >

```java

public class Dog {
    private String name;
    public Dog(String name) { this.name = name; }
    public String getName() { return this.name; }

    public static void bark() {
        System.out.println("Woof");
    }

    public static void main(String[] args) {
        Dog rex = new Dog("Rex");
        rex.getName(); // Rex

        Dog.bark(); // Woof

    }
}

```

</div>
</div>

🤔 What are **static variables** ? Coming up next ... !

---

## Static variables

<div class="grid" >

<article>

- _Instance_ variables belong to the **object** - the instance
- Every object has their own _instance_ variables
- You **must** have an object to access _instance_ variables
- A `static` variable belongs to the **class**
- Every object has access to the **same variable**
- Use `static final` to create a constant 👍

</article>

<div class="flex" >

```java

public class Dog {

    private static final int MAX_DOGS = 47;
    private static int dogCount = 0;
    private String name;

    public Dog(String name) {
        this.name = name;
        Dog.dogCount++;
    }

    public static int getNumberOfDogs() {
        return Dog.dogCount;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Princess");
        Dog anotherDog = new Dog("Bonzo");

        Dog.getNumberOfDogs(); // 3

    }
}

```

</div>
</div>

---

## Some examples

- Lots of examples of static methods and variables in Java

<div class="grid" >

```java

System.out.println("Hello world");

System.out.println( Integer.MIN_VALUE );
System.out.println( Integer.MAX_VALUE );

public class FrogPond() {

    public static final int NUM_OF_FROGS = 273;

    public static void main(String[] args) {
        FrogPond pond = new FrogPond();
        pond.loadTheFrogs();
    }
}

```

```java

// Math consists solely of utility and helper methods for standard maths operations
Math.min( 1, 2 );
Math.round( 4.2 );
Math.floor( 17.3 );

// Collections has lots of utility methods for ArrayList etc
Collections.sort( arrayList );
Collections.shuffle( cardsArrayList );

// Arrays has lots of helper methods for arrays
Arrays.toString( anArray );

```

</div>

<!-- _class: thought-box -->

🤔 Why are **static** methods good for utility classes?

---

<!-- _class: image-panel-right -->

## Zoology Time ! 🐯🐵🐼

Extensive renovations have been carried out at the zoo! 😃

We now have some new classes to help us interact with the `Zoo` class and all the `Animals`! 👍

The `command` package contains a number of classes that implement a simple command line application that allows us
to interact with the Zoo.

To run the command line we can use:

```java

Zoo zoo = new Zoo();
// populate zoo

UserCommandRunner userCommandRunner = new UserCommandRunner(zoo);
userCommandRunner.runCommands();

```

![w:400](./assets/images/zoo-image-bar.png)

---

<!-- _class: image-panel-right -->

## Zoology Time ! 🐯🐵🐼

We have lots of animals!

We also have a zoo to hold them in, things are looking good.

But the creation of new animals is not straightforward.

🤔 Is there a way to simplify their creation?

![w:400](./assets/images/zoo-image-bar.png)

---

<!-- _class: activity -->

## Challenge 🐯🐵🐼

These challenges use the Zoology application.

### 1. Animal utilities

<div class="grid" >

<div>

In the `AnimalUtils` class

- add a **static** ArrayList to hold possible animal names

- populate the list in a `static` block - see examples

- add method generateName() to return a random name from the list

- add method generateAge() to return a random age _between_ 1 and 15

</div>

<div>

In the main method for of the `ZooPlayground` class:

- modify how the animals are created using the new AnimalUtil methods

😃 this should simplify the process

**Extension**

Using the new methods can you generate a **random** number of animals for the zoo?

</div>
</div>

---

<!-- _class: thought-box -->

## Scanner

<div class="grid" >

<article>

- `Scanner` can be used to read input from the console
- Can read in Strings or numbers
- Can also be used to read input from files
- Use `nextLine()` to read a whole line of input
- Use `nextInt()` to just read an integer
- Other methods are available to read bytes, shorts etc

</article>

<div class="flex" >

```java

// initialise with Syste,.in - standard input
Scanner scanner = new Scanner(System.in);

int i = scanner.nextInt();
long l = scanner.nextLong();

String read = scanner.nextLine();

int readInt = Integer.valueOf( read );

```

</div>
</div>

😃 Using `Scanner` we can interact with the user !

---

<!-- _class: activity -->

## Challenge 🐯🐵🐼

These challenges use the Zoology application.

### 1. Random animals

<div class="grid" >

<div>

In the `ZooPlayground` class

- ask user how many tigers to create and read their answer

- repeat for number of llamas, lions and crocodiles

- use user's answers to create required number of animals

🤔 Some things to think about:

- should you validate the user's answer?

- should you have a maximum number of animals?

</div>

<div>

</div>
</div>
