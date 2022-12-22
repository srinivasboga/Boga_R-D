package OptionalExample;

import java.util.Optional;

public class optionalisPresentifPresent {

	public static void main(String[] args) {

		Optional<String> optional = Optional.ofNullable("Hello isPresent");
		
		System.out.println(optional.isPresent());
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		optional.ifPresent(s->System.out.println(s));
	}

}
