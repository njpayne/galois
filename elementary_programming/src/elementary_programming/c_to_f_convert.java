// Program written by Nathaniel Payne, March 25, 2013
// Senior Data Architect, Cardinal Path

package elementary_programming;

import java.math.RoundingMode; // Import rounding mode for rounding
import java.text.DecimalFormat; // Import decimal format library for decimal formatting
import java.text.NumberFormat; // Import number formatting library
import java.util.Scanner; // Scanner is used to read data from the console

// Write a program that reads a Celcius degree in a
// double value from the console, then converts it to Fahrenheit and displays the result
public class c_to_f_convert {
	public static void main(String[] args) {
		
	// Create a new Scanner object
	Scanner input = new Scanner(System.in); // Create the new scanner object
	
	// Read in the data as doubles
	System.out.println("Please enter the current temperature in Celcius!");
	System.out.println("This program will take the input and convert it to farenheight!");
	System.out.println("The temperate that you wish to convert is: ");
	double c = input.nextDouble(); // This takes the input and produces the output ...
		
	// Run the calculation
	double f = c * 9/5 + 32; // This is the formula used to convert the temp to f
		
	// Produce the final output
	System.out.println("You entered the following temperature: " + format(c) + " degrees Celcius!");
	System.out.println("This temperature converts to " + format(f) + " degrees Farenheit!");
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
