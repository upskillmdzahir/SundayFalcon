package Com.Upskill.Assignment_2;

public class Assignment2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write Java Program to display Factorial of Number 7.
		factorialNumber();
	}

	public static void factorialNumber() {
		
		int n = 7;
		int result = 1;
		for (int i = 1; i <= n; i++){
			
			result = result * i;
			
		} 
			System.out.println("Factorial of " + n + " " + result);
		}
	}
	

