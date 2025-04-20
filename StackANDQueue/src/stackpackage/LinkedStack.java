package stackpackage;

public class LinkedStack {
	private Node top;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	LinkedStack() {
		top = null;
	}
	
	public int peek() {
		return (isEmpty())? -1 : top.data;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			top = newNode;
			return;
		}

		newNode.next = top;
		top = newNode;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}

		int data = top.data;
		top = top.next;
		return data;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		
		Node current = top;
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		System.out.println();
	}
	public boolean isEmpty() {
		return top == null;
	}

}
