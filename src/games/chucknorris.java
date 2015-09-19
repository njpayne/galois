package games;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Created by nathanielpayne on 9/18/2015. This is for the "MIME" program on CG
 */

public class chucknorris {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Input data
        char[] message = in.nextLine().toCharArray();

        //convert data into binary format
        StringBuilder binary = new StringBuilder();
        for(char c : message) {
            String res = Integer.toBinaryString(c);
            while(res.length() < 7) res = '0' + res; // for non-letters
            binary.append(res);
        }

        int i = 0; // Convert to unary and print to console
        char currentChar;
        while(i < binary.length()) {
            if(binary.charAt(i) == '0') {
                System.out.print("00 ");
                currentChar = '0';
            } else {
                System.out.print("0 ");
                currentChar = '1';
            } while(binary.charAt(i) == currentChar) {
                System.out.print("0");
                i++;
                if(i >= binary.length()) break;
            } if(i < binary.length()) System.out.print(" ");
        }
        in.close();
    }
}
