package io.nology.j4_arrays_and_loops;

public class Challenge {

    public Challenge() {
    }

    /**
     * A method to check if two strings are anagrams of each other.

     * Two strings are considered anagrams if they contain the same characters in
     * the same frequency, but possibly in a different order (reordered characters
     * of one string create the second string)
     * 
     * @param str1 the first string
     * @param str2 the second string
     * @return true if the strings are anagrams, false otherwise
     */
    public boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26]; // Assuming only lowercase letters //26 letters are the total of letters in english alphabet
                                       //each index corresponds to a letter: 0 - a, 1-b, 2-c, 25-z
        // Count occurrences of each character
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++; // Increments count for str1//Converts the letter to an index.//'a' has an ASCII value of 97, so:
                                               //so 'a' - 'a' = 0 (first index)//'b' - 'a' = 1 (second index)//'z' - 'a' = 25 (last index)
                                              //This allows us to efficiently count letter occurrences using constant space O(1) instead of sorting O(n log n).
            charCount[str2.charAt(i) - 'a']--; // Decrements count for str2// at the end all charCounts should be zero.
        }

        // If all values in charCount are zero, they are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
//examples of anagrams: "listen" - "silent" , "car" -"rac"





    /**
     * A method to print characters between two given characters
     *
     * @param start the starting character (A)
     * @param end   the ending character (P)
     * @return returns all the characters between the start and end
     *         (`ABCDEFGHIJKLMNOP`)
     * 
     */
    public void printCharactersBetween(char start, char end) {
        for (char i = start; i <= end; i++) { // Loops from 'A' to 'P'
            System.out.print(i);// Prints each character without a newline
        }

    }





    /***
     * A method to find the middle item(s) in a given string array

     * If the array has an odd number of items, return an array containing the
     * single middle item.
     * If the array has an even number of items, return an array containing the two
     * middle items.
     * If the array is empty, return an empty string array.
     *
     * @param array the input array of strings
     * @return an array containing the middle item(s)
     */
    public String[] findMiddleItems(String[] array) {
        int length = array.length;

        // If the array is empty, return an empty array
        if (length == 0) {
            return new String[]{};
        }

        // Find the middle index
        int mid = length / 2;

        // If the array has an odd number of items, return the single middle item
        if (length % 2 == 1) {
            return new String[]{array[mid]};
        }

        // If the array has an even number of items, return the two middle items
        return new String[]{array[mid - 1], array[mid]};
    }
        //array[mid - 1] → Gets the element just before the middle.
       //array[mid] → Gets the element just after the middle.
      //new String[]{ ... } → Creates a new string array with these two values.



//FROM HERE
    /***
     * A method to merge two sorted integer arrays into a single sorted array
     *
     * @param array1 the first sorted integer array
     * @param array2 the second sorted integer array
     * @return a new sorted integer array containing all elements from both input
     *         arrays
     */
    public int[] mergeSortedArrays(int[] array1, int[] array2) {
        return new int[] {};
    }




    /***
     * A method to find the sum of all odd numbers in an array
     *
     * @param array the input array of integers
     * @return the sum of all odd numbers in the array
     */
    public int sumOfOddNumbers(int[] array) {
        return 1;
    }




    /***
     * A method to find the maximum subarray sum in a given integer array
     * 
     * Example:
     * Input: array = {-2, 1, -3, 4, -1, 2, 1, -5, 4}
     * Output: 6 (The maximum subarray is [4, -1, 2, 1] with sum 6)
     * 
     * Input: array = { -1, -2, -3, -4}
     * Output: -1
     *
     * @param array the input array of integers
     * @return the maximum subarray sum
     */
    public int maxSubarraySum(int[] array) {
        return 1;
    }




    /**
     * A recursive method to calculate the factorial of a given positive integer
     *
     * @param n the positive integer
     * @return the factorial of the given integer
     * @throws IllegalArgumentException if n is negative
     */
    public int calculateFactorial(int n) {
        return 1;
    }

}
