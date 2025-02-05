package org.example;

public class Cat {
    private String name;
    private int age = 1;
    private String colour;
    private final boolean HAS_TWO_EYES = true;

    //    Poly - Morphism
//    Multiple - Shape
    Cat() {}
    Cat(String bla) {
        setName(bla);
        this.age = 2;
    }

    Cat(String n, int a, String c) {
        setName(n);
        this.age = a;
        this.colour = c;
    }

    Cat(String n, String c) {
        setName(n);
        this.colour = c;
    }

    public String getName() {
        return String.format("The name of this cat is %s", this.name);
    }

    public void setName(String name) {
       this.name = name.toUpperCase();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    void meow() {
        System.out.println("Meow Meow");
        // Can access all variable and methods inside of Cat class
    }
}
