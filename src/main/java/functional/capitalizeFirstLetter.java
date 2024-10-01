package functional;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

public class capitalizeFirstLetter {
    public static List<String> capitalizeFirst(Stream<String> stream) {
        return stream
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)) // Capitalize first letter
                .collect(Collectors.toList()); // Collect the result into a List
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter words separated by spaces:");
        String input = scanner.nextLine();  // Read the entire input line

        // Convert the input string to a stream of words
        Stream<String> wordStream = Arrays.stream(input.split(" "));

        // Capitalize the first letter of each word
        List<String> capitalizedWords = capitalizeFirst(wordStream);

        // Print the result
        System.out.println(capitalizedWords);

        scanner.close();
    }
}
