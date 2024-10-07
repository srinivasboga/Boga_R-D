package functional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class capitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words separated by spaces:");
        String input = scanner.nextLine();
        // Use stream to capitalize first letter of each word
        String result = Arrays.stream(input.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(", "));
        // Output
        System.out.println("[" + result + "]");
        scanner.close();
    }
}
