package stackpackage;

import java.util.Scanner;

public class stackImplementation {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        MyStack stack = new MyStack(5); 
	        while (true) {
	            System.out.println("\nChoose an operation:");
	            System.out.println("1: Push");
	            System.out.println("2: Pop");
	            System.out.println("3: Peek");
	            System.out.println("4: IsEmpty");
	            System.out.println("5: IsFull");
	            System.out.println("6: Exit");

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
	                    if (stack.isFull()) {
	                        System.out.println("Stack is full.");
	                    } else {
	                        System.out.println("Stack is not full.");
	                    }
	                    break;
	                case 6:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}