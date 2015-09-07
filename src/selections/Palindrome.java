package selections;

import java.util.Scanner;

/**
 * Created by nathanielpayne on 9/5/2015.
 *
 * Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome number.
 * A number is palindrome if it reads the same from right to left and from left to right.
 *
 */

public class Palindrome {
    public static void main(String[] args){

        // Create the new scanner object
        Scanner input = new Scanner(System.in); // Create the new scanner object

        System.out.println("Welcome to the palindrome identification program!");
        System.out.println("Please enter a new three digit number and our intelligent agent will confirm whether this integer is a palindrome!");
        Integer number = input.nextInt(); // Grab the new number
        // Note that this is dirty and does not include validation on the input length. The input length is always considered to be three

        // Convert the integer into a string object
        String Str1 = String.valueOf(number); // Str1 is the variable for the string

        // Grab the string values at the first and the last positions
        // In future put this in a looping funciton that compare the first and last positions
        char first = Str1.charAt(0);
        char last = Str1.charAt(2);

        // Compare the strings
        if(first == last){ // If the two string positions are equal then we have a palindrome for our simple case
            System.out.println("Thank you for using our palindrome program!");
            System.out.println("You entered the three digit integer " + number + ". This is a palindrome as the first digit equals " + first + " and the last digit equals " + last + ".");
        } else { // We do not have a palindrome
            System.out.println("Thank you for using our palindrome program!");
            System.out.println("You entered the three digit integer " + number + ". This is NOT a palindrome as the first digit equals " + first + " and the last digit equals " + last + ".");
        }
    }
}
