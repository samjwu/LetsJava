package hello;

import java.util.Scanner;

public class hellostudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("What is your age?");
        //Method 1
        /*
        int age = input.nextInt();
        input.nextLine();  //read in leftover newline
        */
        //Method 2
        int age = 0;
        try {
            age = Integer.parseInt(input.nextLine());
        }
        catch(NumberFormatException error) {
            error.printStackTrace();
        }

        System.out.println("Which institution do you attend?");
        String institution = input.nextLine();

        System.out.println("What is your GPA?");
        float gpa = input.nextFloat();
        
        System.out.println("Are you male? (true/false)");
        boolean ismale = input.nextBoolean();
        String gender = ismale ? "He" : "She";

        System.out.println("In which year will you graduate?");
        int graduationdate = input.nextInt();
        int yearstograduate = graduationdate - 2017;
        
        System.out.printf("%s is %d years old, attends %s, and has a GPA of %3.2f.\n", name, age, institution, gpa);
        System.out.printf("%s will graduate in %d years.\n", gender, yearstograduate);
    }
}