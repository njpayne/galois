package elementary_programming;

import java.math.RoundingMode; // Import rounding mode for rounding
import java.text.DecimalFormat; // Import decimal format library for decimal formatting
import java.text.NumberFormat; // Import number formatting library
import java.util.Scanner; // Scanner is used to read data from the console

public class stadium_seating {
	public static void main(String[] args){
		
		// Create a new scanner object
		@SuppressWarnings("resource") // Note that without this, input is never closed
		Scanner input = new Scanner(System.in); // This will be to process input
		
		// Declare all the relevant variables
		double class_a, class_b, class_c, cost_class_a, cost_class_b, cost_class_c, total_cost;
		
		// Fill in ticket pricing (in future this could be a lookup from a database or other table)
		cost_class_a = 15; cost_class_b = 12; cost_class_c = 9;
		
		// Prepare the user to work on the program
		System.out.println("Welcome to the ticket selection program!");
		System.out.println("There are currently three types of tickets that you can purchase!");
		System.out.println("Class A tickets cost $15, class B tickets cose $12, and class C tickets cost $9!");
		System.out.println("Please confirm the total number of tickets that you would like to purchase?");
		
		// Get user input
		System.out.println("How many class A tickets would you like to purchase?");		
		class_a = input.nextDouble(); // Get the input that the user enters
		
		System.out.println("How many class B tickets would you like to purchase?");		
		class_b = input.nextDouble(); // Get the input that the user enters
		
		System.out.println("How many class C tickets would you like to purchase?");		
		class_c = input.nextDouble(); // Get the input that the user enters
								
		// Calculate the total cost of the transaction
		total_cost = (class_a * cost_class_a) + (class_b * cost_class_b) + (class_c * cost_class_c);
			
		// Return the output to the user
		System.out.println("Based on the values that you input, the total cost of your transaction is $ " + format(total_cost) + " dollars!");
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
