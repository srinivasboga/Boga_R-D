package Default_Methods;

public interface Interface3 extends Interface2{

	default void methodC() {
		
		System.out.println("Inside interface: "+Interface3.class);
		
	}
}
