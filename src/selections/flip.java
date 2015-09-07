package selections;

import java.util.Scanner;

/**
 * Created by nathanielpayne on 9/5/2015.
 *
 * Write a program that lets the user guess whether the flip of a coin results in heads or tails.
 * The program randomly generates an integer 0 or 1, which represents head or tail.
 * The program prompts the user to enter a guess and reports whether the guess is correct or incorrect.
 *
 */

public class flip {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the random number guessing game! I am going to flip a coin behind my back without showing you!");
        System.out.println("Once I am done, you are going to guess whether I flipped a head or a tail.");
        System.out.println("Okay, I flipped my coin! Now, I want you to guess. What side of the coin do you think I have currently facing up?");

        Integer myfliplabel; // Create an empty integer
        String myfliplabelstring; // Create an empty string to hold the description of the string
        String yourfliplabelstring; // Create an empty string that can hold the classification of your guess

        // Generate a random number that is between 0 and 1 and then convert it to a head (0) or a tail(1)
        Integer myflip = (int)(Math.random() * 10);
        if(myflip < 0.5){ // I secretly flipped a head
            myfliplabel = 0; // Set myfliplabel = 0;
            myfliplabelstring = "head";
        } else{ // I secretly flipped a tail
            myfliplabel = 1; // Set myfliplabel = 1;
            myfliplabelstring = "tail";
        }

         System.out.println("Guess 0 for a head or 1 for a tail!");

        Integer guess = input.nextInt(); // Get the guess from the user and determine whether their guess corresponds to a head or a tail
        if(guess == 0){ // Setyourfliplabelstring to a head
            yourfliplabelstring = "head";
        } else{ // Setyourfliplabelstring to a tail
            yourfliplabelstring = "tail";
        }

        // Validate whether they match and then return
        if(guess == myfliplabel){ // The two integers match
            System.out.println("So, it turns out that you are a pretty good guesser!");
            System.out.println("I secretely flipped a " + myfliplabelstring + " and you guessed that I secretly flipped a " + yourfliplabelstring + "! Nice work!");
        } else { // The two integers do not match
            System.out.println("So, it turns out that you are a pretty poor guesser! What's wrong with you?");
            System.out.println("I secretely flipped a " + myfliplabelstring + " and you guess that I secretly flipped a " + yourfliplabelstring + "! Try again next time!");
        }
    }
}
