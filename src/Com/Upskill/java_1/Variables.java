package Com.Upskill.java_1;

public class Variables {
	// Variables in Java
	// Variables are used as containers to hold values (int, long, string…) during the life cycle of an application. In short, Variable is a name of memory location.
	
	
	//Instance OR Global variables (Belongs/global to Class) - Variables declared in Class level, outside method
	//Static variables -  (belongs to class if non-static then need to call it through object))variables belong to class and don't required creating object
	//Local variables (Belongs/Global to the method)- variables declared in methods
	//Method parameter(it passes data outside to inside) - variables used as method parameter
	
	
	
	String country = "USA";							//Global or Instance variables - Variables declared in Class level, outside method
	
	static String region = "America";				//Static variables -  variables belong to class and don't required creating object
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String city = "New York";					//Local variables - variables declared in methods
		System.out.println(city);
		String police = "NYPD";
		int zipcode = 10085;
		
		Variables object = new Variables();
		System.out.println(object.country);
		
		System.out.println(region);
		
		object.CT("Danbary");
		
		
	} 

	public void NJ() {
		String city = "Paterson";					//Local variables - variables declared in methods
		System.out.println(city);
		
		System.out.println(region);
	}
	
	public void CT(String county) {					//Method parameter(it passes data outside to inside) - variables used as method parameter
		String myCounty = county;
		System.out.println(myCounty);

		
		String city = "Hartfort";					//Local variables - variables declared in methods
		System.out.println(city);
	}
	
}
