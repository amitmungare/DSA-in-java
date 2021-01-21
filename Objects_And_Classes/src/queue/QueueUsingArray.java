package queue;

public class QueueUsingArray {

	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueueUsingArray() {
		data =new int[10];
		front = -1;
		rear =-1;
		size=0;
	}
	
	public QueueUsingArray(int n) {
		data = new int[n];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	int front() {
		if(size==0) {
			return -1;
		}
		return data[front];
	}
	
	void enqueue(int ele) {
		if(size==data.length) {
			System.out.println("Error");
		}
		if(size==0) {
			front=0;
		}
		size++;
		
		rear =(rear+1) % data.length;
		
		data[rear]=ele;
	}
	
	int dequeue() {
		if(size==0) {
			return -1;
		}
		int temp=data[front];
		front =(front+1) % data.length;
		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
		return temp;
	}
	
	
}
