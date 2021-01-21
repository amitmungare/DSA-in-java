package linkedList;

public class BubbleSort {
	

	 public static void print(Node<Integer> head) {
			while(head !=null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.println();
	}
	 
	 
	 public static int len(Node<Integer> head) {
		 
		 int count=0;
		 while(head !=null) {
			 head=head.next;
			 count++;
		 }
		 return count;
 
	 }

	 public static Node<Integer> bubbleSort(Node<Integer> head) {
		 int n=len(head);
		 
		 int i=0;
		 while(i<(n-1)) {
			 Node<Integer> c=head;
			 Node<Integer> p=null;
			 
			 for(int j=0;j<n-i-1;j++) {
				 if(c.data<=c.next.data) {
					 p=c;
					 c=c.next;
				 }else {
					 if(p==null) {
						 Node<Integer> fwd =c.next;
						 head = head.next;
						 c.next =fwd.next;
						 fwd.next=c;
						 p=fwd;
					 }else {
						 Node<Integer>fwd=c.next;
						 p.next=fwd;
						 c.next=fwd.next;
						 fwd.next=c;
						 p=fwd;
						 
					 }
				 }
			 }
			 i++;
		 }
		 
		return head; 
	 }
	 
	public static void main(String[] args) {
		Node<Integer> node1 = new Node<>(1);
		Node<Integer> node2 = new Node<>(3);
		Node<Integer> node3 = new Node<>(5);
		Node<Integer> node4 = new Node<>(2);
		Node<Integer> node5 = new Node<>(4);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		Node<Integer> head =node1;
		
		
		 head = bubbleSort(head);
		 print(head);

	}

}
