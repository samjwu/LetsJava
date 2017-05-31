package hello;

import java.util.Scanner;

public class helloname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        // System.out.print("Hello, ");
        // System.out.print(name);
        // System.out.println("!");
        System.out.printf("Hello, %s!\n", name);
    }
}