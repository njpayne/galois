package elementary;

import java.util.Scanner;

/**
 * Created by nathanielpayne on 9/1/2015.
 *
 * Create a Java program that reads in an integer (initially between 1 and 1000 before the loop) and adds all the digits in the integer.
 * For example, if an integer is 932, the sum of all its digits is 14. Hint: Use the % operator to extract digits,
 * and use the / operator to remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 * */

public class digits {
    public static void main(String[] args){
        // Create the new Scanner object
        Scanner input = new Scanner(System.in);

        // Ingest the digits of the program
        System.out.println("Welcome to the new integer counter program!");
        System.out.println("This program reads in an integer between 0 and 1000 and adds all the digits in the integer!");
        System.out.println("Please input the integer that you would like to analyze!");

        int number = input.nextInt(); // Get a new copy of the updated integer

        // Convert the integer into a string object
        String Str1 = String.valueOf(number); // Str1 is the variable for the string

        // Confirm the length of the string
        int length = Str1.length();

        // Initialize an initial counter variable
        double total = 0;

        for(int i = 0; i < length; i++){
            // Get the character at the first position
            char character = Str1.charAt(i); // Get the character in the ith position
            int integer = Integer.parseInt(String.valueOf(character)); // Convert the character (string) to an integer!
            total = total + integer; // Add to the total of the integer value (counter initially set to zero)
        }

        // Return the resulting sum
        System.out.println("Thank you for using the integer counter program!");
        System.out.println("You entered the integer " + number + "! The sum of the digits of this integer equals " + total + " .");
    }
}
