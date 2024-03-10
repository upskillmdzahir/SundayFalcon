package Com.Upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hasmap_Hashset_HashTable {
	
	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 30;									//Variable
		int[] ageFalcon = new int[]{25,30, 28, 35, 40};		//Array
		
		//Array index				[0] [1] [2] [3] [4]
		
		System.out.println("Student Age: " + ageFalcon[3]);		
		System.out.println("Total student: " + ageFalcon.length);
		
		//Write an Array for Student name nameFalcon?
		
		String[] nameFalcon = new String[]{"Tahmid", "Lubna", "Salman", "Rumi", "Sumaiya"};
		System.out.println("Student Name: " + nameFalcon[4]);
		System.out.println("Total student: " + nameFalcon.length);
		
		
		//Write a boolean array
		boolean[] attendanceFalcon = new boolean[]{true, false, false, true,true};
		System.out.println("Student Name: " + attendanceFalcon[4]);
		System.out.println("Total student: " + attendanceFalcon.length);
		
		//Multi-Dimentional Array
		int[][] ageFalcon2D = {{25,30, 28, 35, 40},		//[0][0] [0][1] [0][2] [0][3] [0][4]
							 {24,28, 32, 22}};			//[1][0] [1][1] [1][2] [1][3] [1][4]
		System.out.println("Student Age 2D: " + ageFalcon2D[1][3]);								
		
		//HasMap ('M' uppercase) store multiple data using key-value pair, Implementation of Map interface
		//Udate or input the value with dot put(.put("", )) method
		//And also print the data using dot get method(.get())
		
		HashMap <String, Integer> StudentAge = new HashMap <String, Integer> ();
	
		StudentAge.put("Tahmid", 25);
		StudentAge.put("Lubna", 24);
		StudentAge.put("Salman", 27);
		StudentAge.put("Rumi", 27);
		StudentAge.put("Sumaiya", 27);
		
		System.out.println("Hashmap Student Age: " + StudentAge.get("Lubna"));
		
		
		//Country - Capital  (practice)
		
		HashMap <String, String> capitalOfTheCountry = new HashMap <String, String> ();
		
		capitalOfTheCountry.put("UK", "London");
		capitalOfTheCountry.put("USA", "DC");
		capitalOfTheCountry.put("India", "Delhi");
		capitalOfTheCountry.put("Srilanka", "Colombo");
		capitalOfTheCountry.put("BD", "Dhaka");
		
		System.out.println("The Capital of " + "Srilanka is: " + capitalOfTheCountry.get("Srilanka"));
		
		//Hashtable (('t' lowercase) store multiple data using key-value pair, No duplicate
		//Also is synchronized (only one thread can be modified)
		
		Hashtable <String, String> Region = new Hashtable <String, String> ();

		Region.put("BD", "Asia");
		Region.put("USA", "America");
		System.out.println("Hashtable Region: " + capitalOfTheCountry.get("BD") );
		
		//HashSet('S' uppercase) store unordered collection containing unique value, Implementation of Set interface
		////
		HashSet <String> car = new HashSet <String>();
		car.add("BMW");
		car.add("TESLA");
		car.add("AUDI");
		car.add("FORD");
		System.out.println("Car: " + car);
		
	}
} 