package whileloop;

public class basicwhileloop {

    public static void main(String[] args) {
        int maxiterations = 10;
        int i = 1;
        
        System.out.println("Counting Up...");
        while (i <= maxiterations) {
            System.out.printf("%d ", i);
            i++;
        }
        System.out.println();
        
        i = maxiterations;
        System.out.println("Counting Down...");
        while (i >= 1) {
            System.out.printf("%d ", i);
            i--;
        }
        System.out.println();
    }

}