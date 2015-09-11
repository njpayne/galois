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

        System.err.println("The total number of temperatures to analyze is: " + n);
        System.err.println("The temperatures input are: " + temps);

        // Initially, the temperates are held in a string
        // Need to separate temperatures out into individual pieces
        // Note that there is no need to push the temp values into an array INITIALLY since the input is a string

        // Split the string into an array
        String numericalArray = new String[n];

        OptionalInt smallest = Arrays.stream(temps).min();
        int smallest = smallest.getAsInt();

        System.err.println("The tallest mountain has height: " + big);

        numericalArray = java.util.Arrays.toString(testString.split("\\s+"));
        System.err.println("The numerical array looks like: " + numericalArray);

        System.out.println(2); // This prints the expected value (a variable)
    }
}
