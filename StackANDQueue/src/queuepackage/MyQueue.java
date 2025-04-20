package queuepackage;

import stackpackage.MyStack;

public class MyQueue {

	private int queue[];
	private int front;
	private int rear;
	private int capacity;

	public MyQueue(int capacity) {
		front = -1;
		rear = -1;
		queue = new int[capacity];
		this.capacity = capacity;
	}

	public void enqueue(int num) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		if (isEmpty()) {
			front++;
			rear++;
			queue[rear] = num;

			return;
		}

		queue[++rear] = num;

	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int n = queue[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		}
		else
		front++;

		return n;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}

		return queue[front];

	}

	public void reveral() {
		MyStack stack = new MyStack(size());
		stack.display();
		while(!isEmpty()) {
			stack.push(dequeue());
		}
		stack.display();
		while (!stack.isEmpty()) {
			enqueue(stack.pop());
		}
		
	}

	public boolean isFull() {
		return rear == capacity - 1;
	}

	public boolean isEmpty() {

		return front == -1;

	}

	public int size() {
		if (front == -1) {
			return 0;
		} else {
			return rear - front + 1;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}

		int i = front;

		while (i <= rear) {
			System.out.print(queue[i] + " ");
			i++;
		}

		System.out.println();
	}
}
