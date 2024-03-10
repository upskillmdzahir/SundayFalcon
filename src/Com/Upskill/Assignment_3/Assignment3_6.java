package Com.Upskill.Assignment_3;

public class Assignment3_6 {

	public static void main(String[] args) {
		/* Write a java program which will count the number of vowels, consonants, digits, tabs 
		and blank spaces from a string “A quick brown fox jumps over the lazy dog” */
        String line = "A quick brown fox jumps over the lazy dog";

        int vowels = 0, consonants = 0, digits = 0, tabs = 0, spaces = 0;

        for (char ch : line.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".contains(String.valueOf(ch))) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == '\t') {
                tabs++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Tabs: " + tabs);
        System.out.println("Spaces: " + spaces);
    }
}
