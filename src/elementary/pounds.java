package elementary;

import java.util.Scanner;

/**
 * Created by nathanielpayne on 8/9/2015.
 *
 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
 * The program prompts the user to enter a number in pounds, converts it to kilograms,
 * and displays the result. One pound is 0.454 kilograms.
 */

public class pounds {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Ingest the new file

        System.out.println("Welcome to the pounds to kilogram conversion program!");
        System.out.println("Please enter the number of pounds you would like to convert:");

        double pounds = input.nextDouble(); // Input the pounds to be converted
        double kilo = pounds * 0.454; // Convert pounds to kilograms

        System.out.println("You entered a total of " + pounds + " pounds to be converted to kilograms!");
        System.out.println("This converts to a total of approximately " + Math.round(kilo) + " kilograms!");
    }
}
