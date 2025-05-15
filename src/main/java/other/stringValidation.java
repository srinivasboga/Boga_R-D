package other;

import java.util.Stack;

public class stringValidation {
	
	public static boolean isValid(String str) {
		Stack<Character> s = new Stack<>();
		
		
		for(char c: str.toCharArray()) {
			if(c=='(') {
				s.push(')');
			} else if(c=='{') {
				s.push('}');
			} else if(c=='[') {
				s.push(']');
			}else if(s.isEmpty() || s.pop() !=c) {
				return false;
			}
		}
		return s.isEmpty();
	}
	
	public static void main(String[] args) {
		
		String str = "{[()]}";
		System.out.println(isValid(str));
	}
}
