package other;

public class findSQRT {
	
	public static void main(String[] args) {
		int x = 9;
		int val = mySqrt(x);
		System.out.println(val);
	}
	
	public static int mySqrt(int x) {
		
		if(x==1) return 1;
		int val = 0;
		int y = x/2;
		for(int i =y;i>1;i--) {
			int z = i;
			while ( z < x ) {
			z = z*i;
			val = i;
			}
			
		}
		return val;
	}
}
