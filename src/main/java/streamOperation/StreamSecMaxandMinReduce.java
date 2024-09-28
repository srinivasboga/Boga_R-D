package streamOperation;

import java.util.Arrays;
import java.util.Optional;

public class StreamSecMaxandMinReduce {

    public static Optional<Integer> findSecondHighest(int[] arr) {

        if (arr.length < 2) {
            return Optional.empty();
        }

        int distinctCount = (int) Arrays.stream(arr).distinct().count();
        if (distinctCount < 2) {
            return Optional.empty(); // Not enough distinct elements
        }

        return Arrays.stream(arr)
                     .distinct()  // Removes duplicates
                     .boxed()     // Converts int stream to Integer stream
                     .sorted() // Sorts in reverse (highest to lowest)
                     .skip(distinctCount - 2)     // Skips the highest element
                     .findFirst(); // Finds the second highest
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {}, // Empty array
            {2}, // Single element
            {2, 2, 2}, // One distinct element
            {5, 13, 4, 21, 13, 27, 2, 59, 59, 34} // Normal case
        };

        for (int[] numbers : testCases) {
            Optional<Integer> secondHighest = findSecondHighest(numbers);
            secondHighest.ifPresentOrElse(
                value -> System.out.println("Second highest: " + value),
                () -> System.out.println("Second highest number cannot be found for input: " + Arrays.toString(numbers))
            );
        }
    }
}
