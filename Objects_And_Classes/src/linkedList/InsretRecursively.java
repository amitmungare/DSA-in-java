package linkedList;

public class InsretRecursively {
	
	 public static void print(Node<Integer> head) {
			while(head !=null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.println();
		}

	 
	 public static Node<Integer> insert(Node<Integer> head, int data ,int pos){
			
		 if(pos == 0) {
			 Node<Integer> newnode =new Node<>(data);
			 newnode.next=head;
			 return newnode;
		 }
		 
		 if(head == null) {
			 return head;
		 }
		 
		 	head.next =insert(head.next,data,pos-1);
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
		
		
		 head = insert(head,23,2);
		
		print(head);
	}

}
