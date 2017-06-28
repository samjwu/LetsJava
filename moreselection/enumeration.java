package moreselection;

/**
 *
 * Enumerations are custom data types with their own distinct set of values.
 * They're similar to a class with a constant, pre-defined set of objects.
 * https://crunchify.com/why-and-for-what-should-i-use-enum-java-enum-examples/
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