package Com.Upskill.Assignment_1;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A triangle three arms are: 5, 7 and 11 inches. Write a method to display the perimeter of triangle in console output.
		
		
		Triangle myObject = new Triangle (); //Creating an object
		myObject.myMethod2();   ///invoking the method through object
	}
	public void myMethod2() {  //"static" keyword missing so need to call the method
		int a = 9;
		int b = 13;
		int c = 2*(a+b);
	System.out.println("The perimeter of the rectangle with arm 9 and 13 is "+c);
		
	}
}
