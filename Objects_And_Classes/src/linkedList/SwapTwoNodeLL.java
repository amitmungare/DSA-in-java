package linkedList;

public class SwapTwoNodeLL {
	 public static void print(Node<Integer> head) {
			while(head !=null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.println();
		}
	 
	 public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
			
		 Node<Integer> p1=null;
		 Node<Integer> p2=null;
		 Node<Integer> c1=null;
		 Node<Integer> c2=null;
		 Node<Integer> prev=null;
		 
		 int count=0;
		 if(i==j) {
			 return head;
		 }
		 
		 while(head!=null) {
			 if(count==i) {
				 p1=prev;
				 c1=head;
			 }else if(count==j){
				 p2=prev;
				 c2=head;
			 }
			 
			 prev=head;
			 head=head.next;
			 count++;
			 
		 }
		 
		 if(p1 !=null) {
			 p1.next=c2;
		 }else {
			 head=c2;
		 }
		 
		 if(p2 !=null) {
			 p2.next=c1;
		 }else {
			 head=c1;
		 }
		 
		 Node<Integer> currnode  = c2.next;
		 c2.next=c1.next;
		 c1.next=currnode;
		 
		 return head;
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
		
		
		 head = swapNodes(head,2,3);
		 print(head);
	}

}
