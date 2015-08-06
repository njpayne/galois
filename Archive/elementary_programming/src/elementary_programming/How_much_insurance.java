package elementary_programming;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class How_much_insurance {

	public static void main(String[] args) {
		
		// Create a new scanner object
		@SuppressWarnings("resource") // Note that without this, input is never closed
		Scanner input = new Scanner(System.in); // This will be to process input
		
		// Declare the new variables for the program
		double replacement_cost, min_insurance; // Declare the needed variables
			
		// Instantiate the program
		System.out.println("Welcome to the insurance calculation program!");
		System.out.println("This program takes the replacement cost of your building, and then determines the minimum");
		System.out.println("amount of insurance that you should purchase for the property!");
		
		// Gather the inputs from the users
		System.out.println("What is the total replacement cost of the building that you own?");
		replacement_cost = input.nextDouble(); // Pull in the next double
			
		// Calculate the replacement costs
		min_insurance = replacement_cost * 0.8;
			
		// Return the output to the user
		System.out.println("Your building has a replacement cost of " + format(replacement_cost));
		System.out.println("We recommend that you get at least " + format(min_insurance) +" dollars in insurance for your property!");			
	}
	
	// Create a new method that will format the string with the correct number of decimals
	public static String format(Number n) {
        NumberFormat format = DecimalFormat.getInstance();
        format.setRoundingMode(RoundingMode.FLOOR);
        format.setMinimumFractionDigits(0);
        format.setMaximumFractionDigits(2);
        return format.format(n);
    }	
}
