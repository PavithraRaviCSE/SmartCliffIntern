package selfpractice;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueue2 {
	public static void main(String args[]) {
		PriorityQueue<Character>priorQueue = new PriorityQueue();
		priorQueue.add('a');
		priorQueue.add('b');
		priorQueue.add('c');
		priorQueue.add('d');
		
		System.out.println("queue : " + priorQueue);
		System.out.println("removed elements: " + priorQueue.peek());
		
		System.out.println("is empty: "  + priorQueue.isEmpty());
		System.out.println("Size: "  + priorQueue.size());
		
		priorQueue.clear();
		System.out.println("is empty: "  + priorQueue.isEmpty());
		
		
		
	}
}
