package stack;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		
	}

}
