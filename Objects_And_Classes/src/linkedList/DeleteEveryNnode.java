package linkedList;

public class DeleteEveryNnode {
	
	 public static void print(Node<Integer> head) {
			while(head !=null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			System.out.println();
		}
	
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int m, int n) {
		
		if(m==0 || head==null) {
			return null;
		}
		if(n==0) {
			return head;
		}
		
		Node<Integer> temp1=head;
		Node<Integer> temp2=null;
		
		while(temp1 !=null) {	
			
		
			int c1=0;
			while(c1 < m  && temp1 != null) {
				if(temp2==null) {
					temp2=temp1;
				}else {
					temp2.next=temp1;
					temp2=temp1;
				}
				temp1=temp1.next;
				c1++;
			}
			
			int c2=0;
			
			while(c2 < n && temp1 != null) {
				temp1 = temp1.next;
				c2++;
			}
		}
		if(temp2 !=null) {
			temp2.next=null;
		}
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
		
		
		 head = skipMdeleteN(head,2,3);
		 print(head);
		
		
	}

}
