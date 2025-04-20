package queuepackage;

public class circularqueueImplementation {
	public static void main(String args[]) {
		MyCircularQueue queue = new MyCircularQueue(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);

		queue.originalQueue();
		queue.display();
		
		System.out.println("Size : " + queue.size());

		System.out.println("isEmpty: " + queue.isEmpty());

		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		queue.originalQueue();
		queue.display();

		System.out.println("Size : " + queue.size());

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		queue.originalQueue();
		System.out.println("Size : " + queue.size());
		System.out.println("peek first: " + queue.peek());

		queue.display();
	}

}
