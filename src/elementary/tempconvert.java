package elementary;

import java.util.Scanner; // Import the scanner utility
7
/**
 * Created by nathanielpayne on 8/7/2015.
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
