package linkedList;

public class FindNodeLLRecursive {
	
	public static int findNodeRec(Node<Integer> head, int n) {
		return findNodeRec(head.next, n,0);
	}


	 public static int findNodeRec(Node<Integer> head, int n,int count) {
		
		 if(head == null ) {
			 return -1;
		 }
		 if(head.data ==0) {
			 return -1;
		 }
		 
		 if(head.data==n) {
				return count+1;
		 }
			
		return findNodeRec(head.next, n,count+1);
			
 	
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
		
		
		 int num = findNodeRec(head,1);
		
		System.out.println(num);
	}

}
