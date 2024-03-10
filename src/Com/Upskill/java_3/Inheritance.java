package Com.Upskill.java_3;

import Com.Upskill.java_1.MethodType;

			//Child Class		//Parent Class
public class Inheritance extends MethodType{

	/* The process of obtaining the data members and methods from one class to another class is known as inheritance
	- Single Inheritance   (One parent one child)
	- Multiple Inheritance (Multiple parents one child)
	- Multilevel Inheritance (Grand Parents and child)(Java dosen't support Multiple Inheritance)
		 
	 */
	public static void main(String[] args) {
		
		Inheritance obj = new Inheritance();
		obj.annualIncomeVoid();
		obj.weeklyIncomeStatic();
		
		
		obj.CT("essex");
		obj.NJ();

	}
	
}
// A mechanism for creating a new class using the properties and behaviors of an existing class.