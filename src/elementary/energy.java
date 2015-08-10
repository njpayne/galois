package elementary;

import java.util.Scanner;

/**
 * Created by nathanielpayne on 8/10/2015.
 *
 * (Science: calculating energy) Write a program that calculates the energy needed to heat water from an initial
 * temperature to a final temperature. Your program should prompt the user to enter the amount of water in kilograms
 * and the initial and final temperatures of the water. The formula to compute the energy is Q = M * (finalTemperature – initialTemperature) * 4184
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in joules.
 */

public class energy {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create the new scanner object

        System.out.println("Welcome to the energy conversion program!");
        System.out.println("Please enter the amount of water to be considered within the program (in kilograams): ");
        double water = input.nextDouble();

        System.out.println("Please enter the amount of starting temperature of the water in degrees C: ");
        double starttemp = input.nextDouble();

        System.out.println("Please enter the ending temperature of the water in degrees C: ");
        double endtemp = input.nextDouble();

        double energy = water * (endtemp - starttemp) * 4184; // Calculate the amount of energy used in joules

        System.out.println("The total energy used is approximately " + Math.round(energy) + " joules!");
    }
}
