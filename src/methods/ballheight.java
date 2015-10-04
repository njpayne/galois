package methods;

import java.util.*;

/**
 * Created by nathanielpayne on 10/4/2015.  5 min clash on CG. A ball is dropped and bounces. At each rebound
 * the ball reaches half the height of the previous rebound. How high must the ball be dropped so that it reaches exactly
 * the height H after the sixth rebound?
 */

public class ballheight {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); // Create the new scanner

        System.out.println("Welcome to the height game!");
        System.out.println("Please tell me the number of rebounds that the ball takes: ");
        Integer rebounds = in.nextInt(); // Get the number of rebounds

        System.out.println("Please tell me the ending height of the ball: ");
        Integer endingheight = in.nextInt(); // Get the ending height after the n rebounds have passed
        Integer saveendingheight = endingheight;
        Integer startingheight = 0; // We will add the starting height to this

        for(int i = 0; i < rebounds; i++){
            endingheight = startingheight + heightdouble(endingheight);
        }
        System.out.println("Based on this work, if the ball ends at height " + saveendingheight + " after " + rebounds + " rebounds, " +
                "then the starting height of the ball must have been at " + endingheight + ".");
    }

    public static int heightdouble(int n) {
        if (n == 0) {
            return 0; // The ball is already on the ground if there are no rebounds
        } else {
            return n*2; // Double the initial height to work backwards through the series
        }
    }
}
