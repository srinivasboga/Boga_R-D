package exception;

public class multiCatch {

		public static void main(String[] args)
				throws ArrayIndexOutOfBoundsException, IllegalArgumentException, InterruptedException {
			
			   try{  
				    int a[]=new int[5];  
				  
				    System.out.println(a[10]);
				   }  
			   catch(ArithmeticException e)
		          {
				   System.out.println("Arithmetic Exception occurs");
				  }
			   		catch(Exception e)
			          {
					   System.out.println("Arithmetic Exception occurs");
					  } 
				   System.out.println("rest of the code");  
		}
}
