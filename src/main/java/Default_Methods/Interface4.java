package Default_Methods;

public interface Interface4 {

	
	public static int i = 20;
	
	default void methodA() {
		
		System.out.println("Inside 4 interface: "+Interface4.class);

	}
}
