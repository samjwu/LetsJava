package whileloop;

import java.util.Random;
import java.util.Scanner;

/**
* mid test loops are the most flexible
* but the programmer must must determine when the loop should terminate/exit
*/
public class midtestloop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int number = generator.nextInt(10) + 1;
        int guess = 0;
        int numattempts = 0;
        System.out.println("Guess a number between 1 and 10 inclusive.");
        while(true)
        {
             System.out.printf("Number of guesses: %d\n", numattempts);
             System.out.printf("Your Guess: ");
             guess = input.nextInt();
             numattempts++;
            if ( guess > 10 || guess < 1) {
                System.out.printf("Error. The number is from 1 to 10 inclusive.\n");
            }
            else if (guess != number ) {
                System.out.printf("Incorrect. Try again.\n");
            }
            else {
                System.out.printf("Correct! The number was %d.\n", guess);
                break; //exit the loop
            }
        }
    }

}