package Com.Upskill.java_5;

public abstract class AbstractClass {
	
	//Astract class has both abstract method and regular method
	
	public abstract void iDoor();

	public abstract int iWheel();

	public abstract String iEngine();

	public void color() {
		String carColor = "Red";
	}

	public int seat() {
		return 7;
	}
	
	
	

}

//In the abstract method, only have abstract keyword and there is no body

//Abstraction is like showing only what's necessary, hiding the complex details