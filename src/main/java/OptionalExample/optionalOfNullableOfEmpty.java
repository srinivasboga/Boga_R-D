package OptionalExample;

import java.util.Optional;

public class optionalOfNullableOfEmpty {

	public static Optional<String> ofNullable() {
		
		Optional<String> ofString = Optional.ofNullable(null);
		
		return ofString;
	}
	
	public static Optional<String> of() {
		Optional<String> ofString = Optional.of("Hello");
		
		return ofString;
	}
	
	public static Optional<String> empty() {
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		
		System.out.println("ofNullable : "+ofNullable());
		System.out.println("Of : " +of());
		System.out.println("Empty : "+empty());

	}

}
