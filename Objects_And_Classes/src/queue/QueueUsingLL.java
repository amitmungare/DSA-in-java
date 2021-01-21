package queue;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=null;	
	}
}

public class QueueUsingLL {
	
	private Node front;
	private Node rear;
	private int size;


	public QueueUsingLL() {
		front =null;
		rear=null;
		size=0;
	}
	



	public int getSize() { 
		return size;
    }


    public boolean isEmpty() { 
    	return (size==0);
    }


    public void enqueue(int data) {
    
    	Node newNode = new Node(data);
    	if(rear==null) {
    		front=newNode;
    		rear=newNode;
    	}else {
    		rear.next=newNode;
    		rear=newNode;
    	}
    	size++;
    	
    }


    public int dequeue() {
    	
    	if(size==0) {
    		return -1;
    	}
    	int temp = front.data;
    	front =front.next;
    	if(size==1) {
    		rear=null;
    	}
    	size--;
    	return temp;
    	
    }


    public int front() {
    	if(size==0) {
    		return -1;
    	}
    	return front.data;
    }

	
	
	

	public static void main(String[] args) {
		
		QueueUsingLL queue = new QueueUsingLL();
		for(int i=1;i<=30;i++) {
			queue.enqueue(i);
		}

		while(! queue.isEmpty()) {
			System.out.print(queue.dequeue()+" ");
		}

	}

}
