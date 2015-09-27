package recursion;

import java.util.*;

/**
 * Created by nathanielpayne on 9/26/2015. 5 min clash on CG. Output the first N numbers of the Fibonnaci sequence
 * The initial numbers in the string are 0, 1, 1, 2, 3, 5, 8, 13, 21
 * The sequence is the following. If n = 0, return 0; If n = 1, return 1, else if n >= 2, return F(n-1) + F(n-2)
 */
public class fibonnaci {
    public static void main(String[] args){ // Create a function that will run through n numbers and output them
        Scanner in = new Scanner(System.in); // Create a new scanner object

        System.out.println("Welcome to the Fibonnaci program! Please enter the number of numbers you want to see generated using simple recursion: ");
        Integer n = in.nextInt(); // Ingest the number of terms to display
        for (int i = 0; i < n; i++) // Note that in the game we want the n-1 numbers; Thus, I write i < n vs i <= n
            System.out.print(fib(i)+" "); // Output the next fibonnaci numbers
    }

    public static int fib(int n) { // Create the simple recursive equation. Note that this is extremely time intensive requiring O(2^n). Improve later!
        if (n < 2) { // The sequence is formed by adding together the previous two numbers. If there are less than 2, then the inputted n should be returned
            return n; // Return the inputted n
        } else {
            return fib(n-1) + fib(n-2); // Add the two previous n's by having the function call itself
        }
    }
}
