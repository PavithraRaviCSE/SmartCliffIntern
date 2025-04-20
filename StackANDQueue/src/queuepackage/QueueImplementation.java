package queuepackage;

public class QueueImplementation {
	public static void main(String args[]) {
//		MyQueue queue = new MyQueue(5);
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(5);

		System.out.println("Size : " + queue.size());

		System.out.println("isEmpty: " + queue.isEmpty());

		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

		System.out.println("Size : " + queue.size());
		System.out.println("isEmpty: " + queue.isEmpty());
		
		queue.enqueue(2);
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(5);

		System.out.println(queue.peek());

		queue.display();

	}
}
