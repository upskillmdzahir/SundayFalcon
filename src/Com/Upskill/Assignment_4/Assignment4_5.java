package Com.Upskill.Assignment_4;

import java.util.Arrays;

public class Assignment4_5 {

    public static void main(String[] args) {
    	
    	// Check whether two strings are anagram of each other from an array?
    	
    	
        String[] array = {"listen", "silent", "hello", "world"};

        // Test the areAnagrams method
        String str1 = "listen";
        String str2 = "silent";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        // Check anagrams in the array
        checkAnagramsInArray(array);
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Check if two strings are anagrams
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the characters in both arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void checkAnagramsInArray(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (areAnagrams(array[i], array[j])) {
                    System.out.println(array[i] + " and " + array[j] + " are anagrams.");
                }
            }
        }
    }
}
