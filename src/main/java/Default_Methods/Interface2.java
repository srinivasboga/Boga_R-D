package Default_Methods;

public interface Interface2 extends Interface {

	default void methodB() {
		System.out.println("Inside 2nd interface: "+Interface2.class);
	}
}
