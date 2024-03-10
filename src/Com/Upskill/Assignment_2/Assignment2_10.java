 package Com.Upskill.Assignment_2;

import java.util.Scanner;

public class Assignment2_10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Degree Fahrenheit: ");
        double a = s.nextDouble();
        s.close();
        myMethod(a);
    }

    public static void myMethod(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println("The Equivalent of celsius is: ");
        System.out.println(celsius);
    }
}
