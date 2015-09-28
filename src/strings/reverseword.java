package strings;

import java.util.*;

/**
 * Created by nathanielpayne on 9/27/2015. Creat a program that reverses the position of each word in a sentence
 * Challenge comes from a CodinGame 5 min clash. Note that there is no punctuation, etc.
 */

public class reverseword {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); // Create a new scanner object

        System.out.println("Welcome to the string reversal program!");
        System.out.println("This simplified program receives a sentence with no punctuation and asks you to return the words in reverse order!");
        System.out.println("Please inpute the phrase that you want to reverse: ");
        String phrase = in.nextLine();

        // Separate a phrase by spaces
        String[] splitphrase = phrase.split("\\s+");
        Integer n = splitphrase.length;

        System.out.println("The first word in the string is: " + splitphrase[0]); // Test print the first word in the string
        System.out.println("The length of the array is: " + n);
        System.out.println("The last word in the string is: " + splitphrase[n-1]); // Test print the first word in the string
        System.out.println("The phrase in reverse is: ");

        int count = n-1; // Set count equal to n-1
        while(count >= 0){ // The challenge with this loop is that it does not create a single string but rather has the pieces
            System.out.println(splitphrase[count]);
            count--;
        }

        int newcount = n-1;
        String finalstring = ""; // Create a blank final string
        while(newcount >= 0){ // The challenge with this loop is that it does not create a single string but rather has the pieces
            finalstring = finalstring + splitphrase[newcount] + " ";
            newcount--;
        }
        System.out.println("The original string in reverse is: " + finalstring);
    }
}
