package Com.Upskill.java_1;

public class MethodType extends Variables {


		/* Types of Methods
		 * 
		 * 1. Void Method >>Where there is nothing to return
		 * 2. Static Method >> Static to the class, no need to create object to call it
		 * 3. Return Type Method >>Must return something
		 */

		public static int hourlyIncome = 65;
				
				public static void main(String[] args) {
					MethodType obj = new MethodType();
					obj.annualIncomeVoid();
					
					System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
					weeklyIncomeStatic();
					
	}

				//void mehtod
				public void annualIncomeVoid() {
					int calculateAnnualIncome = hourlyIncome * 2000;
					System.out.println("My Annual Income = " + calculateAnnualIncome);
					
				}
				
				 
				//return type Method
				public int monthlyIncomeReturn() {
					int calculateMonthlyIncome = hourlyIncome * 200;
					return calculateMonthlyIncome;
				}
					//static Method
					public static void weeklyIncomeStatic(){
						int calculateWeeklyIncome = hourlyIncome * 40;
						System.out.println("My Annual Income = " + calculateWeeklyIncome);
					}
					
	}	

				
