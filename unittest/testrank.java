package unittest;

public class testrank {

    /**
     * Test of the rank method, of the card class.
     */
    public static void main(String[] args) {
        System.out.println("testrank()");
        //arrange (setup var)
        card instance = new card(rank.Queen, suit.Hearts);
        int expectedresult = rank.Queen;
        //act (call method)
        int result = instance.rank();
        //assert (test/check result with expected)
        if (expectedresult == result) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }

}