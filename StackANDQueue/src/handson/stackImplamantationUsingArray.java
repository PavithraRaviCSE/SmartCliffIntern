package handson;

import stackpackage.MyStack;

public class stackImplamantationUsingArray {
	public static void main(String args[]) {
		MyStack stack = new MyStack(10);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		stack.display();
		
		stack.pop();
		stack.display();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.display();
		System.out.println(stack.peek());
	}
}
