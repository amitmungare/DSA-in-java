package stack;
import java.util.Stack;
public class BalancedorNot {
	
	
	 public static boolean isBalanced(String exp) {
		Stack<Character> stack = new Stack<>(); 
			
		for(int i=0; i<exp.length();i++) { 
			
			if(exp.charAt(i)=='(') {
				stack.push(exp.charAt(i));
			}
			
			if(exp.charAt(i)==')') {
				if(stack.isEmpty()) {
					return false;
				}
				
				if(stack.peek()=='(') {
					stack.pop();
				}else {
					return false;
				}
			}			
		}
		
		if(!stack.isEmpty()) {
			return false;
		}
		
		return true;
	 }

	public static void main(String[] args) {
		
		
	}

}
