# Galois #

## Java programming repository ##

This Java programming repository is the main repository that keeps track of the main Java open source development & practice work that is ongoing. This work is replicated across multiple languages & represents an ongoing pursuit of professional development & computing excellence. This work is also to be used as an internal guide that supports the training and development of all engineering & data science staff at Cardinal Path, as well as those participating in my various study groups & in my classes at Simon Fraser University, the BC Institute of Technology, and the Georgia Institute Of Technology!

## Main References ##

The main references which the questions come from include:

- [Liang's Intro to Java Programming, Comprehensive Version, 10/E](http://www.pearsonhighered.com/product?ISBN=0133761312 "Intro To Java Programming")
- [ Sedgewick & Wayne's Algorithms (4th Edition) text which surveys the most important algorithms and data structures in use today!](http://algs4.cs.princeton.edu/home/ "Algorithms")

## Who Was Galois ##

[Galois, who died before the age of twenty-one](http://fabpedigree.com/james/mathmen.htm#Galois "Galois"), not only never became a professor, but was barely allowed to study as an undergraduate. His output of papers, mostly published posthumously, is much smaller than most of the others on this list, yet it is considered among the most awesome works in mathematics. He applied group theory to the theory of equations, revolutionizing both fields. (Galois coined the mathematical term group.) While Abel was the first to prove that some polynomial equations had no algebraic solutions, Galois established the necessary and sufficient condition for algebraic solutions to exist. His principal treatise was a letter he wrote the night before his fatal duel, of which Hermann Weyl wrote: "This letter, if judged by the novelty and profundity of ideas it contains, is perhaps the most substantial piece of writing in the whole literature of mankind." Galois' last words (spoken to his brother) were "Ne pleure pas, Alfred! J'ai besoin de tout mon courage pour mourir à vingt ans!" This tormented life, with its pointless early end, is one of the great tragedies of mathematical history. Although Galois' group theory is considered one of the greatest developments of 19th century mathematics, Galois' writings were largely ignored until the revolutionary work of Klein and Lie.

## Subjects Areas & Questions ##

### Elementary Programming (Project: elementary) ###

- (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in - a double value from the console, then converts it to Fahrenheit and displays the - result. The formula for the conversion is as follows: fahrenheit = (9 / 5) * celsius + 32 **(Program completed August 7, 2015)**

- (Compute the volume of a cylinder) Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas: area = radius * radius **(Program completed August 7, 2015)**

- (Convert feet into meters) Write a program that reads a number in feet, converts it to meters, and displays the result. One foot is 0.305 meters. **(Program completed August 8, 2015)**

- (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total. **(Skipped due to elementary nature)**

- (Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result. One pound is 0.454 kilograms. **(Program completed August 8, 2015)**

- (Sum the digits in an integer) Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14. Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93. **(Program completed September 1, 2015)**

- (Science: calculating energy) Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial and final temperatures of the water. The formula to compute the energy is Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in joules. **(Program completed August 10, 2015)**

- (Geometry: distance of two points) Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance between them. The formula for computing the distance is sqrt((x2 x1)^2 + (y2 y1)^2). Note that you can use Math.pow(a, 0.5) to compute sqrt(a). **(Program completed August 10, 2015)**

- (Print a table) Write a program that displays the following table. Cast floatingpoint numbers into integers.
a b pow(a, b)
1 2 1
2 3 8
3 4 81
4 5 1024
5 6 15625 **(Skipped & will return to this problem later)**

### Selections ###
- The two roots of a quadratic equation
ax2 + bx + c = 0 can be obtained using the following formula:
r1 =
-b + 2b2 - 4ac
2a
and r2 =
-b - 2b2 - 4ac
2a
b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”.

- A linear equation can be solved using
Cramer’s rule. Write a program that prompts
the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report that “The equation has no solution.”

- Write a program that randomly generates an integer between 1 and 12 and displays the English month name January, February, …, December for the number 1, 2, …, 12, accordingly. **(Program completed September 3, 2015)**

- Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also prompt the user to enter the number of days after today for a future day and display the future day of the week. **(Program completed September 4, 2015; Need to go back and complete this problem again using Java 8)**

- Write a program that prompts the user to enter three integers and display the integers in non-decreasing order. (Later need to extend the program to enter n integers and to sort them in order)

- Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome number. A number is palindrome if it reads the same from right to left and from left to right. **(Program completed September 5, 2015 flying back from Toronto)**

- Write a program that lets the user guess whether the flip of a coin results in heads or tails. The program randomly generates an integer 0 or 1, which represents head or tail. The program prompts the user to enter a guess and reports whether the guess is correct or incorrect. **(Program completed September 5, 2015 flying back from Toronto)**

- Write a program that displays a random coordinate in a rectangle. The rectangle is centered at (0, 0) with width 100 and height 200. **(Program completed September 5, 2015 flying back from Toronto)**

- Write a program that plays the popular scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws.

- Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 
- Write a program that prompts the user to enter a point (x, y) and checks whether the point is within the circle centered at (0, 0) with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the circle. (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10. The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Test your program to cover all cases.)

- Write a program that prompts the user to enter a point (x, y) and checks whether the point is within the rectangle centered at (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all cases.)

- Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.

- Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.

- Suppose a right triangle is placed in a plane as
shown below. The right-angle point is placed at (0, 0), and the other two points are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
a point with x- and y-coordinates and determines whether the point is inside the triangle.

- Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.

### Mathematical Functions, Characters, Strings ###
- Create a program that, reverses the position of each word in a sentence given as input. **(Program completed September 27, 2015 for CodinGame Clash)** 

### Loops ###
- Create a program that, for every string that is input, determines whether the string is a palindrome! **(Program completed September 22, 2015 for CodinGame)**

### Methods ###

### Single Dimensional Arrays ###

### Multi Dimensional Arrays ###

### Objects And Classes ###

### Object Oriented Thinking ###

### Inheritance and Polymorphism ###

### Exceptional Handling & Input / Output ###

### Abstract Classes & Interfaces ###

### JavaFX Basics ###

### Event Driven Programming And Animations ###

### Binary I/O ###

### Recursion ###
- Output the first N numbers of the Fibonnaci sequence **(Program completed September 26, 2015 for CodinGame)**

### Generics ###

### Lists, Stacks, Queues & Priority Queues ###

### Sets and Maps ###

### Developing Efficient Algorithms ###

### Sorting ###

### Implementing Lists, Stacks, Queues & Priority Queues ###

### Binary Search Trees ###

### AVL Trees ###

### Hashing ###

### Graphs & Applications ###

### Multi-threading & Parallel Programming ###

### Networking ###

### Java Database Programming ###

### JavaServer Faces ###






