package games;

import java.util.*;

/**
 * Created by nathanielpayne on 9/7/2015. This is for the "Chasm basic" program on CG"
 */

class chasmbasic { // Stored in game as player
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int road = in.nextInt(); // the length of the road before the gap.
        int gap = in.nextInt(); // the length of the gap.
        int platform = in.nextInt(); // the length of the landing platform.

        // game loop
        while (true) {
            int speed = in.nextInt(); // the motorbike's speed.
            int coordX = in.nextInt(); // the position on the road of the motorbike.

            if(road + gap > coordX){ // We have not jumped and landed - either drive, jump or land
                if(road - coordX > gap + 1){

                    if(speed < gap + 1){ // We need to accelerate
                        System.out.println("SPEED");

                        System.err.println("Speed: " + speed);
                        System.err.println("X Coord: " + coordX);
                        System.err.println("Gap length: " + gap);
                        System.err.println("Road length: " + road);
                        System.err.println("Platform length: " + platform);
                    } else if(speed > gap + 1){ // We need to decelerate as starting with too much speed
                        System.out.println("SLOW");

                        System.err.println("Speed: " + speed);
                        System.err.println("X Coord: " + coordX);
                        System.err.println("Gap length: " + gap);
                        System.err.println("Road length: " + road);
                        System.err.println("Platform length: " + platform);
                    } else { // We do not need to change our speed
                        System.out.println("WAIT");

                        System.err.println("Speed: " + speed);
                        System.err.println("X Coord: " + coordX);
                        System.err.println("Gap length: " + gap);
                        System.err.println("Platform length: " + platform);
                    }
                } else {
                    System.out.println("JUMP");
                }
            } else { // We have landed and need to decelerate
                System.out.println("SLOW");
            }
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        // System.out.println("SPEED"); // A single line containing one of 4 keywords: SPEED, SLOW, JUMP, WAIT.
    }
}
