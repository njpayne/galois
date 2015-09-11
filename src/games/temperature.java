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

        // Initially, the temperates are held in a string
        // Need to separate temperatures out into individual pieces
        String temparray[] = temps.toString().split(" ");

        System.err.println("The total number of temperatures to analyze is: " + n);
        System.err.println("The temperatures input are: " + temps);

        // Split the string into an array
        if(n == 0){
            System.out.println(0); // This prints the expected value (a variable)
        } else{ // Note that I did not do validation for a negative n (assuming n is positive)
            //System.err.println(temparray[1]); // Test print the first array

            // Convert the string values to integer values
            for(int i = 0; i < temparray.length; i++){
                int newtemparray[i] = Integer.parseInt(temparray[i]);
            }

            System.err.println("The temperatures converted to integers are: " + temps);

            int[] newtemparray = new int[n];
            int myNumber = 0;
            int distance = Math.abs(newtemparray[0] - myNumber);
            int idx = 0;

            for(int i = 0; i < temparray.length; i++){
                int cdistance = Math.abs(newtemparray[i] - myNumber);
                if(cdistance < distance){
                    idx = i;
                    distance = cdistance;
                }
            }

            int theNumber = newtemparray[idx];
            System.err.println("Based on the algorithm I believe the number closest to : " + myNumber + " is " + theNumber);

            System.out.println(4);
        }
    }
}
