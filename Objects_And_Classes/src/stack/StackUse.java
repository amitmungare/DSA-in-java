package stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException {

		StackUsingArray stack = new StackUsingArray();
		
		for(int i=1 ;i<=10;i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			try {
				System.out.print(stack.pop()+" ");
			} catch (StackEmptyException e) {
				
			}
		}
		
		
	}

}
