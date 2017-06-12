package classes;

public class rolldice
{
    public static void main(String[] args)
    {
        dice d6 = new dice(6); //6 sided die
        dice d12 = new dice(12); //12 sided die
        dice d20 = new dice(20); //20 sided die 
        System.out.printf("Rolling %d sided die : %d\n", d6.getSides(), d6.roll());
        System.out.printf("Rolling %d sided die : %d\n", d12.getSides(), d12.roll());        
        System.out.printf("Rolling %d sided die : %d\n", d20.getSides(), d20.roll());        
    }
}