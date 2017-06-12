package classes;

import java.util.Random;

public final class dice
{
    
    //encapsulation (hide implementation from user)
    //one underscore for private var
    private int _sides; 
    private int _value;
    private Random _generator;
       
    //constructor, called when creating an instance (an object) of the class (eg: new)
    public dice(int sides)
    {
        this._sides  = sides;
        this._generator = new Random();
        this.roll(); //give dice a value.
    }
    
    //overloading (same method, different parameters)
    //AKA polymorphism
    public dice(int sides, int seed)
    {
        this._sides  = sides;
        this._generator = new Random(seed);
        this.roll(); //give dice a value.
    }
    
    //dice roll and give dice a value
    public int roll()
    {
        //nextInt gives random from 0 to arg - 1
        _value = _generator.nextInt(_sides) + 1;
        return _value;
    }

    //get value on dice
    public int getValue()
    {
        return _value;
    }

    //get number of sides on dice
    public int getSides()
    {
        return _sides;
    }
    
    //change number of sides on dice
    public int setSides(int sides)
    {
        this._sides = sides;
        return _sides;
    }
      
}