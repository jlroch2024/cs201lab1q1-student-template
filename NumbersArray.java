import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    public static int findMax(Integer[] input) {
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        
        return max;
    }

    public static Integer[] findDuplicates(Integer[] input) {
        Set<Integer> seenBefore = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();
        for (Integer num : input) {
            if (!seenBefore.add(num)) {
                duplicateNumbers.add(num);
            }
        }
        return duplicateNumbers.toArray(new Integer[0]);
    }
    
    public static Integer[] findUnique(Integer[] input) {
        Set<Integer> duplicateNumbers = new HashSet<>();
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (Integer num : input) {
            if (!duplicateNumbers.contains(num)) {
                if (!uniqueNumbers.add(num)) {
                uniqueNumbers.remove(num);
                duplicateNumbers.add(num);
            }

            
        }
        return uniqueNumbers.toArray(new Integer[0]);
    }
}

