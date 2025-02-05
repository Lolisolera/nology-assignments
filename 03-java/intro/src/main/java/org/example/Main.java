package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Variables
        //        Primitives
//        Arrays
//        Loops
//        Conditionals

//        Strings

// //        Primitives Data Types
//        Simplest types in a language
//    What is type casting?
//    How to convert one type to another?

        // JS - number - (-2 ^ 52 -1 -> 2 ^ 52 -1) BigInt

        // Number types in Java
//
//        -127 to 127 (0000)
        byte myByte = 127;

        // short - 2 bytes => -32,768 to 32,767
        short myShort = 18600;

        // int - 4 bytes => -2,147,483,648 to 2,147,483,647
        int myInt = 2_147_483_647;

        // long - 8 bytes => - -9,223,372,036,854,775,808 to 9,223,372,036,854,
        // 775,807
        long myLong = 9_223_372_036_854_775_807L;

//        2 byte - ASCII Character Type - 16-Bit ASCII characters
        char myChar = 'c';


      // float - 4 bytes - 6 or 7 decimal digits
        float myFloat = 3.4028234663852885981170418348451692544E38f;

        System.out.println(myFloat);

        // double - 8 bytes - 15 decimal digits
        double myDouble = 0.11111;
        System.out.println(myDouble);

        myDouble = 0.9999;

        System.out.printf("My new double is %f \n", myDouble);
//        System.out.println(myDouble);


    // adding myByte and myShort into a third variable
        short sum = (short) (myByte + myShort);
        int sum2= myShort + myShort;

        System.out.println(sum2);

//        Casting order
//        -   `byte` -> `short`, `int`, `long`, `float`, or `double`
//        -   `short` -> `int`, `long`, `float`, or `double`
//        -   `char` -> `int`, `long`, `float`, or `double`
//        -   `int` -> `long`, `float`, or `double`
//        -   `long` -> `float` or `double`
//        -   `float` -> `double`


// Boolean
//       1 byte => 1 or 0
        boolean myBoolean = true;
        boolean myFalse = false;

// How to scan for user input?

//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Input an Integer");
//        int userInput = myScanner.nextInt();
//        System.out.printf("User has entered %d \n", userInput);
//        System.out.println(((Object)(myByte+myShort)).getClass().getName());
//        System.out.println(((Object)(myByte)).getClass().getName());

        // Strings in JAVA

        String name = "Rémi";
        System.out.println(name);
//        name += " H.";
        System.out.println(name);
        String myString = "Rémi";

        System.out.println(name == myString);
        System.out.println(name.equals(myString));
        System.out.println(name.charAt(2));

        System.out.println(myString.length());
        System.out.println(System.identityHashCode(myString));
        System.out.println(System.identityHashCode(name));

        int num = 240897;


        //Arrays
//Limitations?
// Workarounds ?

        int[] array = {1, 2, 3, 4};
        System.out.printf("Index 1 in array is %d \n", array[1]);

        // using new to construct an array with the length as arg
        byte[] myByteArr = new byte[4];
        System.out.println(Arrays.toString(myByteArr));

        char[] myCharArr = new char[10];
        myCharArr[0] = 'a';
        myCharArr[1] = 'b';
        System.out.println(Arrays.toString(myCharArr));

        System.out.println(Arrays.toString(array));
//        array[4] = (5); Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

        String[] myStringArr = new String[3];
        System.out.println(Arrays.toString(myStringArr));

        // Arrays in Java are of fixed size
        // How can 'increase' the size of arrays?

        // System.arraycopy

        int[] ages = {31, 45, 28, 19};
        int[] newAges = new int[ages.length + 1]; // Empty array

        System.arraycopy(ages, 0, newAges, 0, ages.length);
        System.out.println(Arrays.toString(newAges));

        // Arrays.copyOf

        int[] agesArr = {34, 56, 23, 99};
        agesArr = Arrays.copyOf(agesArr, 10);
        System.out.println(Arrays.toString(agesArr));


        // With a for loop

        int[] nums = {1, 2, 3, 4, 5};
        int[] newNums = new int[nums.length * 2];
//         We have an array with
// twice the length of the nums array, only 0s in there atm

        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        };

        System.out.println(Arrays.toString(newNums));
        nums = newNums;
        System.out.println(Arrays.toString(nums));

        newNums[9] = 99;
        System.out.println(Arrays.toString(nums));

        byte age = 18;
        if(age >= 18) {
            System.out.println("You are allow in the pub");
        } else {
            System.out.println("You are not allowed");
        }

        System.out.println(age < 21 ? "You can not drink in the US": "You can" +
                " drink in the UK");

        char command = 'e';
        switch(command) {
            case 'c':
                System.out.println("Continue");
                break;
            case 'e':
            case 'E':
            case '0':
                System.out.println("Exit");
                break;
            default:
                System.out.println("Command not recognised");
        }

    int i = 0;
    while(i < nums.length) {
        System.out.printf("Nums is: %d \n",nums[i]);
        i++;
    }

    }
}
