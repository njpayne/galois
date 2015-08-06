package elementary_programming;

// Write a program that prompts the user to enter a temperature between and
// and a wind speed greater than or equal to 2 and displays the wind-chill temperature

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner; // Import the scanner object

public class wind_chill {
	public static void main(String[] Args){
		
		// Create a new scanner object
		Scanner input = new Scanner(System.in);
				
		// Ask the user to input the temperature in farenheight
		System.out.println("Welcome to the wind chill converter program!");
		System.out.println("The wind chill index can be calculated using both the temperature and the wind speed (in mph)!");
		System.out.println("Please enter the temperature in F (between -58 and 41): ");
		double temp = input.nextDouble(); // Scan the next token as an input of a double
		
		System.out.println("Please enter the speed of the wind in mph (Note that wind speed must be greater than 2 mph): ");
		double wind = input.nextDouble(); // Scan the next token as an input of a double
		
		// Take the temperature and convert it to a wind chill score
		double chill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(wind, 0.16) + 0.4275 * temp * Math.pow(wind, 0.16); // Calculate the wind chill
				
		// Return the output
		System.out.println("Thank you for using the wind chill calculator!");
		System.out.println("You inputted that the temperature was " + temp + " degrees F and the wind speed was " + wind + " mph!");
		System.out.println("Based on this, the wind chill index was calculated to be " + format(chill));		
	}
	
	public static String format(Number n) {
        NumberFormat format = DecimalFormat.getInstance();
        format.setRoundingMode(RoundingMode.FLOOR);
        format.setMinimumFractionDigits(0);
        format.setMaximumFractionDigits(2);
        return format.format(n);
    }
}
