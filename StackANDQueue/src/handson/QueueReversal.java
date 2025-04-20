package handson;

import queuepackage.MyQueue;
import java.util.Scanner;

public class QueueReversal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size and the elements of the queue: ");
		int n = input.nextInt();
		MyQueue queue = new MyQueue(n);
		
		for(int i = 0 ; i < n ; i++) {
			queue.enqueue(input.nextInt());
		}
		
		queue.display();
		queue.reveral();
		System.out.println("reversed queue: ");
		queue.display();
	}

}
