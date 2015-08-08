package elementary;

import java.util.Scanner;

/**
 * Created by nathanielpayne on 8/7/2015.
 *
 * Compute the volume of a cylinder) Write a program that reads in the radius and length
 * of a cylinder and computes the area and volume using the following suggested formulas:
 * area = radius * radius
 *
 */

public class volume {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create a new scanner object

        // Create the initial variables
        double radius;
        double length;
        double volume;

        // Intake the needed measurements
        System.out.println("Please enter the radius of the cylinder end in centimeters: ");
        radius = input.nextDouble();

        System.out.println("Please enter the length of the cylinder end in centimeters: ");
        length = input.nextDouble();

        // Complete the calculations
        volume = Math.PI * Math.pow(radius, 2) * length;

        // Return the output
        System.out.println("The volume of the cylinder you entered is " + Math.round(volume) + " centimeters cubed!");
    }
}
