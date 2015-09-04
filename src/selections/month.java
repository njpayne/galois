package selections;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by nathanielpayne on 9/3/2015.
 *
 * Write a program that randomly generates an integer between 1 and 12 and displays the English month name
 * January, February, …, December for the number 1, 2, …, 12, accordingly.
 */

public class month {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Java month program!");
        System.out.println("This program randomly selects an integer between 1 and 12 and tells you the month that this number corresponds to!");
        // System.out.println("This program takes a random integer between 1 and 12 and tells you the month that this number corresponds to!");
        // System.out.println("This program both allows you to enter a number and then displays the corresponding English month name");
        // System.out.println("Please enter a number between 1 and 12:"); // Note that I should add proper validation later

        //Integer enteredmonth = input.nextInt(); // Get the month that is to be entered

        // Generate a random number instead of entering one!
        Integer enteredmonth = randInt(1,12);

        String correctmonth; // Create a string for the correct month

        switch(enteredmonth){ // Note that one needs to use an int here versus a double. I also used switch vs the if else here
            case 1: correctmonth = "January";
                break;
            case 2: correctmonth = "February";
                break;
            case 3: correctmonth = "March";
                break;
            case 4: correctmonth = "April";
                break;
            case 5: correctmonth = "May";
                break;
            case 6: correctmonth = "June";
                break;
            case 7: correctmonth = "July";
                break;
            case 8: correctmonth = "August";
                break;
            case 9: correctmonth = "September";
                break;
            case 10: correctmonth = "October";
                break;
            case 11: correctmonth = "November";
                break;
            case 12: correctmonth = "December";
                break;
            default: correctmonth = "You did not provide an integer between 1 and 12!";
                break;
        }
        System.out.println("Thank you for using the month evaluation program!");
        // System.out.println("You entered the integer " + enteredmonth + " ! This corresponds to the month of: " + correctmonth + " !");
        System.out.println("I (Mr. AI) randomly selected the integer " + enteredmonth + " ! This corresponds to the month of: " + correctmonth + " !");
    }

    // Note that we can also generate a random number rather than simply inputting things!
    public static int randInt(int min, int max) { // Returns a pseudo-random number between min and max, inclusive
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min; // Note that nextInt is normally exclusive of the top value. This, 1 is added to make it inclusive
        return randomNum;
    }
}
