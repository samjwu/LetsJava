package methods;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        number = input.nextInt();

        int result = calcfactorial(number);
        System.out.printf("The factorial of %d is %d\n", number, result);
    }
    
    public static int calcfactorial(int n) {
        int temp = 0;
        temp = (n <= 0) ? 1 : n * calcfactorial(n-1); //if yes, temp = 1; else, use recursion
        return temp;
    }
}
