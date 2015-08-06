package elementary_programming;

// Write a program that reads in investment amount, annual interest rate, and number of years, and displays
// the future investment valueFor example, if you enter amount 1000, annual interest rate 3.25%, and number of
// years 1, the future investment value is 1032.98.

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner; // Import the new scanner object	

public class future_value {
	public static void main(String[] Args){
		
		// Create a new scanner object used to grab the data
		Scanner input = new Scanner(System.in); // Create a new scanner object
		
		// Input the initial investment amount, annual interest rate, and the number of years
		System.out.println("Welcome to the future value investment calculator application!");
		System.out.println("Please enter the amount that you wish to invest:");
		double inv = input.nextDouble(); // Input the investment amount
		
		System.out.println("Please enter the annual interest rate that you have secured:");
		double rate = input.nextDouble();
		
		System.out.println("Please enter the number of years that you plan on holding the investment for:");
		double years = input.nextDouble();
		
		// Calculate the future investment value of the asset
		double future = inv * Math.pow((1 + ((rate/100) / 12)), years * 12); 
		
		// Return the final value to the user
		System.out.println("Thank you for using the interest rate calculator!");
		System.out.println("Based on your inputs, the accumulated future value of your asset is $" + format(future) + " dollars!");
	}
	
	// Create a new class that can be used for formatting any number
	public static String format(Number n) {
        NumberFormat format = DecimalFormat.getInstance(); // Get the instance of the number
        format.setRoundingMode(RoundingMode.FLOOR); // Round the number
        format.setMinimumFractionDigits(0); // Set the minimum fraction digits to 0
        format.setMaximumFractionDigits(2); // Set the maximum fraction digits to 2
        return format.format(n); // Return the formatted number
    }
}
