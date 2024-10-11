package functional;

import java.util.Arrays;

public class findLongestWord {
	
	public static void main(String[] args) {
		String str = "The quick brown fox jumped over the lazy dog";
		
		String ss = Arrays.stream(str.split(" "))
				.reduce("", (a,b) -> a.length()>=b.length() ? a:b);
		System.out.println(ss);
	}
}