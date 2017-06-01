package hello;

import java.util.Scanner;

public class hellostudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Which institution do you attend?");
        String institution = input.nextLine();
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println("What is your GPA?");
        float gpa = input.nextFloat();
        
        System.out.printf("%s is %d years old, attends %s, and has a GPA of %3.2f\n", name, age, institution, gpa);
    }
}