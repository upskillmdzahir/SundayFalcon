package Com.Upskill.Assignment_3;

public class Assignment3_3 {

	public static void main(String[] args) {
		/* Bank is a class that provides functionality to get interest rate. 
		Display different interest rate using rate functionality for Chase, City and TD banks followed by 8%, 7% and 9%. 
		Hints: using method override.*/
		ChaseBank obj = new ChaseBank();
		CityBank obj2 = new CityBank();
		TdBank obj3 = new TdBank();
		obj.DisplayInerestRate();
		obj2.DisplayInerestRate();
		obj3.DisplayInerestRate();
	}
}




class ChaseBank extends Assignment3_3{
	
	public void DisplayInerestRate() {
		System.out.println("Chase Bank interest rate is 8%");
	}
}

class CityBank extends Assignment3_3{
	
	public void DisplayInerestRate() {
		System.out.println("City Bank interest rate is 7%");
	}
}

class TdBank extends Assignment3_3{
	
	public void DisplayInerestRate() {
		System.out.println("Chase Bank interest is 9%");
	
	}
}
