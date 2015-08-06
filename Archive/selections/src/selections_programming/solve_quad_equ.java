package selections_programming;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner; // Create the scanner class for the equation solver

// Write a program that prompts the user to enter values for a, b, and c and displays
// the result based on the discriminant. If the discriminant is positive, display two
// roots. If the discriminant is 0, display one root. Otherwise, display “The equation
// has no real roots”.

public class solve_quad_equ {
	public static void main(String[] args) {
		
		// Create a new scanner object
		Scanner input = new Scanner(System.in);
		
		// Get the initial value from the user
		System.out.println("Welcome to the quadratic equation solving tool!");
		System.out.println("Please enter the values of a, b, and c in order to determine the appropriate roots!");
		System.out.println("Enter the value for a:");
		double a = input.nextDouble(); // Grab the value of a as a double; input is the object name
		
		System.out.println("Enter the value for b:");
		double b = input.nextDouble(); // Grab the value of a as a double; input is the object name
		
		System.out.println("Enter the value for c:");
		double c = input.nextDouble(); // Grab the value of a as a double; input is the object name
		
		// Calculate the value of the diecriminant
		double discrim = Math.pow(b, 2) - 4 * a * c; // This is the value of the discriminant
		
		if(discrim > 0){ // This is the case that will go if the discriminant is zero
			double root2a = (-b + Math.sqrt(discrim)) / (2 * a); // Calculate the first root
			double root2b = (-b - Math.sqrt(discrim)) / (2 * a);	 // Calculate the second root
			System.out.println("Thank you for using the quadratic equation solver!");
			System.out.println("The equation that you entered as the folling roots: ");
			System.out.println("Root 1: " + format(root2a));
			System.out.println("Root 2: " + format(root2b));
		}
		
		else if (discrim == 0){ // Problem here is that I am doing an unnecessary calculation
			double root1a = (-b) / (2 * a); // Calculate the only root for the problem
			System.out.println("Thank you for using the quadratic equation solver!");
			System.out.println("The equation that you entered has only one root! This root it: ");
			System.out.println("Root: " + format(root1a));
		}
		
		else {
			System.out.println("Sorry. The equation that you entered has no real roots!");
		}
	}
	
	public static String format(Number n) {
        NumberFormat format = DecimalFormat.getInstance();
        format.setRoundingMode(RoundingMode.FLOOR);
        format.setMinimumFractionDigits(0);
        format.setMaximumFractionDigits(2);
        return format.format(n);
    }
}
