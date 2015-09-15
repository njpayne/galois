package games;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Created by nathanielpayne on 9/13/2015. This is for the "horse racing basic" program on CG
 */

public class horseracingdual {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int anArray[] = new int[n]; // Create a new array that is n units long

        for (int i = 0; i < n; i++) {
            int pi = in.nextInt();
            System.err.println(pi);
            anArray[i] = pi; // Add these values into a single dimensional array
        }

        // Find the max and min in the array and figure out the max difference
        OptionalInt highest = Arrays.stream(anArray).max(); //
        int highestvalue = highest.getAsInt(); // Get the highest value as an integer

        OptionalInt lowest = Arrays.stream(anArray).min(); //
        int lowestvalue = lowest.getAsInt(); // Get the lowest value as an integer

        int maxdiff = highestvalue - lowestvalue;
        System.err.println("The maximum difference between the highest and the lowest is " + maxdiff);

        Arrays.sort(anArray); // Sort the array

        if (anArray.length > 1) { // If the length of the array is greater than 1
            int d = Math.abs(anArray[0] - anArray[1]); // The distance initially is the difference between value at position 0 and 1
            for (int i = 0; i <= anArray.length; i++) { // For every value from the start to the ith value
                if (i + 1 < anArray.length) { // If this is less than the array length
                    int t = Math.abs(anArray[i] - anArray[i + 1]); // Compare the next array
                    if (t < d){
                        d = t;
                    }
                }
            }
            System.err.println("The difference that I believe is the smallest is: " + d);
            System.out.println(d);
        }
        System.out.println(""); // The array does not have length greater than 1. Thus, no ball needed!
    }
}
