package stackpackage;

import java.util.*;

public class InfixToPostFixExpression {
	public static void main(String args[]) {
//		k+l-m*n+(o^p)*w/u/v*t+q
		Scanner input = new Scanner(System.in);
		System.out.println("Enter infix expression: ");
		String infix = input.next();

//		CharStack stack = new CharStack();
		Stack<Character> stack = new Stack<>();
		String postfix = "";
		for (char c : infix.toCharArray()) {
			if (Character.isAlphabetic(c)) {
				postfix += c;
				System.out.println("postfix: " + postfix);
			} 
			else if( c == '(') {
				stack.push(c);
			}
			else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					char ch = stack.pop();
					postfix += ch;
				}
				stack.pop();
			} 
			else {

				if (stack.isEmpty() || stack.peek() == '(') {
					stack.push(c);
				} else {

					if (c == '+' || c == '-') {

						while (!stack.isEmpty() && stack.peek() != '(') {
							char ch = stack.peek();
							if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {

								postfix += stack.pop();
							} else {
								break;
							}
						}
						stack.push(c);

					} else if (c == '*' || c == '/' || c == '^') {
						while (!stack.isEmpty() || stack.peek() != '(') {
							char ch = stack.peek();
							if (ch == '*' || ch == '/' || c == '^') {
								postfix += stack.pop();
							} else
								break;
						}
						stack.push(c);

					} else {
						break;
					}
				}
			}
		}

		while (!stack.isEmpty())

		{
			postfix += stack.pop();
		}

		System.out.println("Postfix expression: " + postfix);

		input.close();
	}
}
