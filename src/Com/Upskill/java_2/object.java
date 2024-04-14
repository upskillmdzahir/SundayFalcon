package Com.Upskill.java_2;

public class object {
    private String brand;

    public object(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("Driving a " + brand + " object.");
    }

    public static void main(String[] args) {
        // Creating multiple object objects
        object object1 = new object("Toyota");   //Creating an Object>> className objectName = new className();
        object object2 = new object("Honda");	

        // Performing actions with each object
        object1.drive();
        object2.drive();
    }
}
/*Class
	-Blue print that object follows
	-A blueprint for creating objects
 Object
	-Real world Entity
	-An instance of a class
	-e.g. Object= Human ; Properties= (name, color,Height) Task performed = walk(); run(); read(); Write


>Class can't communicate with another class but object can
>By creating instances 2 class can communicate 

>>>A constructor in java is a special method within a class responsible for initializing the state of an object during it's creation*/