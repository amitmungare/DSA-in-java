package linkedList;

public class MergeSortLL {
	
	 public static void print(Node<Integer> head) {
			while(head !=null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.println();
		}
	
	 
	 public static Node<Integer> midPoint(Node<Integer> head) {
		 
		 Node<Integer> slow=head;
		 Node<Integer> fast=head;
		 
		 while(fast.next != null) {
			 fast = fast.next.next;
			 if(fast == null) {
				 break;
			 }
			 slow = slow.next;
		 }
		return slow;
	 }

	 
	 public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
		 if(head1 == null) {
			 return head2;
		 }
		 if(head2 == null) {
			 return head1;
		 }
		 
		 Node<Integer> head3 =null, tail=null;
		 
		 if(head1.data <head2.data) {
			 head3=head1;
			 tail=head1;
			 head1=head1.next;
		 }else {
			 head3=head2;
			 tail=head2;
			 head2=head2.next;
		 }
		 
		 
		 while(head1 !=null && head2 !=null) {
			 
			 if(head1.data <head2.data) {
				 tail.next=head1;
				 tail=tail.next;
				 head1=head1.next;
			 }else {
				 tail.next=head2;
				 tail=tail.next;
				 head2=head2.next;
			 }
			 
		 }
		 
		 if(head1 != null) {
				tail.next=head1;
			}else {
				tail.next=head2;
			}
		 return head3;
	 }

	 
	 public static Node<Integer> mergeSort(Node<Integer> head){
		 
		 if(head ==null || head.next ==null) {
			 return head;
		 }
		 
		 Node<Integer> mid = midPoint(head);
		 Node<Integer> h1 = head;
		 Node<Integer> h2 = mid.next;
		 mid.next=null;
		 
		 h1=mergeSort(h1);
		 h2=mergeSort(h2);
		 
		 Node<Integer> head1 = merge(h1, h2);
		 
		 return head1;
	 }
	 
	 
	public static void main(String[] args) {
	
		Node<Integer> node1 = new Node<>(2);
		Node<Integer> node2 = new Node<>(1);
		Node<Integer> node3 = new Node<>(5);
		Node<Integer> node4 = new Node<>(3);
		Node<Integer> node5 = new Node<>(4);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		Node<Integer> head =node1;
		
		
		head = mergeSort(head);

		print(head);
		
	}

}
