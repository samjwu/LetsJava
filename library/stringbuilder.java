package library;

public class stringbuilder {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
        StringBuilder string = new StringBuilder();
        string.append("I did, did I?");
        
        String forward = string.toString();
        String reverse = string.reverse().toString();
        
        System.out.println(forward);
        System.out.println(reverse);
        
    }
}