package Com.Upskill.Assignment_1;

public class Guestimate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a java program which will display name and guestimated age of
		// every students in your class.
		// (write separate method for every student).
		Guestimate myObject = new Guestimate();
		myObject.myMethod51(); // 51 "static" keyword missing so need to create object 1st then invoke with "objName.method" format
		
		myMethod52(); // 52 static so just need to invoke
		
		int a= myMethod53(); // 53 for return type need to do that 
		System.out.println("Age of z is "+a);
		
	}
	public void myMethod51(){
		int a=24;
		System.out.println("Age of X is "+a);
	}
	public static void myMethod52(){
		int a=25;
		System.out.println("Age of Y is "+a);
	}
	public static int myMethod53(){
		int a=26;
		return a;
	}
}
