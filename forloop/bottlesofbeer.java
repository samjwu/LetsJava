package forloop;

public class bottlesofbeer {

    public static void main(String[] args) {
        for(int i = 99; i > 0; i--) {
            if (i == 1) {
                System.out.printf("1 bottle of beer on the wall, 1 bottle of beer,\n");
                System.out.printf("take it down, pass it around, no more bottles of beer on the wall!\n");
            }
           else {
                System.out.printf("%d bottles of beer on the wall, %d bottles of beer,\n", i, i);
                System.out.printf("take one down, pass it around, %d bottles of beer on the wall!\n", i - 1);
            }
        }
    }

}