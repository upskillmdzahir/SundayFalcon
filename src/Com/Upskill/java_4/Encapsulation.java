package Com.Upskill.java_4;

public class Encapsulation {
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "Zack";					//Read & Write
	private int mobileNumber = 907598990;			//Retrieve, Read only
	private int ssn = 55667788;						//Update, Write only
	private String username = "Upskill";			//Retrieve, Read only
	private String password = "Upskill123";			//Update, Write only
	//Setter Method - name							//set the data, Write
	public void setName(String value) {
		name = value;
	}
	
	//Getter Method - name 							//get the data, Read
	public String getName() {
		return name;
}
	//Getter Method - mobileNumber					//get the data, Read
		public int getmobileNumber() {
			return mobileNumber;
		}
		
		//Setter Method - ssn 						//set the data, Write
		public void setssn(int value) {
			ssn = value;
		}
		
		//Getter Method - username					//get the data, Read
		public String getuserame() {
			return username;
		}
		
		//Setter Method - ssn						//set the data, Write
		public void setpassword(String value) {
			password = value;
		}
	
}

//Encapsulation is like putting data in a protective capsule (making it private) and providing controlled access (public methods)
