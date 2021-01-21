package queue;

public class QueueUse {

	public static void main(String[] args) {
		
		QueueUsingArray queue = new QueueUsingArray();
		for(int i=1;i<=1;i++) {
			queue.enqueue(i);
		}

		while(! queue.isEmpty()) {
			System.out.print(queue.dequeue()+" ");
		}
		
	}

}
