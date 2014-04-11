package selections_programming;

// Write a program that plays the popular scissor-rockpaper
// game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
// wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
// scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
// 2 and displays a message indicating whether the user or the computer wins, loses,
// or draws. Here are sample runs:
// scissor (0), rock (1), paper (2):
// The computer is scissor. You are rock. You won

import java.util.Scanner; // Load in the scanner class
import java.util.Random; // Load in the random class

public class rock_paper_scissors {
	public static void main(String Args[]){
		
		Scanner input = new Scanner(System.in); // Create a new scanner image
		Random randomGenerator = new Random(); // Create a new random number generator
		
		System.out.println("Good morning and welcome to the rock-paper-scissors game!");
		System.out.println("This came will give you the chance to battle me, the computer, in rock, paper, scissors!");
		System.out.println("To start playing the game, please select 0 for a scissor, 1 for a rock, and 2 for paper:");
		System.out.println("To exit the system, please enter the number three");
		System.out.println("Please enter your solution now:");
		
		// Create a simple while loop to roll through the answers
		int entry = input.nextInt(); // Grab the input from the user
		
		while(entry != 3) { // Note that this generates an infinite loop versus the do while loop
			// Note that the do while loop evaluates the expression at the top of the loop
			
			// Generate a random number in order to roll through the relevant answers
			int random_number = randomGenerator.nextInt(3); // Generate a random integer between 0 and 3 
			
			// Grab the users random number			
			if(entry == 0){ // This is a scissor (scissor beats paper; rock beats scissor, tie)					
										
				}
			
			else if (entry == 1){ // This is a rock (rock beats scissor, paper beats rock, tie)
				
			} // Review
			
			else if (entry == 2){ // This is a piece of paper (paper beats rock, scissor beats paper, tie)
				
			}
			
		}
		
		// While the solution is not 3
		
		// Ask the user for input
		
		// Run through the conditional if statements & return the value to the user of the relevant output
		
	}
}
