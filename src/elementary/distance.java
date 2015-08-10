package elementary;

import java.util.Scanner;

/**
 * Created by nathanielpayne on 8/10/2015.
 *
 * Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their
 * distance between them. The formula for computing the distance is sqrt((x2 x1)^2 + (y2 y1)^2).
 * Note that you can use Math.pow(a, 0.5) to compute sqrt(a).
 *
 * May later extend this to include graphical properties as well as an object oriented approach
 */

public class distance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create the new scanner object

        // Have the user input the initial variables
        System.out.println("Welcome to the two dimensional distance calculation program!");

        System.out.println("Enter the X cooridnate of the first point on the grid!");
        double firstx = input.nextDouble();

        System.out.println("Enter the Y cooridnate of the first point on the grid!");
        double firsty = input.nextDouble();

        System.out.println("Enter the X cooridnate of the second point on the grid!");
        double secondx = input.nextDouble();

        System.out.println("Enter the Y cooridnate of the first point on the grid!");
        double secondy = input.nextDouble();

        // Complete the calculation using the formula sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distance = Math.pow((Math.pow(secondx - firstx,2) + Math.pow(secondy - firsty,2)),0.5);

        // Return the calculation to the user
        System.out.println("The total distance between the two points is approximately: " + Math.round(distance));
        // Fix rounding issues to allow decimals

    }
}
