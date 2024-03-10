package Com.Upskill.java_5;

public interface Interface {

	//Interface can have only abstract methods, java 8 and forward they have static method too
	
	//Abstract method dosn't have any implementation
	
public abstract void iDoor();

public abstract int iWheel();

public abstract String iEngine();

}


/*
(Parent)				(Keyword)				(Child)				(Keyword)				(GrandChild)
 
 Class					extends					Class
 Abstract Class(+3)		extends					Class(3-3=0)
 Interface(+3)			implements				Class(3-3=0)
 Interface(+3)			extends					Interface			implements				Class(6-6=0)
 
 */
//In the interface, only have abstract method
//Instruction to follow or implement
//Interface is used to give a shape or frame