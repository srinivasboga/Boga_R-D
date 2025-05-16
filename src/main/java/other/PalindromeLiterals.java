package other;

public class PalindromeLiterals {
	
	public static void main(String[] args) {
		
		String str = "Cigar? Toss it in a can. It is so tragi";
		
		String letters = str.chars()
				.filter(Character::isLetter)
				.map(Character::toLowerCase)
				.collect(StringBuilder::new,
						StringBuilder::appendCodePoint,
						StringBuilder::append).toString();
		String reversed = new StringBuilder(letters).reverse().toString();
		boolean palin = letters.equals(reversed);
		
		
		System.out.println(palin);
	}
}
