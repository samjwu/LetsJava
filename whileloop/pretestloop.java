package whileloop;

import java.util.Random;
import java.util.Scanner;

/** Pre tests use a precondition before the while loop runs
* pre test loops are not guaranteed to execute at all
* if the loop condition is false before evaluation, the loop will not run
*/
public class pretestloop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int number = generator.nextInt(10) + 1;
        int guess = 0;
        int numattempts = 0;
        System.out.println("Guess a number between 1 and 10 inclusive.");
        //here, the precondition is the number is not equal to the guess
        while (guess != number) {
            System.out.printf("Number of guesses: %d\n", numattempts);
            System.out.printf("Your Guess: ");
            guess = input.nextInt();
            numattempts++;
        }
        System.out.printf("You guessed it. The number was %d.\n", guess);
    }
}