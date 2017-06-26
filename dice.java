//dice class from classes package for use in hack/slash simulation
package conditional;

import java.util.Random;

public final class dice
{
    
    //encapsulation (hide implementation from user)
    //one underscore for private var
    private int _sides; 
    private int _value;
    private Random _generator;
       
    /**
     * Creates a new Die
     * constructor, called when creating an instance (an object) of the class (eg: new)
     * @param sides number of sides on the die
     */
    public dice(int sides)
    {
        this._sides  = sides;
        this._generator = new Random();
        this.roll(); //give dice a value.
    }
    
    /**
     * Creates a new die with specific random number seed for easier testing
     * overloading (same method, different parameters)
     * AKA polymorphism
     * @param sides number of sides on the die
     * @param seed  specific random number seed
     */ 
    public dice(int sides, int seed)
    {
        this._sides  = sides;
        this._generator = new Random(seed);
        this.roll(); //give dice a value.
    }
    
    /**
     * Roll the die
     * @return return the rolled value
     */
    public int roll()
    {
        //nextInt gives random from 0 to arg - 1
        _value = _generator.nextInt(_sides) + 1;
        return _value;
    }

    /**
     * Inspect the current value of the rolled dice (without a re-roll)
     * @return the current face value of the dice
     */
    public int getValue()
    {
        return _value;
    }

    /**
     * Get the number of sides on the die
     * @return number of sides as int
     */
    public int getSides()
    {
        return _sides;
    }
    
    /**
     * Change the number of sides on the die
     * @param sides number of sides to change to
     * @return new number of sides
     */
    public int setSides(int sides)
    {
        this._sides = sides;
        return _sides;
    }
      
}