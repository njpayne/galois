package games;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Created by nathanielpayne on 9/7/2015. This is for the "Thor" program on CG"
 *
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/

class Player {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        int thorX = initialTX;
        int thorY = initialTY;

        // game loop or a single game string
        while (true) {
            int remainingTurns = in.nextInt();

            String directionX = ""; // Initiatlize a blank game string for the X
            String directionY = ""; // Initialize a blank game string for the Y

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            if(thorX > lightX){
                directionX = "W";
                thorX = thorX - 1;
            } else if(thorX < lightX){
                directionX = "E";
                thorX = thorX + 1;
            } else {
                directionX = "";
                thorX = thorX + 0;
            }

            if(thorY > lightY){
                directionY = "N";
                thorY = thorY - 1;
            } else if(thorY < lightY){
                directionY = "S";
                thorY = thorY + 1;
            } else {
                directionY = "";
                thorY = thorY + 0;
            }

            // Am not pleased yet with the optimal angle calculation as that could be improved!
            System.out.println(directionY + directionX);
            //System.out.println("SE"); // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
}
