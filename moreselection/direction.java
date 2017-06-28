package moreselection;

/**
 *
 * Enumerations are custom data types with their own distinct set of values.
 * They're similar to a class with a constant, pre-defined set of objects.
 * 
 */
public enum direction {
    //format of constructor: constant(value)
    //in this example: direction(degrees)
    North (0), South (180), East (90), West (270);
    
    //recall final is like static
    private final int degrees;
    
    //constructor for direction enumerator
    direction(int degrees) {
        this.degrees = degrees;
    }

    //method to get degrees of the direction enumerator
    public int Degrees() { return this.degrees; }
}