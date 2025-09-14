import java.util.stream.Collectors;

public class VowelFinder {

    public static String findVowels(String input) {
 
        String vowels = "AEIOUaeiou";
        
        return input.chars()
                .mapToObj(c -> (char) c) 
                .filter(c -> vowels.indexOf(c) >= 0) 
                .map(String::valueOf) 
                .collect(Collectors.joining());
    }
}
