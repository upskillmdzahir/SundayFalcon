package Com.Upskill.Assignment_1;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A rectangle width and length are: 9 and 13 inches. Write a method to
		// display the perimeter of rectangle in console output.

		Rectangle myObject = new Rectangle(); // creating an object
		myObject.myMethod2(); // invoking the method through object
	}

	public void myMethod2() { // "static" keyword missing so need to create an
								// object
		int a = 9;
		int b = 13;
		int c = 2 * (a + b);
		System.out.println("The perimeter of the rectangle with arm 9 and 13 is " + c);

	}
}
