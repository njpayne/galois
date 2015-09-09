package games;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Created by nathanielpayne on 9/8/2015. This is for the "Descent basic" program on CG"
 */
public class descent {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();

            int[] anArray = new int[8];

            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                anArray[i] = mountainH;
            }

            // Determine which value in an array has the highest; Note that this is done using the new Java 8 streams
            OptionalInt highest = Arrays.stream(anArray).max();
            int big = highest.getAsInt();

            System.err.println("The tallest mountain has height: " + big);
            System.err.println("The current position is: " + spaceX);

            // Find largest index checking up
            int largest = anArray[0], largestindex = 0;
            for (int i = 0; i < anArray.length; i++) {
                if (anArray[i] >= largest) {
                    largest = anArray[i];
                    largestindex = i;
                }
            }

            // Note that initially there were problems when multiple instances of the same height were in the
            // array. If anArray[i] > largest, the first instance is returned. On the other hand,
            // to change it, one  simply has to change the conditional from greater than to equals or greater than.

            System.err.println("The position of the largest index is at: " + largestindex);

            // Make a decision around when to fire (when the conditions for firing are met!)
            if(spaceX == largestindex){ // If the X position hits the largest index, then fire
                System.out.println("FIRE");
            } else { // Otherwise, do not fire
                System.out.println("HOLD");
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
        }
    }
}
