package moreselection;

/**
 *
 * Enumerations are custom data types with their own distinct set of values.
 * They're similar to a class with a constant, pre-defined set of objects.
 * https://crunchify.com/why-and-for-what-should-i-use-enum-java-enum-examples/
 * 
 * Primary purpose of enums are to establish values for a custom data type (specified using enum)
 * Thus new constants for the data type cannot be instantiated after java has built the enum
 * (In this example, new constants [eg: NorthEast] cannot be instantiated in this enumeration class [enumeration.java] after the direction class has compiled [direction.java])
 * 
 */
public class enumeration {

    public static void main(String[] args) {
        // enumeration (list of constants) in Java
        direction north = direction.North;
        
        // Print degrees of north variable (of type direction)
        System.out.printf("%s is at %d degrees.\n", north, north.Degrees());

        // Print degrees of East constant in the direction enumerator
        System.out.printf("%s is at %d degrees.\n", direction.East, direction.East.Degrees());
    }

}