package selections;

import java.util.Scanner;

/**
 * Created by nathanielpayne on 9/4/2015.
 *
 * Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, …,
 * and Saturday is 6). Also prompt the user to enter the number of days after today for a future day
 * and display the future day of the week. (Since switch statements were used before in month, use if-else here for fun)
 *
 * Revisit this program later to finesse the algorithm piece!
 */
public class week {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create a new scanner objecte called "input"

        System.out.println("Welcome to the week guesser program! Please enter an integer corresponding to the day of the week today?");
        System.out.println("Please note that Sunday = 0, Monday = 1, Tuesday = 2, Wednesday = 3, Thursday = 4, Friday = 5, and Saturday = 6");
        Integer today = input.nextInt(); // Get the integer corresponding to the day of the week

        System.out.println("Please enter an integer that corresponds to the number of days you want to know the day of the week from today?");
        Integer future = input.nextInt(); // Get the integer corresponding to the number of days that we are going into the future

        String currentday; // Create a string for the correct day of the week
        String futureday; // Create a string for the future day of the week
        Integer remainder; // Create a blank remainder variable

        System.out.println("Thank you for using the day of the week evaluation program!"); // Generate the summary statement

        switch(today){ // Note that one needs to use an int here versus a double. I also used switch vs the if else here
            case 0: currentday = "Sunday";
                if(future > 7){ // More than 1 week has passed, get the remainder & calculate the week
                    remainder = future % 7; // collect the remainder that is left over
                    switch(remainder){ // Eg. let's say that 8 is entered, remainder = 1
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Monday";
                            break;
                        case 2: futureday = "Tuesday";
                            break;
                        case 3: futureday = "Wednesday";
                            break;
                        case 4: futureday = "Thursday";
                            break;
                        case 5: futureday = "Friday";
                            break;
                        default: futureday = "Saturday"; // Must be 6 in this case
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                else{ // Less than 1 week in the future is being considered; Calculate the day of the week immediately
                    switch(future){
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Monday";
                            break;
                        case 2: futureday = "Tuesday";
                            break;
                        case 3: futureday = "Wednesday";
                            break;
                        case 4: futureday = "Thursday";
                            break;
                        case 5: futureday = "Friday";
                            break;
                        case 6: futureday = "Saturday";
                            break;
                        default: futureday = "Sunday"; // Must be Sunday in this case
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                break; // break out of the zero case
            case 1: currentday = "Monday";
                if(future > 7){ // More than 1 week has passed, get the remainder & calculate the week
                    remainder = future % 7; // collect the remainder that is left over
                    switch(remainder){ // Eg. let's say that 8 is entered, remainder = 1
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Tuesday";
                            break;
                        case 2: futureday = "Wednesday";
                            break;
                        case 3: futureday = "Thursday";
                            break;
                        case 4: futureday = "Friday";
                            break;
                        case 5: futureday = "Saturday";
                            break;
                        default: futureday = "Sunday"; // Must be 6 in this case
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                else{ // Less than 1 week in the future is being considered; Calculate the day of the week immediately
                    switch(future){
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Tuesday";
                            break;
                        case 2: futureday = "Wednesday";
                            break;
                        case 3: futureday = "Thursday";
                            break;
                        case 4: futureday = "Friday";
                            break;
                        case 5: futureday = "Saturday";
                            break;
                        case 6: futureday = "Sunday";
                            break;
                        default: futureday = "Monday";
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                break; // break out of the one case
            case 2: currentday = "Tuesday";
                if(future > 7){ // More than 1 week has passed, get the remainder & calculate the week
                    remainder = future % 7; // collect the remainder that is left over
                    switch(remainder){ // Eg. let's say that 8 is entered, remainder = 1
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Wednesday";
                            break;
                        case 2: futureday = "Thursday";
                            break;
                        case 3: futureday = "Friday";
                            break;
                        case 4: futureday = "Saturday";
                            break;
                        case 5: futureday = "Sunday";
                            break;
                        default: futureday = "Monday"; // Must be 6 in this case
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                else{ // Less than 1 week in the future is being considered; Calculate the day of the week immediately
                    switch(future){
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Wednesday";
                            break;
                        case 2: futureday = "Thursday";
                            break;
                        case 3: futureday = "Friday";
                            break;
                        case 4: futureday = "Saturday";
                            break;
                        case 5: futureday = "Sunday";
                            break;
                        case 6: futureday = "Monday";
                            break;
                        default: futureday = "Tuesday";
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                break; // break out of the two case
            case 3: currentday = "Wednesday";
                if(future > 7){ // More than 1 week has passed, get the remainder & calculate the week
                    remainder = future % 7; // collect the remainder that is left over
                    switch(remainder){ // Eg. let's say that 8 is entered, remainder = 1
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Thursday";
                            break;
                        case 2: futureday = "Friday";
                            break;
                        case 3: futureday = "Saturday";
                            break;
                        case 4: futureday = "Sunday";
                            break;
                        case 5: futureday = "Monday";
                            break;
                        default: futureday = "Tuesday"; // Must be 6 in this case
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                else{ // Less than 1 week in the future is being considered; Calculate the day of the week immediately
                    switch(future){
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Thursday";
                            break;
                        case 2: futureday = "Friday";
                            break;
                        case 3: futureday = "Saturday";
                            break;
                        case 4: futureday = "Sunday";
                            break;
                        case 5: futureday = "Monday";
                            break;
                        case 6: futureday = "Tuesday";
                            break;
                        default: futureday = "Wednesday";
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                break; // break out of the three case
            case 4: currentday = "Thursday";
                if(future > 7){ // More than 1 week has passed, get the remainder & calculate the week
                    remainder = future % 7; // collect the remainder that is left over
                    switch(remainder){ // Eg. let's say that 8 is entered, remainder = 1
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Friday";
                            break;
                        case 2: futureday = "Saturday";
                            break;
                        case 3: futureday = "Sunday";
                            break;
                        case 4: futureday = "Monday";
                            break;
                        case 5: futureday = "Tuesday";
                            break;
                        default: futureday = "Wednesday"; // Must be 6 in this case
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                else{ // Less than 1 week in the future is being considered; Calculate the day of the week immediately
                    switch(future){
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Friday";
                            break;
                        case 2: futureday = "Saturday";
                            break;
                        case 3: futureday = "Sunday";
                            break;
                        case 4: futureday = "Monday";
                            break;
                        case 5: futureday = "Tuesday";
                            break;
                        case 6: futureday = "Wednesday";
                            break;
                        default: futureday = "Thursday";
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                break; // break out of the four case
            case 5: currentday = "Friday";
                if(future > 7){ // More than 1 week has passed, get the remainder & calculate the week
                    remainder = future % 7; // collect the remainder that is left over
                    switch(remainder){ // Eg. let's say that 8 is entered, remainder = 1
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Saturday";
                            break;
                        case 2: futureday = "Sunday";
                            break;
                        case 3: futureday = "Monday";
                            break;
                        case 4: futureday = "Tuesday";
                            break;
                        case 5: futureday = "Wednesday";
                            break;
                        default: futureday = "Thursday"; // Must be 6 in this case
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                else{ // Less than 1 week in the future is being considered; Calculate the day of the week immediately
                    switch(future){
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Saturday";
                            break;
                        case 2: futureday = "Sunday";
                            break;
                        case 3: futureday = "Monday";
                            break;
                        case 4: futureday = "Tuesday";
                            break;
                        case 5: futureday = "Wednesday";
                            break;
                        case 6: futureday = "Thursday";
                            break;
                        default: futureday = "Friday";
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                break; // break out of the five case
            case 6: currentday = "Saturday";
                if(future > 7){ // More than 1 week has passed, get the remainder & calculate the week
                    remainder = future % 7; // collect the remainder that is left over
                    switch(remainder){ // Eg. let's say that 8 is entered, remainder = 1
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Sunday";
                            break;
                        case 2: futureday = "Monday";
                            break;
                        case 3: futureday = "Tuesday";
                            break;
                        case 4: futureday = "Wednesday";
                            break;
                        case 5: futureday = "Thursday";
                            break;
                        default: futureday = "Friday"; // Must be 6 in this case
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                else{ // Less than 1 week in the future is being considered; Calculate the day of the week immediately
                    switch(future){
                        case 0: futureday = currentday;
                            break;
                        case 1: futureday = "Sunday";
                            break;
                        case 2: futureday = "Monday";
                            break;
                        case 3: futureday = "Tuesday";
                            break;
                        case 4: futureday = "Wednesday";
                            break;
                        case 5: futureday = "Thursday";
                            break;
                        case 6: futureday = "Friday";
                            break;
                        default: futureday = "Saturday";
                            break;
                    }
                    System.out.println("You entered the integer " + today + " ! This corresponds to the day of the week of: " + currentday + ".");
                    System.out.println("You also entered the integer " + future + " ! This corresponds to a future day of the week of: " + futureday + ".");
                }
                break; // break out of the six case
            default: currentday = "You did not provide an integer between 0 and 6!";
                break; // break out of the default case
        }
    }
}
