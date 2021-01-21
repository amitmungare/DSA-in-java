package linkedList;

import java.util.Scanner;

public class LinkedListUse {
	
	
	public static Node<Integer> takeinput(){
		
		Node<Integer> head =null ,tail = null;
		Scanner s =new Scanner(System.in);
		int data = s.nextInt();
				
		while(data != -1) {
			Node<Integer> newNode =new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;
				tail = newNode;				
			}
			data = s.nextInt();
		}
		return head;
	}
	
	
	public static int length(Node<Integer> head){
		
		int count=0;
		
		while(head !=null) {
			count++;
			head = head.next;
		}
		
		return count;
	}
	
	
	public static void print(Node<Integer> head) {
		while(head !=null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void printReverse(Node<Integer> head) {
		
		if(head ==null) {
			return;
		}
		
		if(head !=null) {
			printReverse(head.next);
		}
		System.out.print(head.data + " ");
	}
	
	
	public static void printIthNode(Node<Integer> head, int i){
		
		int count=0;
		
		while(head != null) {
			if(count==i) {
				System.out.print(head.data);
				break;
			}
			count++;
			head = head.next;
		}
		
	}
	
	
	public static Node<Integer> insert(Node<Integer> head, int data ,int pos){
		
		Node<Integer> newNode = new Node<Integer>(data);
		
		if(pos ==0) {
			newNode.next = head;
			return newNode;
		}
		
		int i=0;
		Node<Integer> temp=head;
		while(i < pos-1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}
	
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		
		int i=0;
		Node<Integer> temp=head;
		
		if(head == null) {
			return head;
		}
		
		if(pos == 0) {
			return head.next;
		}
		
		while(temp !=null && i < pos-1) {
			temp = temp.next;
			i++;
		}
		
		if(temp == null || temp.next==null) {
			return head;
		}
		temp.next = temp.next.next;
		
		return head;
		
	}
	
	
	public static int findNode(Node<Integer> head, int n) {
		int count=0;
		while(head != null) {			
			
			if(head.data == n) {
				return count;
			}
			count++;
			head = head.next;
		}
		return -1;
	}
	

	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		
		if(head==null || head.next==null) {
			return head;
		}
		
		Node<Integer> t1=head;
		Node<Integer> t2=head.next;
		

		
		while(t2 !=null) {
			if(t1.data.equals(t2.data)) {
				t2=t2.next;
			}else {
				t1.next=t2;
				t1=t1.next;
				t2=t2.next;
			}
		}
		t1.next=null;
		return head;
		
		
		
	}


	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		
		if(head==null || n==0) {
			return head;
		}
		
		Node<Integer> temp=head;
		Node<Integer> temp1=head;

		int i=0;
		while(i < n) {
			temp = temp.next;
			i++;
		}
		
		while(temp.next !=null) {
			temp1=temp1.next;
			temp = temp.next;
		}
		
		Node<Integer> newHead=head;
		Node<Integer> temp2 = temp1.next;
		temp1.next=null;
		temp.next=newHead;
		head = temp2;
		
		return head;
	}
	
	
	public static void main(String[] args) {
		
//		Node<Integer> node1 = new Node<>(10);
//		System.out.println(node1.data);
//		System.out.println(node1.next);
//		System.out.println(node1);
//		
//		Node<Integer> node2 = new Node<>(20);
//		node1.next = node2;
//		System.out.println(node2);
//		System.out.println(node1.next);
		
		
//		Node<Integer> node1 = new Node<>(1);
//		Node<Integer> node2 = new Node<>(2);
//		Node<Integer> node3 = new Node<>(3);
//		Node<Integer> node4 = new Node<>(4);
//		node1.next=node2;
//		node2.next=node3;
//		node3.next=node4;
//		Node<Integer> head =node1;
		
		

		Node<Integer> head = takeinput();
		
//		head = insert(head, 44, 0);
		
//		head = deleteNode(head,2);
			
//		head = removeDuplicates(head);
		
		head = appendLastNToFirst(head, 5);
		
		print(head);
		
//		printReverse(head);
		
//		System.out.println(findNode(head , 3));	
		
//		System.out.println(length(head));
		
//		printIthNode(head,2);
		
		
//		1 2 3 4 5 6 -1
	}

}
