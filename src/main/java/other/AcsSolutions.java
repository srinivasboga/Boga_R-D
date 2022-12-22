package other;

public class AcsSolutions {

	public static void main(String[] args) {
		
		int rows =5,space, i,j,num;
		for(i=0;i<rows;i++) {
		
			for(space = rows; space>i;space--) {
				System.out.print(" ");
			}
			
			num = 1;
			for(j=0;j<=i;j++) {
				System.out.print(num+" ");
			num = num*(i-j)/(j+1);
			}
		System.out.println("\n");
		/*
		 * list.stream() .map(n -> n.toLowerCase())
		 * .sorted(Comparator.comparingInt(String::length)) .map(s ->
		 * Character.toUpperCase(s.charAt(0)) + s.substring(1)) .forEachOrdered(n ->
		 * System.out.println(n));
		 */
		
		}
	}

}
