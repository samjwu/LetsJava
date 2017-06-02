package conversion;

import java.util.Scanner;

public class parsing {
    public static void main(String[] args) {
        String x = "1";
        String y = "2";
        System.out.printf("Concaternation: %s + %s = %s\n", x, y, x + y);
        
        int i = Integer.parseInt(x);
        int j = Integer.parseInt(y);
        System.out.printf("After parsing: %d + %d = %d\n", i, j, i + j);
        
        String boolstring = "true";
        boolean bool = Boolean.parseBoolean(boolstring);
        System.out.println(bool);
        
        String gpa = "4.00";
        Double gpadouble = Double.parseDouble(gpa);
        System.out.println(gpadouble * 1);
    }
}