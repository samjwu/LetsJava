package unittest;

public class testsuit {

    /**
     * Test of the suit method, of the card class.
     */
    public static void main(String[] args) {
        System.out.println("testsuit()");
        //arrange (setup var)
        card instance = new card(rank.Queen, suit.Hearts);
        int expectedresult = suit.Hearts;
        //act (call method)
        int result = instance.suit();
        //assert (test/check result with expected)
        if (expectedresult == result) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }

}