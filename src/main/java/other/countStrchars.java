package other;

public class countStrchars {
	
	public static void main(String[] args) {
		String str = "DDDTTYYDD";
		StringBuilder res = new StringBuilder();
		
		
		//3D2T2Y2D
		int count = 1;
		for(int i = 1;i<str.length();i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
			} else {
				res.append(count).append(str.charAt(i-1));
				//System.out.print((str.charAt(i-1)));
				count = 1;
			}
		}
		res.append(count).append(str.charAt(str.length()-1));
		System.out.print(res);
	}
}
