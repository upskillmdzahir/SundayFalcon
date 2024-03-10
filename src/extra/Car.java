package extra;

public class Car {
		
		int maxSpeed = 100;
		int minSpeed = 0;
		
		double weight = 4079;
		
		boolean isTheCarOn = false;
		char condition = 'A';
		String nameOfCar = "Lucy";
		
		double maxFuel = 16;
		double currentFuel = 8;
		double mpg = 26.4;
		
		int numberOfPeopleInCar = 1;
		int maxNumberOfPeopeInCar = 6;
		
		// f(x) = x +1;
		// Say x = 5;
		// f(5) = 5 + 1 = 6;
		
		// f(x,y,z) = x +1/z-y;
		// Say x = 5;
		// f(5) = 5 + 1 = 6;
		public Car() {
			
		}
		
		public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
			maxSpeed = customMaxSpeed;
			weight = customWeight;
			isTheCarOn = customIsTheCarOn; 
		}
		
		// Getters and Setters
		
		public int getMaxSpeed() {
			return this.maxSpeed;	
		}
		
		public void setMaxSpeed(int newMaxSpeed) {
			this.maxSpeed = newMaxSpeed;
		}
		
		
		public int getMinSpeed() {
			return this.minSpeed;
		}
		
		public double getWeight() {
			return this.weight;
		}
		
		public boolean isTheCarOn() {
			return this.isTheCarOn;
		}
		
		public void printVariables(){
			System.out.println("This is the maxspeed " + maxSpeed);
			System.out.println(minSpeed);
			System.out.println(weight);
			System.out.println(isTheCarOn);
			System.out.println(condition);
			System.out.println(nameOfCar);
			System.out.println(numberOfPeopleInCar);
		}
		
		public void upgradeMaxSpeed() {
			setMaxSpeed(getMaxSpeed() + 10);
		}
		
		public void getIn() {
			//numberOfPeopleInCar = numberOfPeopleInCar + 1;
			//if there aren't too many people in the car
			if (numberOfPeopleInCar < maxNumberOfPeopeInCar) {
				// then someone can get in
				numberOfPeopleInCar++;
				System.out.println("Someone got in");
			} else {
				//otherwise print out the fact the car is full.
				System.out.println("The Car Is Full " + numberOfPeopleInCar + " = " + maxNumberOfPeopeInCar); 
			}
		}
		
		public void getOut() {
			//numberOfPeopleInCar = numberOfPeopleInCar - 1;
				// if ther's people in the car
			if (this.numberOfPeopleInCar > 0) {
				//then tell one person to get out
				numberOfPeopleInCar--;
			} else {
				//otherwise no one can get out and we'll print that
				System.out.println("No one is in the Car" + numberOfPeopleInCar);
			}
		}
		
		public double howManyMilesTillOutOfGas() {
			return currentFuel *  mpg;
		}
		
		public double maxMilePerFillUp() {
			return maxFuel * mpg;
		}
		
		public void turnTheCarOn() {
			//If the car isn't on....
			if (!isTheCarOn) {
			isTheCarOn = true;
			} else {
				// Otherwise print out the fact it's on
				System.out.println("The Car is already on " + isTheCarOn);
			}
		}
		
		
		public static void main(String[] args) { 
			// TODO Auto-generated method stub
			Car tommyCar = new Car();
			tommyCar.getOut();
			tommyCar.getOut();
			tommyCar.getIn();
			tommyCar.getIn();
			tommyCar.getIn();
			tommyCar.getIn();
			tommyCar.getIn();
			tommyCar.getIn();
			tommyCar.getIn();
			tommyCar.turnTheCarOn();
			tommyCar.turnTheCarOn();
			
			
			
//			System.out.println("Chistmas Car");
//			Car christmasPresent = new Car(550, 2000, false);
//			christmasPresent.printVariables();
			 
			
	}

}
