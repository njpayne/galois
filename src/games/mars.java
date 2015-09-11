package games;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Created by nathanielpayne on 9/10/2015. This is for the "Mars basic" program on CG"
 */
public class mars {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        for (int i = 0; i < surfaceN; i++) {
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
        }

        // game loop
        while (true) {
            int x = in.nextInt();
            int y = in.nextInt();
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int power = in.nextInt(); // the thrust power (0 to 4).

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.err.println("Vertical speed: " + vSpeed); // Output the vertical speed

            if(y > 2000){ // Do not turn on the engines since you need 2000 units of fuel to land from 2000 feet
                System.out.println("0 2"); // Need to mathematically optimize this later
            } else { // You only have 500 feet left and can slow things down
                if(vSpeed <= -4){
                    System.out.println("0 4"); // If vertical speed is less than or equal to -40, slow descent
                } else {
                    System.out.println("0 0"); // Vertical speed is great than -40, no thrust
                }
            }
            //System.out.println("-20 3"); // rotate power. rotate is the desired rotation angle. power is the desired thrust power.
        }
    }
}
