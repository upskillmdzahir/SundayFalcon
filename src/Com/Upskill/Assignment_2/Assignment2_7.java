package Com.Upskill.Assignment_2;

public class Assignment2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//You are given two integer number (a=25, b=30), write a program to swap them and 
	    //display result on the screen.  
		
		
		swapNumber();
		
	}

	public static void swapNumber() {     
		int a = 25;
		int b = 30;
		int temp;   /// we also can write >>int temp = a;
		temp = a;  ///also instead of temp we can write >>int swap = a;
		a = b;
		b = temp;
		System.out.println("Swap value a:" + a);
		System.out.println("Swap value b:" + b);

	}
	
}
