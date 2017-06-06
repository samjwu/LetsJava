package methods;

public class scope {
    public static void main(String[] args) {
        String name = "Sam";

        greet("Sammy");

        greet(name);
        
        name = "Sami";
        greet(name);
    }
    
    public static void greet(String name) {
        System.out.printf("Hello, %s\n",name);
        name="Tarang";
    }
}