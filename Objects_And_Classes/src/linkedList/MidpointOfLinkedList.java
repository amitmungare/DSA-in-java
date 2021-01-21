package linkedList;

public class MidpointOfLinkedList {
	
	 public static Node<Integer> midPoint(Node<Integer> head) {
		
		if(head==null || head.next==null) {
			return head;
		}
		 
		Node<Integer> slow =head;
		Node<Integer> fast =head;
		
		while(fast.next != null) {			
			fast=fast.next.next;			
			if(fast ==null) {
				break;
			}
            slow=slow.next;
		}
		return slow; 
	 }

	 public static void print(Node<Integer> head) {
			while(head !=null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.println();
		}
	 
	 
	public static void main(String[] args) {
	
		Node<Integer> node1 = new Node<>(1);
		Node<Integer> node2 = new Node<>(2);
		Node<Integer> node3 = new Node<>(3);
		Node<Integer> node4 = new Node<>(4);
		Node<Integer> node5 = new Node<>(5);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		Node<Integer> head =node1;
		
		
		head = midPoint(head);
		print(head);
		
	}

}
