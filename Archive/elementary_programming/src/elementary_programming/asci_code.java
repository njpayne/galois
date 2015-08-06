package elementary_programming;

// Write a program that receives an ASCII
// code (an integer between 0 and 127) and displays its character. For example, if the
// user enters 97, the program displays character a.

import java.util.Scanner; // Import the scanner class

public class asci_code {
	public static void main(String[] Arg){
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in); // The object is called input & scanner is the type
		
		// Input an integer between 0 and 127 
		// (Later do validation to check that the integer is between 0 and 127 using a while loop)
		System.out.println("Welcome to the ASCII conversion program!");
		System.out.println("Please enter an integer between 0 and 127:");
		int a = input.nextInt(); // Grab the integer between 0 and 127  
		
		// Convert the integer to an ASCII character
		String b = Character.toString ((char) a);
		
		// Return the output to the user
		System.out.println("You entered the integer " + a);
		System.out.println("This ASCII code converts to the character " + b);		
	}
}
