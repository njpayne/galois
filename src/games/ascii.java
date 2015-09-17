package games;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Created by nathanielpayne on 9/16/2015. This is for the "ascii basic" program on CG
 */
public class ascii {
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        in.nextLine();
        int height = in.nextInt();
        in.nextLine();
        String text = in.nextLine().toUpperCase();

        ArrayList<String> ascii = new ArrayList<String>();
        for(int i = 0; i < height; i++) {
            ascii.add(in.nextLine());
            System.err.println(ascii);
        }

        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for(char c : text.toCharArray()) {
            if(c < 'A' || c > 'Z') indexes.add(26);
            else {
                for(char letter : alphabet.toCharArray()) {
                    if(c == letter) {
                        indexes.add(alphabet.indexOf(letter));
                    }
                }
            }
        }

        for(int j = 0; j < height; j++) {
            for(int k = 0; k < indexes.size(); k++) {
                System.out.print(ascii.get(j).substring(indexes.get(k)*width, indexes.get(k)*width + width));
            }
            System.out.println();
        }
        in.close();
    }
}
