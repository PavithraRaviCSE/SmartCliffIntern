package linkedList;

import java.util.Stack;

public class MyLinkedList {

	private Node head;

	public MyLinkedList() {
		head = null;
	}

	class Node {
		int data;
		Node next;

		Node(int val) {
			data = val;
			next = null;
		}
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public void insertingAtBeginning(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head.next;
			head = newNode;
		}
	}

	public void insertingAtTheEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}

			current.next = newNode;
		}
	}

	public void insertingAtSpecificIndex(int index, int data) {

		Node newNode = new Node(data);
		if (head == null) {
			System.out.println("list is empty");
		} 
		else {
			Node current = head;
			int count = 0;
			while (count < index-1 && current != null) {
				current = current.next;
				count++;
			}

			if (current.next == null) {
				current.next = newNode;
			} else {
				newNode.next = current.next;
				current.next = newNode;
			}
		}

	}

	public void deleteAtTheBegining() {

		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			
			head = head.next;
			
		}
	}

	public void deleteAtTheEnd() {

		if (isEmpty()) {
			System.out.println("list is already empty");
		} else {
			Node ptr = head;
			while (ptr.next.next != null) {
				ptr = ptr.next;
			}

			ptr.next = null;
		}
	}

	public void deleteAtTheSpecificIndex(int index) {

		if(size() < index || index < 1) {
			System.out.println("Invald data");
		}
		else if (isEmpty()) {
			System.out.println("List is empty");
		}
		else if(index == 1) {
			deleteAtTheBegining();
		}
		else if(index == size()) {
			deleteAtTheEnd();
		}
		else {
			int count = 0;
			Node ptr = head;
			Node prePtr = ptr;
//			while (count < position - 1 && ptr != null) {
			while(--index > 0) {
				prePtr = ptr;
				ptr = ptr.next;
				count++;
			}

			prePtr.next = ptr.next;
			ptr = null;

		}

	}

	public void deleteElement(int data) {

		if(isEmpty()) {
			System.out.println("list is empty");
		}
		else {
			int pos = 1;
			Node ptr = head;
			while(ptr != null) {
				if(ptr.data == data) {
					deleteAtTheSpecificIndex(pos);
				}
				else {
					pos ++;
				}
				
				ptr = ptr.next;
				
			}
		}
	}

	public void display() {

		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			Node ptr = head;
			while (ptr != null) {
				System.out.print(ptr.data + " ");
				ptr = ptr.next;
			}

			System.out.println();
		}
	}

	public void reversingList() {
		
		Stack<Integer> stack = new Stack<>();
		Node ptr = head;
		while(ptr!= null) {
			stack.push(ptr.data);
			ptr = ptr.next;
		}
		
		ptr = head;
		
		while(!stack.isEmpty() && ptr!= null) {
			ptr.data = stack.pop();
			ptr = ptr.next;
		}
		
//		while()
//		if(isEmpty()) {
//			System.out.println("list the empty");
//		}
//		else {
//			int i = 0 ;
//			int j = size();
//			int k = size()/2;
//			Node ptr = head;
//			while(i < k) {
//				ptr = ptr.next;
//			}
//			Node perPtr = ptr;
//			while(i < j) {
//				k = size() / 2;
//				while(k < j) {
//					perPtr = perPtr.next;
//					k++;
//				}	
//				
//				
//			}
//		}
	}
	public int indexOf(int num) {

		if (isEmpty()) {
			System.out.println("list is empty");
		}

		else {
			int count = 0;
			Node ptr = head;
			while (ptr != null && ptr.data != num) {
				ptr = ptr.next;
				count++;
			}

			return count + 1;
		}

		return -1;
	}

	public int size() {
		int count = 0;
		Node ptr = head;
		while (ptr != null) {
			count++;
			ptr = ptr.next;
		}
		return count;
	}
}
