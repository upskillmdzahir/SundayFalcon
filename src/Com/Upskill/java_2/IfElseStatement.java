package Com.Upskill.java_2;
//If the dataset is  broad and unknown. start with if then continues by if else if else and finally else
public class IfElseStatement {

	public static void main(String[] args) {
		int age = 70;
		
		if (age < 13) {										//Conditional Statement
			System.out.println("You are Children");
		} else if (age > 13 && age < 18 ) {
			System.out.println("You are Teenager");
		} else if (age >= 18 && age < 60){
			System.out.println("You are Adult");
		} else if (age >= 60) {
			if (age > 100){									//Nested if else
				System.out.println("You are Senior");
			} else {
				System.out.println("You are Adult");
			}
		} else {
			System.out.println("You are Champion");
		
		}


	}

}
