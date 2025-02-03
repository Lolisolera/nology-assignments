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
        int sum2 = myShort + myShort;

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

        String[] myStringArr = new String[3];
        System.out.println(Arrays.toString(myStringArr));


        //using arrays:

        //in java method array.push() "PUSH" doesn't exist.
        // 2 string method - every single class in java ( or OBJECT) has a 2 string representation.
        //arrays created with a size their size will be the same forever! We can NOT change how many vcalues are inside.
        //to keep working with one array and want to increase the number of items inside
        //You'll need to create a new array and copy all the values form the previous array and put them in a array with a longer wside
        //or create an array list (which contains longer size).

        //System.arraycopy

        int[] ages = {31, 45, 28, 19};
        int[] newAges = new int[ages.length + 1]; // empty array

        //newAges[0] = ages[0];

        System.arraycopy(ages, 0, newAges, 0, ages.length);
        System.out.println(Arrays.toString(newAges));


        //Arrays.copyOf
        //method to do multiple things = polimorphism

        int[] agesArr = {34, 56, 23, 99};
        agesArr = Arrays.copyOf(agesArr, 10);
        System.out.println(Arrays.toString(agesArr));

        //ABOVE method created a new array with the original items inside and overwritten with the new values inside it)


        //with a for loop:

        int[] nums = {1, 2, 3, 4, 5};
        int[] newNums = new int[nums.length * 2]; // array with twice the length of the nums array, only zeros in there at the moment.

        // Loop to copy elements from nums to newNums
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];  //is like a shortcut, the same thing. it references to the same object with a different memory?
        }

        System.out.println("newNums: " + Arrays.toString(newNums));  // Prints the newNums array
        nums = newNums;  // nums now references newNums
        System.out.println("nums: " + Arrays.toString(nums));  // Prints the nums array, which is now the same as newNums


        //Control Flow:

        //for loops

        byte age = 18;
        if(age >=18){
            System.out.println("You are allow in the pub");
        }else{
            System.out.println("You are not allowed");
        }

        char command = 'e';
        switch(command) {
            case'c':
                System.out.println("Continue");
                break;
            case 'e':
                System.out.println("Exit");

        }

        //if the swicth is in a method it'll return. I'll have to write return.


        //while loops

        //int[] nums = {1, 2, 3, 4, 5};
        int i = 0;
        while(i < nums.length) {
            System.out.printf("Nums is: %d\n", nums[i]);  // Print the current number
            i++;  // Increment i to move to the next element

            //This loop prints each element of the nums array on a new line. The loop starts at index 0 and continues until it has printed all elements of the array, incrementing i with each iteration to move through the array

        }


    }

    }



