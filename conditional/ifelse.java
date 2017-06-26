package conditional;

import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade as a percentage: ");
        int grade = input.nextInt();
        if (grade > 100 || grade < 0) {
            System.out.printf("%d? You think I'll believe that?", grade);           
        }
        else if (grade < 50 ) {
            System.out.println("Try a little harder!");
        }
        else if (grade < 80) {
            System.out.println("Thank you for entering your grade.");
        }
        else {
            System.out.println("Hey, good job! Keep it up!");
        }
    }

}