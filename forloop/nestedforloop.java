package forloop;

public class nestedforloop {

    public static void main(String[] args) {
        int gridsize = 3;
        for (int i = 0; i < gridsize; i++) {
            for (int j = 0; j < gridsize; j++) {
                System.out.printf("X");
            }
            System.out.println();
        }
    }

}