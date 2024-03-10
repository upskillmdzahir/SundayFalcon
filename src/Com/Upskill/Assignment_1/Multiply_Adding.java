package Com.Upskill.Assignment_1;

public class Multiply_Adding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A function which returns the multiply value of a and b where a = 9
		// and b = 11.
		// Write a program which will display addition of a +b + function
		// returns value.
		myMethod3();  //invoking the method
		int a=9;
		int b=11;
		int c=myMethod3(); // for return type need to do that format
		System.out.println(a+b+c);
	}
	public static int myMethod3(){  //"static" keyword is there so it belongs to class no need to create object
		int a=9;
		int b=11;
		int c=a*b;
		return c; 
	}
}

