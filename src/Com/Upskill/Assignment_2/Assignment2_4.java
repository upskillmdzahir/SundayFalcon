package Com.Upskill.Assignment_2;

public class Assignment2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a for loop upto 500 which will increase the value double every time.
		myMethod();
			
		}
	
	public static void myMethod(){
		for (int i = 1; i <= 500; i = i*2) {
				System.out.println("Double value is: " + i); 
		}
	}
}
