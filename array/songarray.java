package array;

import java.util.Scanner;

public class songarray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int rating;
        song[] popmusic = new song[4];
        for(int i = 0; i < popmusic.length; i++) {
            System.out.printf("Enter song rating and its name: ");
            rating = input.nextInt();
            name = input.nextLine();
            popmusic[i] = new song(name, rating);
        }

        System.out.printf("#\t Song(Rating)\n");
        System.out.printf("-------------------------------\n");

        for(int i = 0; i < popmusic.length; i++) {
            System.out.printf("%d\t%s(%d)\n", i, popmusic[i].Name(), popmusic[i].Rating());
        }
            
    }
}