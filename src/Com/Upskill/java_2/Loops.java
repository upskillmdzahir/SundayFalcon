 package Com.Upskill.java_2;

public class Loops {
	/*
	 Type of Loops
	  	1. For Loop
	  	2. While Loop
	  	3. Do While Loop
	  	4. Infinite Loop
	 */
	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhileLoop();
//		practiceInfiniteLoop();
		practiceNestexdForLoop();
	}
	
	//For Loop
	public static void practiceForLoop() {						//For loop - Do again and agian upper limit
	for(int i = 1; i <= 10; i++) {								//Initialize the variable; Setting lower limit, Upper limit, Increment or Decrement
		System.out.println("For Loop number =  " + i); 			//Statement
	}
  }
	
	//While Loop
	public static void practiceWhileLoop() {					//While Loop - Do again and again upto condition match
		int i = 1;												//Initialize the variable
		while(i <= 10) {										//Setting Condition
			System.out.println("While Loop number = " + i); 	//Statement
			i++;												//Increment or decrement
		}		
	}
	//Do While Loop
		public static void practiceDoWhileLoop() {				//Do While Loop - Do action then match condition
			int i = 1;											//Initialize the variable
			do {
				System.out.println("Do While loops number = " + i); //Statement
				i++;												//Increment or decrement
			} while(i<=10);											//Checking condition
			
			}
	//Infinite Loop
		public static void practiceInfiniteLoop() {					//Infinite Loop - never ending loop 
			int i;													//Initialize the variable
			for (i = 1; ;i++) {										//Setting No Upper limit
				System.out.println("For Loops number = " + i);		//Statement
			}
		}
	//Nested Loop
		public static void practiceNestexdForLoop() {				//Nested Loop - loop inside another loop
			int i;													//Loop 1 - Initialize i
			int j;													//Loop 2 - Initialize j
			for (i = 1; i <= 10;i++) {								//Loop 1 - Setting lower limit, upper limit, Increment or Decrement
				for (j = 1; j <= 10;j++) {							//Loop 2 - Setting lower limit, upper limit, Increment or Decrement
					int multiplicationTable = i * j;
					System.out.print(multiplicationTable + " ");
				}
				System.out.println(" ");								//Loop 1 - Statement
			}
		}	
		
}

