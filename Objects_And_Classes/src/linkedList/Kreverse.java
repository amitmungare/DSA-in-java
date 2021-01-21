package linkedList;

public class Kreverse {
	
	 public static void print(Node<Integer> head) {
			while(head !=null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.println();
		}
	 
	 
	 public static Node<Integer> kReverse(Node<Integer> head, int k) {
			
		 if(k==0) {
			 return head;
		 }
		 Node<Integer> curr = head;
		 Node<Integer> t1 = null;
		 Node<Integer> t2 = null;
		 int count=0;
		 
		 while(count <k && curr!=null) {
			 t2=curr.next;
			 curr.next=t1;
			 t1=curr;
			 curr=t2;
			 count++;
		 }
		 
		 if(t2 !=null) {
			 head.next=kReverse(t2, k);
		 }
		 return t1;
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
		
		
		 head = kReverse(head,3);
		 print(head);
	}

}
