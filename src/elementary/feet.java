package elementary;

import java.util.Scanner;

/**
 * Created by nathanielpayne on 8/8/2015.
 *
 * (Convert feet into meters) Write a program that reads a number in feet, converts it to meters, and displays the result.
 * One foot is 0.305 meters.
 */

public class feet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the feet to meter conversion program!"); // Interface this later
        System.out.println("Please enter the total feet that you would like to convert to meters:");

        double feet = input.nextDouble(); // Define the feet variable and input the variable

        double meter = feet * 0.305; // Calculate the approximate number of meters

        System.out.println("You entered " + feet + " feet into this conversion program!");
        System.out.println("This converts to approximately  " + Math.round(meter) + " meters!");
    }
}
