package selfpractice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class ArrayDequePractice {
	public static void main(String args[]) {
		ArrayDeque<Character> deque = new ArrayDeque();
		deque.add('a');
		deque.add('b');
		deque.add('c');
		deque.add('d');
		deque.add('e');
		deque.add('f');
		
		deque.addFirst('x');
		deque.addLast('y');
		
		System.out.println("Removing first Element: " + deque.removeFirst());
		System.out.println("Removing last Element: " + deque.removeLast());
		System.out.println("Retrive first Element: " + deque.peekFirst());
		System.out.println("Retrive last Element: " + deque.peekLast());
		
		Random rand = new Random();
		Object obj[] = deque.toArray();
		int x = rand.nextInt(deque.size());
		
		System.out.println("random element: " + obj[x]);
		System.out.println("is empty: " + deque.isEmpty());
		System.out.println("size: " + deque.size());
		
		deque.add('g');
		deque.add('g');
		deque.add('g');
		deque.add('g');
		
		deque.remove();
		deque.remove();
		
		System.out.println(deque);
		
		Iterator<Character> ite = deque.descendingIterator();
		while (ite.hasNext()) {
			System.out.print(ite.next() + " ");
		}
		
		Object[] obj1 = deque.toArray();
		System.out.println("Array: " + Arrays.toString(obj1));
		
		deque.clear();
		
		System.out.println(deque.isEmpty());
	}
}
