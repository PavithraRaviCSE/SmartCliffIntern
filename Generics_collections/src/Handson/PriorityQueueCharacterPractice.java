package Handson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCharacterPractice {
	
	public static void main(String args[]) {
		
//		PriorityQueue<Character> charQueue = new PriorityQueue<>(new Test());
		PriorityQueue<Character> charQueue = new PriorityQueue<>(new Test());
		
		charQueue.add('a');
		charQueue.add('b');
		charQueue.add('c');
		charQueue.add('d');
		charQueue.add('e');
		
		System.out.println("Queue elements: " + charQueue);
		// pop element
		System.out.println("Queue elements removed: " + charQueue.poll());
		
		System.out.println("Queue elements: " + charQueue);
		//peek function
		System.out.println("Queue peek element: " + charQueue.peek());
		//size
		System.out.println("Queue size: " + charQueue.size());
		//empty
		System.out.println("Is Queue Empty: " + charQueue.isEmpty());
		
		System.out.println("iterating using for each loop:");
		for(int c : charQueue) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		System.out.println("Empty the queue:");
		while(!charQueue.isEmpty()){
			System.out.print(charQueue.poll() + " ");
		}
		Object[] obj = charQueue.toArray();
		System.out.println("Queue to array: " +  Arrays.toString(obj));
		
		charQueue.clear();
		System.out.println("clearing the Queue : " + charQueue.isEmpty());
		
	}

static class Test implements Comparator<Character>{
	public int compare(Character a,Character b) {
		 return a.compareTo(b);
         
	}
}
}
