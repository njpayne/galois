package elementary_programming;

import java.math.RoundingMode; // Import rounding mode for rounding
import java.text.DecimalFormat; // Import decimal format library for decimal formatting
import java.text.NumberFormat; // Import number formatting library
import java.util.Scanner; // Scanner is used to read data from the console

/* Write a program that calculates a car's gas mileage. The program should ask the user to enter the number of gallons of gas the car can
hold and the number of miles it can be driven on a full tank. It should then calculate and display the number of miles
per gallon that the car gets */

public class miles_per_gallon { // Create the new miles per gallon class
	public static void main(String[] args){ // Create the new main string
		
		// Create a new scanner object
		@SuppressWarnings("resource") // Note that without this, input is never closed
		Scanner input = new Scanner(System.in); // This will be to process input
		
		// Declare all the relevant variables
		float gallons, miles, miles_per_gallon;
		
		// Prepare the user to enter the data
		System.out.println("Welcome to the miles per gallon calculation program!");
		System.out.println("This program calculates the average miles per gallon that a basic car can get.");
		System.out.println("Please enter the number of gallons that the fuel tank can hold, as well as the miles that it can be driven on a full tank.");
		
		// Get the input from the user
		System.out.println("Number of gallons:");
		gallons = input.nextFloat(); // Get the input that the user enters
		
		System.out.println("Miles that it can be driven:");
		miles = input.nextFloat(); // Get the next float input
		
		// Process the data
		miles_per_gallon = miles / gallons;
		
		// Return outputs to the user
		System.out.println("Based on your entry, this vehicle gets a total of " + format(miles_per_gallon) + " miles per gallon!");		
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