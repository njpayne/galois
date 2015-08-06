package elementary_programming;

// Write a program that reads the following information and prints a payroll statement:
// Employee’s name (e.g., Smith)
// Number of hours worked in a week (e.g., 10)
// Hourly pay rate (e.g., 6.75)
// Federal tax withholding rate (e.g., 20%)

import javax.swing.JOptionPane; // Used for opening a swing frame

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner; // Used for opening a scanner object on the command line

public class payroll_display {
	public static void main(String[] Args){
		
		// Ask the user to enter the relevant information

		String employeename = JOptionPane.showInputDialog(
				"Please enter the name of the employee:");
		
		String hoursstring = JOptionPane.showInputDialog(
				"Please enter the number of hours that the employee worked during the week:");
		
		String hourlypayratestring = JOptionPane.showInputDialog(
				"Please enter the hourly pay rate of this employee:");
		
		// Convert relevant strings to doubles
		double hours = Double.parseDouble(hoursstring); // Test with 10 hours
		double hourlypayrate = Double.parseDouble(hourlypayratestring); // Test with 6.75
				
		// Calculate deductions and final payroll
		double gross_pay = hours * hourlypayrate; 
		double fed_withhold = hours * hourlypayrate * 0.2;
		double state_withhold = hours * hourlypayrate * 0.09;
		double total_deduction = fed_withhold + state_withhold;
		double net_pay = (hours * hourlypayrate) - total_deduction;
		
		// Return information to the user
		String output = "Thank you for using the employee payroll calculator! \n Below is a summary of the employees payroll for the week"
				+ "\n \n Employee Name: " + employeename + "\n Hours Worked:" + format(hours) + "\n Pay Rate: " + format(hourlypayrate) + 
				"\n Gross Pay: " + format(gross_pay) + "\n Deductions: \n \t \t \t Federal Withholding (20.0%): " + format(fed_withhold) + 
				"\n \t \t \t State Withholding (9.0%): " + format(state_withhold) + "\n \t \t \t Total Deductions: " + format(total_deduction) + 
				"\n Net Pay: " + format(net_pay);
		JOptionPane.showMessageDialog(null, output); // Put the message back in the outbound variable
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
