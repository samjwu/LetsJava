package whileloop;

import java.util.Random;
import java.util.Scanner;

/** Post test loops use the do while selection which always runs the body before checking the condition
* post test loops will always execute at least once
* and are useful for resetting or clearing the input buffer
*/
public class posttestloop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int number = generator.nextInt(10) + 1;
        int guess = 0;
        int numattempts = 0;
        System.out.println("Guess a number between 1 and 10 inclusive.");
        //do runs the program once
        do {
            System.out.printf("Number of guesses: %d\n", numattempts);
            System.out.printf("Your Guess: ");
            guess = input.nextInt();  
            numattempts++;
        } while (guess != number); //the condition is always checked after each run
        System.out.printf("You guessed it. The number was %d.\n", guess);
    }

}