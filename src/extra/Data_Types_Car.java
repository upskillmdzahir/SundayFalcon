package extra;

public class Data_Types_Car {
		
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
		
		public Data_Types_Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
			maxSpeed = customMaxSpeed;
			weight = customWeight;
			isTheCarOn = customIsTheCarOn; 
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
		
		public void upgradeMinSpeed() {
			minSpeed = maxSpeed;
			maxSpeed = maxSpeed +1;
		}
		
		public void getIn() {
			//numberOfPeopleInCar = numberOfPeopleInCar + 1;
			if (numberOfPeopleInCar < maxNumberOfPeopeInCar) {
				maxNumberOfPeopeInCar++;
				System.out.println("Someone got in");
			} else {
				System.out.println("The Car Is Full" + numberOfPeopleInCar + " = " + maxNumberOfPeopeInCar); 
			}
		}
		
		public void getOut() {
			//numberOfPeopleInCar = numberOfPeopleInCar - 1;
			if (numberOfPeopleInCar > 0) {
				numberOfPeopleInCar--;
			}
		}
		
		public double howManyMilesTillOutOfGas() {
			return currentFuel *  mpg;
		}
		
		public double maxMilePerFillUp() {
			return maxFuel * mpg;
		}
		
		public void turnTheCarOn() {
			if (!isTheCarOn) {
			isTheCarOn = true;
			}
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Data_Types_Car birthdayPresent = new Data_Types_Car(500, 5000.545, true);
			System.out.println("Birthday Car V1");
			birthdayPresent.printVariables();
			birthdayPresent.getIn();
			birthdayPresent.getIn();
			birthdayPresent.getIn();
			System.out.println("Miles Left:" + birthdayPresent.howManyMilesTillOutOfGas());
			System.out.println("Max Miles:" + birthdayPresent.maxMilePerFillUp());
			 

			System.out.println("Birthday Car V2");
			birthdayPresent.printVariables();
			birthdayPresent.getOut(); 
			
			System.out.println("Birthday Car V3");
			birthdayPresent.printVariables();
			 
			
//			System.out.println("Chistmas Car");
//			Data_Types_Car christmasPresent = new Data_Types_Car(550, 2000, false);
//			christmasPresent.printVariables();
			 
			
	}

}
