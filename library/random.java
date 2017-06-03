package library;

//https://docs.oracle.com/javase/7/docs/api/java/util/Random.html
import java.util.Random;

public class random {
    public static void main(String[] args) {
        int randomnum;
        Random numbergenerator = new Random(1);
        
        for (int numloops = 0; numloops < 10; numloops++) {
            randomnum = numbergenerator.nextInt(10);
            System.out.println(randomnum);
        }

    }
}