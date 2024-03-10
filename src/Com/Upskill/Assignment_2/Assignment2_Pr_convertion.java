package Com.Upskill.Assignment_2;

import java.util.Scanner;

public class Assignment2_Pr_convertion {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    	
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter the temparature in farenheit: ");
    	double a = s.nextDouble();
    	
    	s.close();
    	converstionT(a);
    }
    
    private static void converstionT(double farenheit) {
    	
    	double celcius;
    	celcius = (farenheit -32.0) * (5.0 /9.0);
    	System.out.print("The converted temparature in celcius: " + celcius);
    	
    }
}