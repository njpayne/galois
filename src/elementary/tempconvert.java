package elementary;

import java.util.Scanner;

/**
 * Created by nathanielpayne on 8/7/2015.
 *
 * Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in - a double value from the
 * console, then converts it to Fahrenheit and displays the - result.
 * The formula for the conversion is as follows: fahrenheit = (9 / 5) * celsius + 32
 *
 */

public class tempconvert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create the new scanner input

        // declare the main variables
        double celcius;
        double farenheight;

        System.out.println("Please enter the temperature in celcius that you want ot convert to F: ");
        celcius = input.nextDouble(); // Input the celcius

        // Convert the temperature
        farenheight = (9/5)*celcius + 32;

        // Return the output
        System.out.println("The converted temperature is " + Math.round(farenheight) + " degrees farenheight!");

    }
}
