package Com.Upskill.Assignment_1;

public class Subtration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A function returns 30, another function returns 50.
		// Write a java program which will display subtraction value from bigger
		// number to smaller.
		
		
		
		myMethod4(); 
		myMethod41();
		int a=myMethod4();//for return type need to do that 
		int b=myMethod41();// for return type
		System.out.println(b-a);	
	}
	public static int myMethod4(){
		return 30;
	}
	public static int myMethod41(){
		return 50;
	}
}

		/*myMethod8();
		myMethod9();
		System.out.println(myMethod9() - myMethod8());
		
	}
public static int myMethod8() {
	return 30;
}
	public static int myMethod9() {
		return 50;
	}
}
*/