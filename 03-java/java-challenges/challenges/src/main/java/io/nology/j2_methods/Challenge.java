package io.nology.j2_methods;

public class Challenge {

    public Challenge() {
    }

    /**
     * A method to find the smallest number among three given integers
     *
     * @param num1 the first number
     * @param num2 the second number
     * @param num3 the third number
     * @return the smallest of the three numbers
     */
    public int findSmallestNumber(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
//explained:
    //Math.min(a, b) Method - returns the smaller of the two numbers.
    //first finds the smaller number between num2 and num3,
    // and then compares that with num1 to get the smallest of all three.


    /*
    public int findSmallestNumber(int num1, int num2, int num3) {
    int smallest = num1;
    if (num2 < smallest) {
        smallest = num2;
    }
    if (num3 < smallest) {
        smallest = num3;
    }
    return smallest; */



    /**
     * A method to check whether a string is a valid password

     * The password must:
     * have at least ten characters
     * consist of only letters and digits
     * contain at least two digits
     *
     * @param password the password string to be validated
     * @return true if the password is valid, otherwise false
     */
    public boolean isValidPassword(String password) {
        // Check if the password has at least 10 characters
        if (password.length() < 10) {
            return false;
        }

        int digitCount = 0;

        // Check if the password consists only of letters and digits
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {//if a character is not a letter or a digit
                return false;
            }
            if (Character.isDigit(ch)) {
                digitCount++; //If a character is a digit, increase the digitCount.
            }
        }

        // Check if the password contains at least two digits
        return digitCount >= 2;
    }


    //test output in Main.java or her by clicking n the green arrow next to "public..."
     //we don't have to do the below code to test it by [passing arguments to the methods
    //we just have tot do the main logic coding and then runt he test
    //to see if we've passed or not!
    public static void main(String[] args) {
        Challenge challenge = new Challenge();

        System.out.println(challenge.isValidPassword("Abc1234567")); // true (valid)
        System.out.println(challenge.isValidPassword("A1b2c3d4e5")); // true (valid)
        System.out.println(challenge.isValidPassword("Password1")); // false (only 1 digit)
        System.out.println(challenge.isValidPassword("Short1")); // false (too short)
        System.out.println(challenge.isValidPassword("ValidPass123")); // true (valid)
        System.out.println(challenge.isValidPassword("Invalid@Pass123")); // false (contains special character '@')
    }

}
