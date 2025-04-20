package Handson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PracticeQueue {
	public static void main(String args[]) {
		PriorityQueue<Integer> priorQueue = new PriorityQueue<>(new TestComparator());
		
		priorQueue.add(10);
		priorQueue.add(20);
		priorQueue.add(45);
		priorQueue.add(30);
		priorQueue.add(40);
		priorQueue.add(35);
		
		System.out.println("Queue elements: " + priorQueue);
		// pop element
		System.out.println("Queue elements removed: " + priorQueue.remove());
		
		System.out.println("Queue elements: " + priorQueue);
		//peek function
		System.out.println("Queue peek element: " + priorQueue.peek());
		//size
		System.out.println("Queue size: " + priorQueue.size());
		//empty
		System.out.println("Is Queue Empty: " + priorQueue.isEmpty());
		
//		Comparator<Integer> customComparator = new TestComparator();
//        System.out.println("Comparator result: " + customComparator.compare(priorQueue));
		//iterating
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
class TestComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		  
			return o2 - o1;  
 

	}
	
}
