package Com.Upskill.Assignment_2;

public class Assignment2_5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Write a program in Java to display the multiplication table of (eight)8.
        System.out.println("Multiplication table of 8:");
        myMethod(8);
    }

    public static void myMethod(int multiplier) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplier + " * " + i + " = " + multiplier * i);
        }
    }
}
