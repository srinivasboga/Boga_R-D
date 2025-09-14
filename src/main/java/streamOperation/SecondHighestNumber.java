
package streamOperation;

/**
 *
 * @author abdul.haseeb
 */
import java.util.*;
import java.util.stream.Collectors;

public class SecondHighestNumber {

    public static Optional<Integer> findSecondHighest(int[] array) {
     
        List<Integer> sortedDistinctNumbers = Arrays.stream(array)
                .boxed()
                .distinct() 
                .sorted(Comparator.reverseOrder()) 
                .collect(Collectors.toList()); 

        if (sortedDistinctNumbers.size() < 2) {
            return Optional.empty();
        }

        return Optional.of(sortedDistinctNumbers.get(1));
    }

    public static void main(String[] args) {
        
        int[] testArray1 = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34}; //Normal Case
        int[] testArray2 = {1, 1, 1}; // Edge case with fewer than two distinct numbers
        int[] testArray3 = {-10, -20, -30, -40}; // Array with negative numbers
        int[] testArray4 = {42}; // Edge case with only one number

        System.out.println("Second highest in testArray1: " + findSecondHighest(testArray1).orElse(null)); 
        System.out.println("Second highest in testArray2: " + findSecondHighest(testArray2).orElse(null)); 
        System.out.println("Second highest in testArray3: " + findSecondHighest(testArray3).orElse(null)); 
        System.out.println("Second highest in testArray4: " + findSecondHighest(testArray4).orElse(null)); 
    }
}
