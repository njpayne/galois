package selections_programming;

// Write a program that lets the user guess whether the flip of
// a coin results in heads or tails. The program randomly generates an integer 0 or 1,
// which represents head or tail. The program prompts the user to enter a guess and
// reports whether the guess is correct or incorrect.

import java.util.Scanner; // Import the scanner class

public class heads_or_tails {
	public static void main(String Args[]){
		
		// Create the scanner object
		Scanner input = new Scanner(System.in); // Input the new scanner object
		
		String computers_actual; // Create an empty string for the computers_actual coin flip results
		
		// Ask the user for an input of what they guess the coin flip will be
		System.out.println("Welcome to the coin flip guessing game!");
		System.out.println("This program will allow you to guess whether a coin flip returns a head or returns a tail!");
		System.out.println("My computer brain, cerebro, has just flipped a coin with either a head or a tail!");
		System.out.println("Now it's your turn to guess. If you think I flipped a head, type in the word head.");
		System.out.println("Otherwise, if you think that I flipped a tail, please type in the word tail!");
		System.out.println("Please make your selection now:");
		
		String users_guess = input.next(); // Input a string using the console
		
		// Flip the coin randomly and return a value that is either a head or a tail
		double randomnumber = Math.random(); // Create the random number
		
		// Determine if the computer generated flip is either a head or a tail
		boolean isTails = randomnumber > 0.5; // Flip is a tail if the random number is greater than 0.5
		
		// Generate a loop to capture the value "head" or "tail for comparison
		if(isTails){
			computers_actual = "tail"; // Make a new variable to hold the computers guess if the answer is a tail!
		} else {
			computers_actual = "head"; // Make a new variable to hold hte computers guess if the answer is a head
		}
		
		// Compare the computers_actual with my guess
		// Note that originally, I tried using an if statement with user.guess == computers_actual as the condition
		// This kept producing the wrong answer most of the time. This is because objectA == objectB compares two memory addresses
		// This is opposed to users_guess.equals(computers_actual) which compares all characters to each other
		
		if(users_guess.equals(computers_actual)){ // If the two answers match
			System.out.println("Congratulations!");
			System.out.println("You guessed that I would flip a " + users_guess + " and I actually flipped a " + computers_actual + "!"
					+ " Great work!");			
		} else { // The answers do not match
			System.out.println("Sorry!");
			System.out.println("You guessed that I would flip a " + users_guess + " and I actually flipped a " + computers_actual + "!");
			System.out.println("Seems like you need to work on your coin flip guessing skills a little bit longer! Please try again!");
			}		
	}
}
