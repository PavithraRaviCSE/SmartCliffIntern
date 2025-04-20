package queuepackage;

import java.util.Arrays;

public class MyCircularQueue {
	private int queue[];
	private int front;
	private int rear;
	private int capacity;

	MyCircularQueue(int capacity) {
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
			front = 0;
			rear = 0;
			queue[rear] = num;
		} else {
			rear = (rear + 1) % capacity;

			queue[rear] = num;

		}
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
		} else {
			front++;
		}
		return n;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return -1;
		}

		return queue[front];

	}

	public boolean isFull() {
		if (front == 0 && rear == capacity - 1 || rear == front - 1) {
			return true;
		}

		return false;
	}

	public boolean isEmpty() {

		return front == -1 || rear == -1;

	}

	public int size() {
		if (front == -1) {
			return 0;
		} else {
			int count = 0;
			if (front > rear) {
				count += rear + 1;
				count += capacity -  front;
			} else {
				count = rear - front + 1;
			}
			return count;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}

		int i = front;
		int j = rear;

		System.out.println("display: ");
		if (front > rear) {
			while (i < capacity) {

				System.out.print(queue[i] + " ");
				i++;
			}
			i = 0 ;
			while (i <= j) {
				System.out.print(queue[i] + " ");
				i++ ;
			}
		}
		else {
			while( i <= j) {
				System.out.print(queue[i] + " ");
				i++;
			}
		}

		System.out.println();
	}
	
	public void originalQueue() {
		System.out.println("original array: " + Arrays.toString(queue));
	}
}
