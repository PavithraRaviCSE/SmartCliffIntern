package Handson;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueuePractice {
	public static void main(String args[]) {
		PriorityQueue<Integer> priorQueue = new PriorityQueue<>();
		
		priorQueue.add(10);
		priorQueue.add(20);
		priorQueue.add(30);
		priorQueue.add(40);
		
		System.out.println("Queue elements: " + priorQueue);
		// pop element
		System.out.println("Queue elements removed: " + priorQueue.poll());
		
		System.out.println("Queue elements: " + priorQueue);
		//peek function
		System.out.println("Queue peek element: " + priorQueue.peek());
		//size
		System.out.println("Queue size: " + priorQueue.size());
		//empty
		System.out.println("Is Queue Empty: " + priorQueue.isEmpty());
		//capacity
//		System.out.println("Stack capacity: " + priorQueue.capacity());
		
		//iteration
		System.out.println("iterating using for each loop:");
		for(int c : priorQueue) {
			System.out.print(c + " ");
		}
		System.out.println();
		Object[] obj = priorQueue.toArray();
		System.out.println("Queue to array: " +  Arrays.toString(obj));
		
		priorQueue.clear();
		System.out.println("clearing the Queue : " + priorQueue.isEmpty());
		
		
	}
	
   

}
