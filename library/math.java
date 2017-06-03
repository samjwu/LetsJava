package library;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Circle Radius : ");
        double radius = input.nextDouble();

        //https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html
        double circ = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2) ;

        System.out.printf("Circumference : %f; Area : %f\n",circ, area);     
    }
}