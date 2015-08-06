package elementary_programming;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

// Write a program that reads the sub-total and
// the gratuity rate, then computes the gratuity and total. For example, if the user
// enters 10 for sub-total and 15% for gratuity rate, the program displays $1.5 as gratuity
// and $11.5 as total.

public class gratuity {
	public static void main(String[] Args){
		
		// Instantiate the Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user and ask for inputs
		System.out.println("Welcome to the gratuity calculator tool!");
		System.out.println("Please input the gross amount that you paid for the dinner before gratuity: ");
		
		double d = input.nextDouble(); // Input the total cost of the dinner
		
		System.out.println("Please enter, in percentages, the total gratuity percentage: ");
		
		double g_per = input.nextDouble(); // Input the total percentage of the gratuity
		
		// Calculate the gratuity
		double g_owed = d * (g_per / 100); // Create a new gratuity for the amount owed
		
		// Return to the user the amount that they are owed
		System.out.println("Thank you for using the gratuity planner!");
		System.out.println("After paying $" + format(d) + " dollars, you owe a total gratuity of $" + format(g_owed) + " dollars!");
		System.out.println("We look forward to seeing you at our restaurant again!");
	}
	
	public static String format(Number n) {
        NumberFormat format = DecimalFormat.getInstance();
        format.setRoundingMode(RoundingMode.FLOOR);
        format.setMinimumFractionDigits(0);
        format.setMaximumFractionDigits(2);
        return format.format(n);
    }
}
