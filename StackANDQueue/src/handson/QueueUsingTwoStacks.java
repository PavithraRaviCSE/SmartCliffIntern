package handson;

import java.util.Scanner;
import java.util.Stack;

import queuepackage.MyQueue;

public class QueueUsingTwoStacks {
    int queue[];
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    QueueUsingTwoStacks(int n) {
        queue = new int[n];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the queue: ");
        int n = input.nextInt();
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks(n);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to enqueue: ");
                    int element = input.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    int dequeuedElement = queue.dequeue();
                    if (dequeuedElement != -1) {
                        System.out.println("Dequeued element: " + dequeuedElement);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void enqueue(int n) {
        stack1.push(n);
    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int x = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return x;
    }
}
