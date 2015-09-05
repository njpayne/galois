package selections;

import java.util.Scanner;

/**
 * Created by nathanielpayne on 9/4/2015.
 *
 * Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, …,
 * and Saturday is 6). Also prompt the user to enter the number of days after today for a future day
 * and display the future day of the week. (Since switch statements were used before in month, use if-else here for fun)
 */
public class week {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create a new scanner objecte called "input"

        System.out.println("Welcome to the week guesser program! Please enter an integer corresponding to the day of the week today?");
        System.out.println("Please note that Sunday is 0, Monday is 1, …,");
        Integer today = input.nextInt(); // Get the integer corresponding to the day of the week

        System.out.println("Please enter an integer that corresponds to the number of days you want to know the day of the week from today?");
        Integer future = input.nextInt(); // Get the integer corresponding to the number of days that we are going into the future



    }
}
