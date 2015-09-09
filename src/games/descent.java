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

            OptionalInt highest = Arrays.stream(anArray).max();
            int big = highest.getAsInt();

            System.err.println("The tallest mountain has height: " + big);
            System.err.println("The current position is: " + spaceX);

            // Find largest index
            int largestindex = anArray[0];

            for(int i = 0; i < anArray.length; i++) {
                if(anArray[i] > largestindex)
                    largestindex = i;
            }

            System.err.println("The position of the largest index is at: " + largestindex);

            if(spaceX == largestindex){
                System.out.println("FIRE");
            } else {
                System.out.println("HOLD");
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
        }
    }

}
