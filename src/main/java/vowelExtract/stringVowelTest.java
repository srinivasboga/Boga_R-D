package vowelExtract
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class stringVowelTest {

    @Test
    public void testVowelsInString() {
        String result = stringVowel.Vowel("Hello World!");
        assertEquals("eoo", result, "Vowels should be extracted correctly from 'Hello World!'.");
    }

    @Test
    public void testEmptyString() {
        String result = stringVowel.Vowel("");
        assertEquals("", result, "Empty string should return an empty string.");
    }

    @Test
    public void testStringWithNoVowels() {
        String result = stringVowel.Vowel("bcdfghjklmnpqrstvwxyz");
        assertEquals("", result, "String with no vowels should return an empty string.");
    }

    @Test
    public void testUppercaseVowels() {
        String result = stringVowel.Vowel("AEIOU");
        assertEquals("AEIOU", result, "Uppercase vowels should be extracted correctly.");
    }

    @Test
    public void testMixedCaseVowels() {
        String result = stringVowel.Vowel("hEllO");
        assertEquals("EO", result, "Both uppercase and lowercase vowels should be extracted correctly.");
    }

    @Test
    public void testOnlyVowels() {
        String result = stringVowel.Vowel("aeiouAEIOU");
        assertEquals("aeiouAEIOU", result, "String with only vowels should return all vowels.");
    }
}
