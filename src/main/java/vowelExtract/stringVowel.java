package vowelExtract;
import java.util.Scanner;  // Import statement for Scanner

public class stringVowel {

    public static String Vowel(String str) {
        StringBuilder s = new StringBuilder();  // No need to initialize with ""

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            // Use String.indexOf() for compact vowel checking
            if ("aeiouAEIOU".indexOf(a) != -1) {
                s.append(a);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Vowel(str));
        sc.close();  // Always close the scanner to prevent resource leaks
    }
}
