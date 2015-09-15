package games;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Created by nathanielpayne on 9/14/2015. This is for the defibrillators challenge on CG
 */

public class defibrillators {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Need to ingest the string, change the , to a ., and then convert it to an integer
        String lON = in.next();
        Double currentlong = Double.parseDouble(lON.replace(",", ".")); // Want this in double form
        System.err.println("The current longitude of the patient is " + currentlong);
        in.nextLine();

        String lAT = in.next();
        Double currentlat = Double.parseDouble(lAT.replace(",", ".")); // Want this in double form
        System.err.println("The current latitude of the patient is " + currentlat);
        in.nextLine();

        int n = in.nextInt();
        System.err.println("The total number of defibrillators in the area are " + n);
        in.nextLine();

        int[][] newArray = new int[5][n]; // Create the multi-dimensional array to hold the data; 5 rows & n colums

        for (int i = 0; i < n; i++) {
            String dEFIB = in.nextLine(); // Need to parse this out now using string split
            String[] address = dEFIB.split(";");

            String dEFIBname = address[1]; // Need to return this at the end
            System.err.println("The output name of the location is : " + dEFIBname);

            String dEFIBlong = address[4];
            //System.err.println("The longitude location is :" + dEFIBlong);
            Double dEFIBlongdouble = Double.parseDouble(dEFIBlong.replace(",", "."));
            System.err.println("The output longitude is : " + dEFIBlongdouble);

            String dEFIBlat = address[5];
            //System.err.println("The latitude location is :" + dEFIBlat);
            Double dEFIBlatdouble = Double.parseDouble(dEFIBlat.replace(",", "."));
            System.err.println("The output latitude is : " + dEFIBlatdouble);
        }

        for (int j = 0; j < 5; i++)(int k = 0; k < n; k++){

        }

        System.out.println("Maison de la Prevention Sante");
    }
}
