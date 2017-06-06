package methods;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        int length, width;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length : ");
        length = input.nextInt();
        System.out.print("Enter Width : ");
        width = input.nextInt();

        int peri = rectanglePerimeter(length, width);
        int area = rectangleArea(length, width);
        System.out.printf("Area: %d; Perimeter: %d\n", area, peri);
    }
    
    public static int rectangleArea( int len, int wid) {
        return len * wid;
    }
    
    public static int rectanglePerimeter( int len, int wid) {
        return 2 * (len + wid);
    }
}