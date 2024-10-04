package vowelExtract;
import javax.swing.JOptionPane;

public class StringVowel {
    public static String Vowel(String str) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            // Used String.indexOf() for compact vowel checking
            if ("aeiouAEIOU".indexOf(a) != -1) {
                s.append(a);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Enter a string:");
        String vowels = Vowel(str);
        JOptionPane.showMessageDialog(null, "Vowels extracted: " + vowels);
    }
}
