package Default_Methods;

public class MultipleInterImpl implements Interface, Interface4 {

		static int i = 10000;
		
		
	public static void main(String[] args) {
		
		System.out.println(""+MultipleInterImpl.class);
	
		MultipleInterImpl mul = new MultipleInterImpl();
		
		i = 200000;
		
		int j = Interface4.i;

		System.out.println(""+MultipleInterImpl.class+" "+mul.i+" "+Interface4.i);
		
		mul.methodA();
		
	}

	
	@Override
	public void methodA() {
	
		 //Interface.super.methodA();
		
	System.out.println("This is inside the MultipleInterImpl: ");
	
	}

}
