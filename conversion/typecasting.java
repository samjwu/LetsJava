package conversion;

public class typecasting {
    public static void main(String[] args) {
        int x = 2;
        int y = 1;
        int result = x / y;

        double d1 = x / y; //implicit type cast
        double d2 =  x / (y * 1.0); //implicit type cast
        //note int * double == double; int / double = double
        
        double d3 = x / (double)y;  //explicit type cast
        
        System.out.println(result);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}