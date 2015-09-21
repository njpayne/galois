package games;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Created by nathanielpayne on 9/21/2015. This is for the "indiana intermediate" program on CG
 */
public class indiana {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt(); // number of columns.
        int h = in.nextInt(); // number of rows.
        in.nextLine();
        for (int i = 0; i < h; i++) {
            String lINE = in.nextLine(); // represents a line in the grid and contains W integers. Each integer represents one room of a given type.
        }
        int eX = in.nextInt(); // the coordinate along the X axis of the exit (not useful for this first mission, but must be read).
        in.nextLine();

        // game loop
        while (true) {
            int xI = in.nextInt();
            int yI = in.nextInt();
            String pOS = in.next();
            in.nextLine();

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println("0 0"); // One line containing the X Y coordinates of the room in which you believe Indy will be on the next turn.
        }
    }
}
