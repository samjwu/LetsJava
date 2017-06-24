package unittest;

import java.util.Random;
import unittest.testrank;

public class playcard {

    public static void main(String[] args) {
        Random gen = new Random();
        card c1 = new card(rank.Ace,suit.Hearts);
        card c2 = new card(gen.nextInt(52)); //rand card from 0-51
        
        System.out.printf("Cards: %s (%s) %s (%s)\n",c1.toString(),c1.suit(),c2.toString(),c2.suit());
        System.out.printf("Same RANK : %s\n", c1.sameRank(c2));
        System.out.printf("Same SUIT : %s\n", c1.sameSuit(c2));
        System.out.printf("Same CARD : %s\n", c1.sameCard(c2));

        //unit tests
        testrank unittest = testrank();
        unittest.testonerank();
    }
}