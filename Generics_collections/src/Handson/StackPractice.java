package Handson;

import java.util.Arrays;
import java.util.Stack;

public class StackPractice {
	
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<>();
		//adding elements
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Stack elements: " + stack);
		// pop element
		System.out.println("Stack elements removed: " + stack.pop());
		
		System.out.println("Stack elements: " + stack);
		//peek function
		System.out.println("Stack peek element: " + stack.peek());
		//search
		System.out.println("Stack searching 30 : " + stack.search(30));
		//size
		System.out.println("Stack size: " + stack.size());
		//empty
		System.out.println("Stack Empty: " + stack.empty());
		//capacity
		System.out.println("Stack capacity: " + stack.capacity());
		
		//iteration
		System.out.println("iterating using for each loop:");
		for(int c : stack) {
			System.out.print(c + " ");
		}
		System.out.println();
		Object[] obj = stack.toArray();
		System.out.println("Stack to array: " +  Arrays.toString(obj));
		
		stack.clear();
		System.out.println("clearing the stack : " + stack.empty());
		
		
		
		
		
		
	}
}
