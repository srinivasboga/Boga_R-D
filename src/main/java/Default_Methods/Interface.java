package Default_Methods;

public interface Interface {

	default void methodA() {
		
		System.out.println("Inside 1st interface: "+Interface.class);

	}
}
