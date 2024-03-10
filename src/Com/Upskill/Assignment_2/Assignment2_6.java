package Com.Upskill.Assignment_2;

public class Assignment2_6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Write a java program to find the prime number from 1 to 100 and print them.

        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;

            if (i > 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {	/*i % j: This represents the modulo operation, which calculates the remainder 
                    						when i is divided by j. In other words, it gives you the remainder of the 
                    						division i / j. If the remainder is 0, it means that i is evenly divisible by j.
											== 0: This checks if the result of i % j is exactly equal to 0. If it is, the 
											condition evaluates to true, indicating that i is divisible by j without a remainder.*/
                        isPrime = false;
                        break; // Break the loop when a factor is found
                    }
                }
            } else {
                isPrime = false;
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
