package stack;

public class StackuseLL {

	public static void main(String[] args) {
		
		StackUsingLL stack = new StackUsingLL();
		
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
