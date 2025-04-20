package stackpackage;

import java.util.Scanner;

public class CharStack{
	private Node top;

	private class Node {
		char data;
		Node next;

		Node(char data) {
			this.data = data;
			next = null;
		}
	}

	public CharStack() {
		top = null;
	}
	
	public char peek() {
		return (isEmpty())? '$' : top.data;
	}

	public void push(char data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			top = newNode;
			return;
		}

		newNode.next = top;
		top = newNode;
	}

	public char pop() {
		if (isEmpty()) {
			
			return '&';
		}

		char c = top.data;
		
		top = top.next;
		return c;
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

