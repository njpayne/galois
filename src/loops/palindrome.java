package loops;

import java.util.Scanner;

/**
 * Created by nathanielpayne on 9/22/2015. Create a program that, for every string that is input, determines whether the string is a palindrome!
 * Test examples are redivider, noon, civic, radar, level, rotor, kayak, reviver, racecar, redder, madam, and refer.
 */

public class palindrome {
    public static void main(String[] args){ // This is the main class
        Scanner in = new Scanner(System.in);
        String reverse = ""; // These are original strings to populate;

        System.out.println("Welcome to the palindrome program!");
        System.out.println("This program takes a string as an input and helps you determine whether the string is palindrome!");

        String word = in.nextLine(); // Get input
        System.out.println("The string that you inputted was: " + word); // Do this simply for testing

        // Get the word length
        Integer stringlength = word.length(); // Get the length of the word
        System.out.println(stringlength); // Do this simply for testing

        // Create a quick loop to loop through the characters
        for(int i = stringlength - 1; i >= 0; i--){ // Note that this loop climbs up rather than climbs down
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) // If the string is a palindrome
            System.out.println("Entered string is a palindrome.");
        else // If the string is not a palindrome
            System.out.println("Entered string is not a palindrome.");
    }
}
