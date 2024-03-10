package Com.Upskill.Assignment_4;

import java.util.HashMap;
import java.util.Map;
public class Assignment4_3 {

    public static void main(String[] args) {
    	// Write a method which return count of duplicate value from a array?
    	
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8, 9};

        int duplicateCount = countDuplicateValues(array);
        System.out.println("Count of duplicate values: " + duplicateCount);
    }

    public static int countDuplicateValues(int[] array) {
        // Create a HashMap to store the count of each element
        Map<Integer, Integer> countMap = new HashMap<>();

        // Traverse the array and update the count in the map
        for (int element : array) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        // Count the number of values with occurrences greater than 1
        int duplicateCount = 0;
        for (int count : countMap.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        return duplicateCount;
    }
}
