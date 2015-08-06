package elementary_programming;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

// Write a program that reads in the radius and length of a cylinder and computes the area and volume

public class volume_of_cylinder {
	public static void main(String[] args){
		// Provide the ability to enter data from the command line & create a new Scanner object
		Scanner input = new Scanner(System.in); // Create the new scanner object
		// Potential improvement next time by providing entry from a labelled pop-up box ...
		
		// Input data from the command line using the new Scanner object
		System.out.println("Welcome to the area calculator program!");
		System.out.println("Please enter the radius and the length of the cylinder: ");
		double r = input.nextDouble(); // grab the radius of the cylinder
		double l = input.nextDouble(); // grab the length of the cylinder
		
		// Calculate the area and volume of the cylinder
		double area = r * r * Math.PI; // Note that the formula is pi * r^2
		double volume = area * l;
		
		// Return the area and volume of the cylinder to the user
		System.out.println("You told me that the cylinder has a radius of " + r + " and a length of " + l + ".");
		System.out.println("Based on this, I calculate that the area of the cylinder is " + format(area));
		System.out.println("Additionally, the volume of the cylinder is " + format(volume) + "!");
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
