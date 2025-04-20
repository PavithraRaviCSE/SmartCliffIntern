package selfPractice;

import java.util.Scanner;
import java.util.Stack;

public class paranthesisCheaker {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();

		System.out.println("Enter the input: ");
		String s = input.next();

		int count = 0;
		int max = 0;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(c);
				count ++;
			} else if (c == ')') {
				if (stack.isEmpty()) {
					System.out.println("Invalid input");
					break;
				}
				max = Math.max(max,stack.size());
				stack.pop();
			}
		}
		

		System.out.println("max nexted peranthesis: " + max);
	}
}
