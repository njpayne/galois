package selections_programming;

// Write a program that sorts three integers. The integers are
// entered from the input dialogs and stored in variables num1, num2, and num3,
// respectively. The program sorts the numbers so that they are returned from lowest to highest

import java.util.Scanner; // Import the java scanner library

//Note that this is an elementary sorting problem; I did not use error checking on this problem
public class three_integers {
	public static void main(String Args[]){
	
	// Create the scanner object
	Scanner input = new Scanner (System.in);
		
	// Input the three numbers
	System.out.println("Thank you for starting the basic 3 integer numerical sorting problem!");
	System.out.println("In order to start the program, please enter three integers, which will be sorted from lowest to highest!");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	
	int lowest = 0; // Declare the initial lowest
	int middle = 0; // Declare the middle value
	int highest = 0; // Declare the highest value
	
	// Compare the three numbers to see which is the smallest
	// I am not please with the duplicate variable declarations here
	if(a < b && a < c){ // Check whether a is the smallest to go down this branch
		lowest = a;
		if(b < c){
			middle = b;
			highest = c;
			} 
		else {
				middle = c;
				highest = b;
			}		
		}
	else if (b < a && b < c){ // Check whether b is the smallest to go down this branch
		lowest = b;
		if(a < c){
			middle = a;
			highest = c;
			} 
		else {
				middle = c;
				highest = a;
			}		
		}	
	else { // If neither a or be are the smallest, then we can conclude the c is the smallest
		lowest = c;
		if(a < b){
			middle = a;
			highest = b;
			} 
		else {
				middle = b;
				highest = a;
			}	
		} // End the third if statement	
	
	System.out.println("Thank you for using the basic, 3 integer sorting program!");
	System.out.println("Based on our calculations, the lowest number is " + lowest + " , the middle number is "+ middle + " , "
			+ "and the highest number is " + highest);
	
	} // End public static main void
}	// End class
