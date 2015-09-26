package clashes;

import java.util.*;
import java.math.*;

/**
 * Created by nathanielpayne on 9/25/2015. Plus one clash on CG
 */
public class plusone {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the plus one application!");
        System.out.println("Please enter the number that you want to increment: ");

        int n = in.nextInt(); // Input the proper number

        System.out.println("You entered the number " + n + ". The next number in the series is " + (n+1));
    }
}
