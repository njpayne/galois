package elementary;

import java.util.Scanner; // Import the scanner

public class area{

    // Create a program that computes the area of a circle
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a new scanner object

	    // Create the variables that you need
        double radius; // Radius
        double area; // Area
        double pi = Math.PI; // Create the PI variable using the Math.PI library

        // Input the variable metrics
        System.out.println("Please enter the radius of the circle (in mm) that you want to calculate:");
        radius = input.nextDouble(); // Ingest the radius from the command line
        // radius = 20;

        // Calculate the area of the circle
        area = pi * Math.pow(radius,2); // Calculate the area of the circle

        // Return the area to the console
        System.out.println("The rounded area of the circle in mm is " + Math.round(area)); // Spit out the relevant area
    }
}
