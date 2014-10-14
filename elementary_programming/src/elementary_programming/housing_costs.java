package elementary_programming;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class housing_costs {
	public static void main(String[] args){
	
		// Create a new scanner object
		@SuppressWarnings("resource") // Note that without this, input is never closed
		Scanner input = new Scanner(System.in); // This will be to process input
		
		// Initialize the program variables
		double rent, utilities, phones, cable, total_monthly, total_annual;
		
		// Prepare the program
		System.out.println("Welcome to the utilities calculator program!");
		System.out.println("This program takes inputs include expenses, rent, mortgage payments, utilities, "
				+ "phones, and cable, and calculates the total monthly and annual costs of these expenses!");
		System.out.println("To start this program, please enter your estimates for the following expenses.");
		
		// Get input for each of the variable in question
		System.out.println("How much do you estimate your monthly rent or mortgage expenses to be?");
		rent = input.nextDouble();
		System.out.println("How much do you estimate your monthly utilities expenses to be?");
		utilities = input.nextDouble();
		System.out.println("How much do you estimate your monthly phone expenses to be?");
		phones = input.nextDouble();
		System.out.println("How much do you estimate your monthly cable expenses to be?");
		cable = input.nextDouble();
		
		// Calculate relevant output
		total_monthly = rent + utilities + phones + cable;
		total_annual = total_monthly * 12;
		
		// Return output to the user
		System.out.println("Thank you for using our spending estimation program!");
		System.out.println("Based on all the expenses that you entered, I estimate that your total monthly costs are " + format(total_monthly) + " dollars!");
		System.out.println("Additionally, we project that your total annual housing related expenses are " + format(total_annual) + " dollars!");
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
