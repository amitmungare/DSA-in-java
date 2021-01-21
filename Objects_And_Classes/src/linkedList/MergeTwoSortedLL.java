package linkedList;

public class MergeTwoSortedLL {
	
	 public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) 
	 {
		 
		Node<Integer> t1=head1;
		Node<Integer> t2=head2;
		Node<Integer> head3=null , tail3=null;
		
		if(head1==null) {
			return head2;
		}
		if(head2==null) {
			return head1;
		}
		
		if(t1.data <= t2.data) {
			head3=t1;
			tail3=t1;
			t1=t1.next;
		}else {
			head3=t2;
			tail3=t2;
			t2=t2.next;
		}
		
		while(t1 != null && t2 != null) {
			
			if(t1.data <= t2.data) {
				
				tail3.next=t1;
				tail3=t1;
				t1=t1.next;
			}else {
				tail3.next=t2;
				tail3=t2;
				t2=t2.next;
			}
		}
		
		if(t1 != null) {
			tail3.next=t1;
		}else {
			tail3.next=t2;
		}
		
		return head3;
		 
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
		Node<Integer> node2 = new Node<>(3);
		Node<Integer> node3 = new Node<>(5);
		Node<Integer> node4 = new Node<>(7);
		Node<Integer> node5 = new Node<>(9);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		Node<Integer> head1 =node1;
		
		
		Node<Integer> node11 = new Node<>(2);
		Node<Integer> node12 = new Node<>(4);
		Node<Integer> node13 = new Node<>(6);
		Node<Integer> node14 = new Node<>(8);
		Node<Integer> node15 = new Node<>(10);
		node11.next=node12;
		node12.next=node13;
		node13.next=node14;
		node14.next=node15;
		Node<Integer> head2 =node11;
		
		
		head1 = mergeTwoSortedLinkedLists(head1,head2);
		print(head1);
		
	}

}
