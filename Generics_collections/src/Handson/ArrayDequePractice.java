package Handson;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Random;

public class ArrayDequePractice {
	public static void main(String args[]) {
		
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		
		deque.add(12);
		deque.add(24);
		deque.add(45);
		deque.add(67);
		deque.add(87);
		deque.add(43);
		
		System.out.println("deque elements: " + deque);
		
		deque.addFirst(100);
		
		System.out.println("deque elements: " + deque);
		
		deque.addLast(200);
		
		System.out.println("deque elements: " + deque);
		
		System.out.println("Removing first element: " + deque.pollFirst());
		
		System.out.println("Removing last element element: " + deque.pollLast());
		
		System.out.println("retriving  first element : " + deque.peekFirst());
		
		System.out.println("retriving  last element : " + deque.peekLast());
		
		
		//rendom integer
		Random rand = new Random();
		Object[] arr = deque.toArray();
		int randIndex =  rand.nextInt(deque.size());
		System.out.println("rendom number: " + arr[randIndex]);
		
		
		
		System.out.println("deque elements: " + deque);
		
		//empty
		System.out.println("Is deque Empty: " + deque.isEmpty());

		System.out.println("Is deque Empty: " + deque.size());
		
		for (Iterator<Integer> itr = deque.iterator();
	             itr.hasNext();) {
	            System.out.print(itr.next() + " ");
	        }
		
		System.out.println();

		System.out.println("size: "+deque.size());
		deque.add(300);
		deque.add(400);
		deque.add(500);
		deque.add(600);
		deque.add(700);
		deque.add(800);
		
		System.out.println( "Size "+ deque.size());
		
		deque.clear();
		
		
	}
}
