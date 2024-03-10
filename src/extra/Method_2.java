//2.   Write a java program following below:

//a.   A method which multiply with two numbers and show in output

//b.   Another method with holding two variables which will display your first name and last name on the screen.

package extra;

public class Method_2 {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int product = multiply(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);

        String firstName = "John";
        String lastName = "Doe";

        displayName(firstName, lastName);
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void displayName(String firstName, String lastName) {
        System.out.println("Your name is " + firstName + " " + lastName);
    }
}
