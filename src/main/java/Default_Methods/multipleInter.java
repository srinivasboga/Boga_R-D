package Default_Methods;

public class multipleInter implements Interface, Interface2, Interface3 {

	public void methodA() {
		
		System.out.println("Inside multipleInter interface: "+Interface.class);

	}
	
	
	public static void main(String[] args) {

		multipleInter in = new multipleInter();
		
		in.methodA();
		in.methodB();
		in.methodC();
		
		
	}

}
