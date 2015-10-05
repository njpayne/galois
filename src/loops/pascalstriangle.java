package loops;

import java.util.*;

/**
 * Created by nathanielpayne on 10/4/2015. Pattern completion; Pascal's triangle. 5 min clash on CG.
 * A number is provided and the user has to generate the number from the observations
 * E.g. Input = 5 & output = 15; Input = 7 & output = 28
 *
 * Pascal's triangle looks like the following: 5 = the 5 + 1 index or the 6th row. The sum is the sum of the second and third digits
 1
 1 1
 1 2 1
 1 3 3 1
 1 4 6 4 1
 1 5 10 10 5 1
 *
 */

public class pascalstriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); // Create the new scanner object

        System.out.print("Enter the row number up to which Pascal's triangle has to be printed: ");
        int row = in.nextInt(); // Get the row number
        print(row); // Use the print function to print out the rows
    }

    public static void print(int n) { // This print function which prints the rows of teh data
        int[] previousRow; // Create a new previous row array
        int[] currentRow = {1}; // Create a new current row array
        printArray(currentRow); // Call the printArray function
        previousRow = currentRow;

        for (int i = 2; i <= n; i++) {
            currentRow = new int[i];
            currentRow[0] = 1;
            currentRow[i - 1] = 1;
            for (int j = 0; j <= i - 3; j++) {
                currentRow[j + 1] = previousRow[j] + previousRow[j + 1];
            }

            printArray(currentRow);
            previousRow = currentRow;
        }
    }

    public static void printArray(int[] array) { // This function takes an array for the current row and prints the data
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
