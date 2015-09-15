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

        // Create an array for the names
        double[][] calcArray = new double[5][n]; // Make this 5 rows by n rows

        // Create an array to fill with repeated values
        for (int j = 0; j < n; j++){
            calcArray[0][j] = currentlong;
            calcArray[1][j] = currentlat;
        }

        System.err.println("The value in position (1,2) of the array is : " + calcArray[1][n-1]);

        String nameArray[] = new String[n]; //Create a new string to hold n names

        for (int i = 0; i < n; i++) {
            String dEFIB = in.nextLine(); // Need to parse this out now using string split
            String[] address = dEFIB.split(";");

            String dEFIBname = address[1]; // Need to return this at the end
            System.err.println("The output name of the location is : " + dEFIBname);
            nameArray[i] = dEFIBname; // This holds the name array which we query at the end

            String dEFIBlong = address[4];
            //System.err.println("The longitude location is :" + dEFIBlong);
            Double dEFIBlongdouble = Double.parseDouble(dEFIBlong.replace(",", "."));
            System.err.println("The output longitude is : " + dEFIBlongdouble);
            calcArray[2][i] = dEFIBlongdouble; // This is the inputted value of the long

            String dEFIBlat = address[5];
            //System.err.println("The latitude location is :" + dEFIBlat);
            Double dEFIBlatdouble = Double.parseDouble(dEFIBlat.replace(",", "."));
            System.err.println("The output latitude is : " + dEFIBlatdouble);
            calcArray[3][i] = dEFIBlatdouble; // This is the inputted value of the lat
        }

        System.err.println("The value in the name array in position (n-1) is : " + nameArray[n-1]);

        // Need to calculate the distance
        for (int k = 0; k < n; k++){
            double longB = calcArray[2][k];
            double longA = calcArray[0][k];
            double latB = calcArray[1][k];
            double latA = calcArray[3][k];
            double x = (longB - longA) * Math.cos((latA + latB)/2);
            double y = (latB - latA);

            double finaldistance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2)) * 6371;
            calcArray[4][k] = finaldistance; // This is the final distance
            System.err.println("The final calculated distance is : " + finaldistance); // This is the final distance
        }

        // Determine the smallest distance
        double smallestdistance = calcArray[4][1]; // Start with the smallest distance;
        int smallestdistanceindex = 0;
        for(int m = 0; m < n; m++){
            if(calcArray[4][m] < smallestdistance){
                calcArray[4][m] = smallestdistance;
                smallestdistanceindex = m;
            }
        }

        System.err.println("I believe the smallest distance is: " + smallestdistance);
        System.err.println("I believe the smallest distance index is: " + smallestdistanceindex);
        String finalanswer = nameArray[smallestdistanceindex];

        System.out.println(finalanswer); // This is thename of the smallest distance
    }
}
