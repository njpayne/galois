package games;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Created by nathanielpayne on 9/10/2015. This is for the "temperature basic" program on CG"
 */
public class temperature {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        int[] finalarray = new int[n]; // Create a new temp array to hold integer numbers
        int[] absfinalarray = new int[n]; // Create a new temp array to hold integer numbers
        int[] posabsfinalarray = new int[n]; // Create a new temp array to hold integer numbers IF all the values are negative

        // Initially, the temperates are held in a string
        // Need to separate temperatures out into individual pieces
        String temparray[] = temps.toString().split(" ");

        System.err.println("The total number of temperatures to analyze is: " + n);
        System.err.println("The temperatures input are: " + temps);

        // Split the string into an array
        if(n == 0){ // There is only one value entered
            System.out.println(0); // This prints the expected value (a variable)
        } else if(n == 1){ // There is a single value entered (eg. the edge cases: -273 or 5526)
            System.out.println(Integer.parseInt(temparray[0]));
        } else { // Note that I did not do validation for a negative n (assuming n is positive)

            // Convert the string values to integer values
            for(int i = 0; i < temparray.length; i++){
                int tempnum = Integer.parseInt(temparray[i]);
                System.err.println("The temperatures converted to integers are: " + tempnum);
                finalarray[i] = tempnum;
            }

            // Check if all the cases are negative
            int count = 0; // Create a negative counter
            for(int i = 0; i < finalarray.length; i++){
                if(finalarray[i] < 0){
                    count = count + 1;
                }
            }

            // Deal with the case that all the values are negative
            if(n == count){ // All the numbers are negative
                // Find the highest absolute value of the array and use this to annotate the largest difference possible
                // Just actually need the highest negative
                OptionalInt highest = Arrays.stream(finalarray).max();
                int highestneg = highest.getAsInt(); // Get the lowest value as an integer

                System.out.println(highestneg); // Return the highest negative value

            } else { // All the numbers are not negative
                System.err.println("The array of temperatures converted to integers are: " + finalarray);
                System.err.println("The first value in the array is " + finalarray[0]);
                System.err.println("The last value in the array is " + finalarray[n-1]);

                // Find the highest absolute value of the array and use this to annotate the largest difference possible
                // Create a new array with only positive numbers in it (absolute value)
                for(int i = 0; i < finalarray.length; i++){
                    int tempnumabs = Math.abs(finalarray[i]);
                    absfinalarray[i] = tempnumabs;
                }

                System.err.println("The first value in the abs array is " + absfinalarray[0]);
                System.err.println("The second value in the abs array is " + absfinalarray[1]);
                System.err.println("The last value in the abs array is " + absfinalarray[n-1]);

                // Find the largest delta by checking the values in the array and subtracting them from zero
                int[] deltafinalarray = new int[n]; // Create a new temp array to hold delta integers
                int myNumber = 0; // This refers to the number that we are comparing against
                // Note that I don't need this. That said, if the center changes from 0, then this is useful!

                for(int i = 0; i < absfinalarray.length; i++){
                    int tempdiff = Math.abs(absfinalarray[i] - myNumber);
                    deltafinalarray[i] = tempdiff;
                }

                System.err.println("The first difference is " + deltafinalarray[0]);
                System.err.println("The second difference is " + deltafinalarray[1]);
                System.err.println("The last difference is " + deltafinalarray[n-1]);

                // Compare each of the answers to find the lowest index
                int smallest = deltafinalarray[0], smallestindex = 0;
                for (int i = 0; i < deltafinalarray.length; i++) {
                    if (deltafinalarray[i] < smallest) {
                        smallest = deltafinalarray[i];
                        smallestindex = i;
                    }
                }

                System.err.println("I believe the position of the smallest index is at: " + smallestindex);

                int smallestfinal = finalarray[smallestindex]; // Get the value of the smallest index
                System.err.println("Based on the algorithm I believe the number closest to " + myNumber + " is " + smallestfinal);
                System.err.println("Let me check to make sure I always have a positive smallest!");

                if(smallestfinal < 0){
                    // Check for a matching positive and return that index if there is one
                    int abssmallestfinal = Math.abs(smallestfinal); // This is the absolute value of the smallest

                    for(int i = 0; i < finalarray.length; i++){
                        if(finalarray[i] == abssmallestfinal){
                            int correctedindex = i; // You switch from the negative value and take the positive
                            System.err.println("I believe the corrected index is at position " + correctedindex);
                            System.err.println("I believe the corrected min value is " + finalarray[correctedindex]);
                            System.out.println(finalarray[correctedindex]);
                        }
                    }
                } else {
                    System.out.println(smallestfinal); // Take the value that is positive
                }
            }
        }
    }
}
