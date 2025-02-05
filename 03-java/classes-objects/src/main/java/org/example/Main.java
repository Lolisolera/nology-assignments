package org.example;

import java.util.List;
import java.util.stream.Collectors;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Classes and Objects

        Cat defaultCat = new Cat();
        System.out.println(defaultCat.getName());
        System.out.println(defaultCat.getAge());
        defaultCat.meow();

        defaultCat.setName("Default");
        System.out.println(defaultCat.getName());


        Cat felix = new Cat("John");
        System.out.println(felix.getName());
        System.out.println(felix.getAge());
        felix.setName("Felix");
        System.out.println(felix.getName());

        Cat garfield = new Cat("Garfield", 22, "Red");
        System.out.println(garfield.getName());
        System.out.println(garfield.getAge());

        Cat billy = new Cat("Billy","Red");
        System.out.println(billy.getAge());


     
    }
}
