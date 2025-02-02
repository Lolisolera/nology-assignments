package io.nology;

import io.nology.j1_types_and_control_flow.Challenge;  // Import the Challenge class

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Challenge class by creating an object (Challenge)
        Challenge challenge = new Challenge();  //Challenge Object

     //now I can call the Methods of this challenge object
      // to complete the challenges, e.g. findLargestMethod,etc.

        // Test the findLargestNumber method
        int largest = challenge.findLargestNumber(10, 20);
        System.out.println("The largest number is: " + largest);  // Should print 20

        // Test the findLongestString method
        String longest = challenge.findLongestString("apple", "banana");
        System.out.println("The longest string is: " + longest);  // Should print "banana"

        // Test the getDiscount method
        double originalPrice = 100.0;
        double discountPercentage = 20.0;
        double discountedPrice = challenge.getDiscount(originalPrice, discountPercentage);

        System.out.println("Original Price: $" + originalPrice);  //print out the results
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Discounted Price: $" + discountedPrice);


        //Test the compare two numbers method
        double number1 = 0.1234;
        double number2 = 0.1234000;
        double number3 = 0.12345;

        // Testing with numbers that are equal to 4 decimal places
        System.out.println(challenge.compareTwoNumbers(number1, number2)); // Should return true

        // Testing with numbers that are not equal to 4 decimal places
        System.out.println(challenge.compareTwoNumbers(number1, number3)); // Should return false


        //Test the getDayName method

        System.out.println(challenge.getDayName(0)); // Sunday
        System.out.println(challenge.getDayName(3)); // Wednesday
        System.out.println(challenge.getDayName(7)); // Invalid day range


        //Test is even length word
        System.out.println(challenge.isEvenWord("hello")); // Output: false
        System.out.println(challenge.isEvenWord("even"));  // Output: true
        System.out.println(challenge.isEvenWord(""));      // Output: false


        //Tes it's leap year
        System.out.println(challenge.leapYearChecker(2020)); // Output: true (leap year)
        System.out.println(challenge.leapYearChecker(1900)); // Output: false (not a leap year)
        System.out.println(challenge.leapYearChecker(2000)); // Output: true (leap year)
        System.out.println(challenge.leapYearChecker(2023)); // Output: false (not a leap year)

    }
}

