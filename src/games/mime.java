package games;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Created by nathanielpayne on 9/17/2015.
 */
public class mime {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Number of elements which make up the association table.
        in.nextLine();
        int q = in.nextInt(); // Number Q of file names to be analyzed.
        in.nextLine();

        // Create array to hold potential elements in the table
        String elementArray[][] = new String[n][2]; // Separate string by space

        // Create an array to hold the list of extensions
        String filenameArray[][] = new String[q][2];

        // Read in the list of potential elements in the table
        for (int i = 0; i < n; i++){
            String eXT = in.next(); // file extension
            System.err.println(eXT);
            elementArray[i][0] = eXT; // put the EXT in position 0

            String mT = in.next(); // MIME type.
            System.err.println(mT);
            elementArray[i][1] = eXT; // put the MIME type in position 0
            in.nextLine();
        }

        // Conduct a test print
        System.err.println("The element in position (1,q) is: " + elementArray[1][1]); // Should be image/png

        // Load the strings into an array for testing
        for (int i = 0; i < q; i++) {
            String fNAME = in.nextLine(); // One file name per line.
            String ext = fNAME.substring(fNAME.lastIndexOf("."));
            System.err.println("The test filename extension is: " + ext);
            if(ext.startsWith(".")){ // This denotes a potential starting point
                String refinedext = ext.substring(1); // Remove the first character from the string
                System.err.println("The test final filename extension is: " + refinedext);
                filenameArray[i][0] = refinedext; // At the refined substring
            } // Note that I removed the else clause here
        }

        // Compare the items in the filenameArray to the elementArray;
        for(int k = 0; k < filenameArray.length; k++){
            String mainfile = filenameArray[k][0];
            String mainelement = elementArray[k][0];

            if(mainfile == mainelement){
                System.out.println(elementArray[k][1]);
            } else {

                System.out.println("UNKNOWN");
            }

            System.err.println(mainfile);
            System.err.println(mainelement);


        }

        // Conduct a test print
        System.err.println("The file in the filename array in position (q-1,0) is: " + filenameArray[1][0]); // Should be image/png

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
    }
}
