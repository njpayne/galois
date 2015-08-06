package elementary_programming;

// Write a program that reads an integer between 0 and
//1000 and adds all the digits in the integer. For example, if an integer is 932, the
//sum of all its digits is 14.

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner; // Import the scanner object

public class sum_digits {
	public static void main(String[] Args){
		
		// Instantiate the Scanner Object
		Scanner input = new Scanner(System.in); // Create a new scanner object and pull data in
				
		// Get the value from the user
		System.out.println("Thank you for using the digit divider program!");
		System.out.println("Please input the number that you wish to add digits for (between 1 and 1000):");
		double string_to_break = input.nextDouble();
		
		// Convert the double to a string
		String word = String.valueOf(string_to_break);
		
		// Count the number of characters in the string
		int length = word.length(); // This is using a string function
		// Note that I am attempting to remove the 0 and the decimal from the word since it is an integer
		
		// Create an empty total section
		int total = 0; // Set this value to 0
		
		// Create an empty string
		String s = "";
		
		// Loop through all the digits in the string ...
		for( int i = 0; i < word.length( ) - 2; i++ ) // Run through a loop where i is increasing
		{
		    // Return the first digit in the string ... For testing
			// System.out.println("The first digit in the number you entered is " + word.charAt(i));
		    
			// Convert the digit to an int and add it
			char temp = word.charAt(i); // Make a temporary character
			int temp_b = Character.getNumericValue(temp); // Conver the character to an integer
			
			total = total + temp_b; // Add the value of the integer to the total
			s = s + temp; // Append the string with the character
			
		}
		
		int length_min_decim = length - 2;
		// Return the output to the user
		System.out.println("Thank you again for using the digit divider program!");
		System.out.println("You entered the number " + s);
		System.out.println("The sum of the " + length_min_decim + " digits in this number is: " + total);
	}
}
