package io.nology.j1_types_and_control_flow;

/**
 * All challenges in this repository are separated into three levels:
 * Foundation, Intermediate, and Advanced.
 * The expectation is to complete all Foundation level challenges, with
 * Intermediate and upwards pushing your knowledge
 * and may require you to google things in order to solve them. If you find an
 * answer online somewhere, be kind and
 * share it with the group!
 */

public class Challenge {

    public Challenge() {
    }

    // -------------- FOUNDATION --------------

    /***
     * A method to find the largest number of two given integers
     *
     * @param num1 a number to be compared with the other parameter
     * @param num2 a number to be compared with the other parameter
     * @return returns the larger of the 2 numbers passed as parameters
     */
    public int findLargestNumber(int num1, int num2) {
        return Math.max(num1, num2);
    }

    /*solution using if-else statement:
    public int findLargestNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }*/



    /***
     * A method to find the longest string of two given strings
     *
     * @param string1 a string to be compared with the other parameter
     * @param string2 a string to be compared with the other parameter
     * @return returns the larger of the 2 strings or "These two are the same
     *         length!" if they are of equal length
     */
    public String findLongestString(String string1, String string2) {
        // Compare lengths of the two strings
        if (string1.length() > string2.length()) {
            return string1;
        } else if (string2.length() > string1.length()) {
            return string2;
        } else {
            return "These two are the same length!";
        }
    }

    /*public static void main(String[] args) {
        Challenge challenge = new Challenge();

        // Test cases
        System.out.println(challenge.findLongestString("apple", "banana")); // Should return "banana"
        System.out.println(challenge.findLongestString("hello", "world"));  // Should return "These two are the same length!"
        System.out.println(challenge.findLongestString("cat", "elephant")); // Should return "elephant"
    }
*/


    /**
     * A method to calculate a price discount. Given the price and the amount to be
     * discounted return the new
     * discounted price.
     *
     * @param price    The advertised price of a product
     * @param discount The percentage discount available
     * @return returns the price with the discount applied
     */
    public double getDiscount(double price, double discount) {//double is a method to handle floating numbers
     // Apply the discount formula
        return price * (1 - (discount / 100.0));


        //e.g. price = 100 and discount 20%
        //step 1: calculate the decimal discount factor 20% into a decimal (float)
        //20/100 = 0.20
        //step 2: subtract the discount factor from 1
        //1-0.20 = 0.80 (after applying the discount I'll be paying 80% fo the price)
        //step 3: Multiply the Original Price by the Remaining Portion
        //100.0 x 0.80 = 80.0
        //discounted price is 80.
    }



    // -------------- INTERMEDIATE --------------

    /***
     * A method to check whether 2 numbers are equal to 4 decimal places.

     * HINT: What happens if you do 0.1234 * 10000?
     *
     * @param num1 a double to be compared with the other parameter
     * @param num2 a double to be compared with the other parameter
     * @return a boolean to specify whether the 2 params match to 4 decimal places.
     */
    public boolean compareTwoNumbers(double num1, double num2) {
        num1 = Math.round(num1 * 10000); // Round the number to the nearest integer...
        num2 = Math.round(num2 * 10000); // ...to avoid precision issues when comparing floating-point numbers directly
     // Compare the rounded values
        return num1 == num2; // Return true if they are the same, false otherwise

        //num1 and nm2 are variables of type double.
        // the == compares the values and if they are exactly the same after rounding...
        // ... then, the condition will evaluate to true, otherwise false.
    }




    /***
     * A method to determine which day of the week it is from a numeric input.
     * e.g 0 = "Sunday", 1 = "Monday" etc.

     * If the input is out of range return "Not a valid day range! The number needs
     * to be from 0-6"

     * EXTENSION Use a switch?
     * https://www.w3schools.com/java/java_switch.asp
     *
     * @param day an Integer from 0-6 (that corresponds to the days of the week)
     * @return the day that corresponds to the number that was passed to the method
     *         as a parameter or "Not a valid
     *         day range! The number needs to be from 0-6" if param passed is
     *         outside the range
     */
    public String getDayName(int day) {
        return switch (day) {
            case 0 -> "Sunday"; // -> switch expression and RETURN statement is not needed.
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Not a valid day range! The number needs to be from 0-6";
        };
    }




    /***
     * A method to check whether a word has an even length or not.

     * If an empty string is given it should return false.
     *
     * @param word a String to be checked whether the string has an even length or
     *             not.
     * @return a boolean the result of the length check.
     */
    public boolean isEvenWord(String word) {

        if (word.isEmpty()) {
            return false;
        }

        // Check if the length of the word is even
        return word.length() % 2 == 0; //even=, so it'll return true.
    }




    // -------------- ADVANCED --------------

    /***
     * A method to determine whether any given year is a leap year

     * A leap year occurs on:
     * - any year that is evenly divisible by 4
     * - except any year that is evenly divisible by 100 as well
     * - unless the same year is also evenly divisible by 400
     *
     * @param year the year to be checked
     * @return returns true if it is a leap year, false if not
     */
    public boolean leapYearChecker(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

}
