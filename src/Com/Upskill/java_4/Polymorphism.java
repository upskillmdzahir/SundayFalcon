package Com.Upskill.java_4;

import Com.Upskill.java_1.MethodType;

public class Polymorphism extends MethodType{

	/*
	  Polymorphism is the ability of an object to take on many forms. 
	    - Method Overloading (Compile-time Polymorphism/Static binding) Same method name with different signature to overloaded 
	    	-----> Occurs within a single class.
	    	-----> Method name should be same, for method creating arguments diff(diff signature, diff parameter)
	    	-----> Multiple methods in the same class have the same name but different parameters (different method signatures).
	    
	    - Method Overriding (Run-time Polymorphism/Dynamic binding) Same method name from Parent class to override
	    	-----> Occurs between a superclass and its subclass using inheritance.
	    	-----> Inheritance 2 class
	    	-----> Method name same and arguments same
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car();
		car(4, "Sedan");
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
		
	}
	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with diffrent signature
	
	public void annualIncomeVoid() {
		int calculateAnnualIncome = hourlyIncome * 2000;
		int rentalIncome = 15000;
		int sideHussel = 25000;
		int newCalculateAnnualIncome = calculateAnnualIncome + rentalIncome + sideHussel;
		System.out.println("My Annual Income =" + newCalculateAnnualIncome);
	}
	public static void car() {
		System.out.println("My Car is Tesla !");
	}
	public static void car(int door) {
		System.out.println("My Car is Tesla !, it has door: " + door);

	}
	public static void car(String color) {
		System.out.println("My Car is Tesla !, it has color: " + color);

	}
	public static void car(boolean dualMotor) {
		System.out.println("My Car is Tesla !, it has dualMotor: " + dualMotor);

	}
	public static void car(int seat, String bodyType ) {
		System.out.println("My Car is Tesla !, it has seat: " + seat + " and The body Type: " + bodyType);

	}
}
