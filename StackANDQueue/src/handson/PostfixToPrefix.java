package handson;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToPrefix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("ENTER THE POSTFIX EXPRESSION: ");
		String s = input.next();

		Stack<String> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				stack.push(c + "");
			} else {
				String s1 = stack.pop();
				String s2 = stack.pop();

				String temp = c + s2 + s1;

				stack.push(temp);
			}
		}

		System.out.println(stack.peek());
		input.close();
	}

}
