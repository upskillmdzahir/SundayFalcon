package Com.Upskill.Assignment_4;

public class Assignment4_2 {

    public static void main(String[] args) {
        // Write a method which will reverse a string?

    	String original = "Hello World!";
    	String reversed = new StringBuilder(original).reverse().toString(); ////memorise the line of code (new StringBuilder...)//java 8 stream
 
    	System.out.println("Original String: " + original);
    	System.out.println("Orig String: " + reversed);

    }
}