package unittest;

import java.util.Random;
import card;

public class playcard {

    public static void main(String[] args) {
        Random gen = new Random();
        Card c1 = new Card(Ranks.Ace,Suits.Hearts);
        Card c2 = new Card(gen.nextInt(52));
        
        System.out.printf("Cards: %s %s\n",c1.toString(),c2.toString());
        System.out.printf("Same RANK : %s\n", c1.sameRank(c2));
        System.out.printf("Same SUIT : %s\n", c1.sameSuit(c2));
        System.out.printf("Same CARD : %s\n", c1.sameCard(c2));
    }
}