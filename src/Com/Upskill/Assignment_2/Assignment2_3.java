package Com.Upskill.Assignment_2;

public class Assignment2_3 {
	
	public static int a;
	public static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write two java functions which will return two different integer
		 * values, write a program to compare those numbers and send message
		 * that one number is bigger than other. (hints: using if..else)
		 */

		a = myFunction1();
		b = myFunction2();
		myMethod();

	}

	public static int myFunction1() {
		return 55;
	}

	public static int myFunction2() {
		return 65;
	}

	public static void myMethod() {
		if (a > b) {
			System.out.println("1st Function is bigger then 2nd Function");
		}
		if (a < b) {
			System.out.println("2nd Function is bigger then 1st Function");
		}
	}
}



/*
 * compareNumber(10, 20);
 * 
 * }
 * 
 * 
 * public static void compareNumber(int num1, int num2) {
 * 
 * System.out.println("First Number is: " + num1);
 * System.out.println("First Number is: " + num2); if (num1 == num2) {
 * System.out.println("Both Numbers are same"); } else {
 * System.out.println("One number is bigger"); } } }
 */