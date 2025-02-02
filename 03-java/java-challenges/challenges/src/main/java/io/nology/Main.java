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


        //Test
    }
}

