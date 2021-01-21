package stack;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=null;	
	}
}

public class StackUsingLL {
	
	private Node head;
	private int size;

	public StackUsingLL() {
		head=null;
		size=0;
	}
	
	
	public int size() {
		return size;
	}
	
	
	public boolean isEmpty() {
		return(head==null);
	}
	
	
	public int top() throws StackEmptyException {
		if(head==null) {
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		return head.data;
	}
	
	
	public void push(int ele) {
		Node t1=new Node(ele);
		t1.next=head;
		head=t1;
		size++;		
	}
	
	
	public int pop() throws StackEmptyException {
		if(head==null) {
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		int t2=head.data;
		head=head.next;
		size--;
		return t2;
	}
	
	
}
