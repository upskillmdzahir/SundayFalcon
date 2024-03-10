package Com.Upskill.Assignment_4;

public class Assignment4_4 {

    public static void main(String[] args) {
        int year = 2024;

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not by 100 unless divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
