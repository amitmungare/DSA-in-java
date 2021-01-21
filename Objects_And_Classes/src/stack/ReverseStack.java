package stack;
import java.util.*;
public class ReverseStack {
	

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		
		if(input.size()<=1) {
			return;
		}
		
		int temp =input.pop();
		reverseStack(input, extra);
		while(!input.isEmpty()) {
			int val=input.pop();
			extra.push(val);
		}
		input.push(temp);
		while(!extra.isEmpty()) {
			int val=extra.pop();
			input.push(val);
		}
		
	}

	public static void main(String[] args) {
		
		
		
		
	}

}
