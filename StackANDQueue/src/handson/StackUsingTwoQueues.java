package handson;

import java.util.Scanner;

import queuepackage.LinkedQueue;

public class StackUsingTwoQueues {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StackUsingTwoQueues stack = new StackUsingTwoQueues();

		while (true) {
			System.out.println("\nChoose an operation:");
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: Peek");
			System.out.println("4: IsEmpty");
			System.out.println("5: Exit");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter value to push: ");
				int value = scanner.nextInt();
				stack.push(value);
				break;
			case 2:
				int poppedValue = stack.pop();
				if (poppedValue != -1) {
					System.out.println("Popped value: " + poppedValue);
				}
				break;
			case 3:
				int peekValue = stack.peek();
				if (peekValue != -1) {
					System.out.println("Top value: " + peekValue);
				}
				break;
			case 4:
				if (stack.isEmpty()) {
					System.out.println("Stack is empty.");
				} else {
					System.out.println("Stack is not empty.");
				}
				break;
			
			case 5:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	LinkedQueue q1 = new LinkedQueue();
	LinkedQueue q2 = new LinkedQueue();
	int currentSize = 0;

	public void push(int value) {
		currentSize++;
		q2.enqueue(value);
		while (!q1.isEmpty()) {
			q2.enqueue(q1.dequeue());
		}

		LinkedQueue temp = q1;
		q1 = q2;
		q2 = temp;

		System.out.println("Pushed " + value + " to stack.");
	}

	public int pop() {
		if (q1.isEmpty()) {
			System.out.println("Stack is empty. Cannot pop.");
			return -1;
		} else {
			currentSize--;
			return q1.dequeue();
		}
	}

	public int peek() {
		if (q1.isEmpty()) {
			System.out.println("Stack is empty. Cannot peek.");
			return -1;
		} else {
			return q1.peek();
		}
	}

	public boolean isEmpty() {
		return q1.isEmpty();
	}

}
