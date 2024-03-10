package Com.Upskill.Assignment_3;

public class Assignment3_4 {

	public static void main(String[] args) {
		//Write a java program that explains runtime polymorphism.
		Truck obj = new Truck();
		Car obj2 = new Car();
		Bike obj3 = new Bike();
		BiCycle obj4 = new BiCycle();
		
		obj.wheels();
		obj2.wheels();
		obj3.wheels();
		obj4.wheels();
	}

}


class Truck extends Assignment3_4{
	void wheels(){
		System.out.println("Trucks have 6 wheels!");
	}
}

class Car extends Assignment3_4{
	void wheels(){
		System.out.println("Cars have 4 wheels!");
	}
}

class Bike extends Assignment3_4{
	void wheels(){
		System.out.println("Bikes have 2 wheels!");
	}
}

class BiCycle extends Bike{
	void wheels() {
	System.out.println("Bicycles have 2 wheels too!");
}
}
