package queuepackage;

public class LinkedQueue {

	private Node front;
	private Node rear;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public LinkedQueue() {
		front = null;
		rear = null;
	}

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			front = rear = newNode;
			return;
		}
		
		rear.next = newNode;
		rear = newNode;

	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}
		
		int num = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return num;

	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		
		Node current = front;
		while(current  != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		System.out.println();
	}

	public int peek() {

		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}

		return front.data;
	}

	public int size() {

		if (isEmpty()) {
			return 0;
		}

		int count = 0;
		Node current = front;

		while (current != null) {
			current = current.next;
			count++;
		}

		return count;
	}

	public int recentCall(int n) {
		enqueue(n);
		Node current = front;
		int count  = 0;
		int start = n - 3000 ;
		while(current != null) {
			if(current.data  >= start && current.data <= n) {
				count  ++;
			}
			current  = current.next;
		}
		
		return count;
	}
	public boolean isEmpty() {
		return rear == null;
	}

}
