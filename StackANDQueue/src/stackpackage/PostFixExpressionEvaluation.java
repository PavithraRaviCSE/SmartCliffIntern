package stackpackage;

import java.util.Scanner;

public class PostFixExpressionEvaluation {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter postfix expression: ");
		String postfix[] = input.nextLine().split(" ");
//
//		for(String c : postfix) {
//			System.out.println(c);
//		}
		LinkedStack stack = new LinkedStack();

		for (String c : postfix) {

			if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
				if (stack.isEmpty()) {
					System.out.println("Ivalid input ");
					break;
				}
				int a = stack.pop();
				if (stack.isEmpty()) {
					System.out.println("Ivalid input ");
					break;
				}
				int b = stack.pop();
				int num = 0;
				switch (c) {
				case "+":
					num = b + a;
					break;
				case "-":
					num = b - a;
					break;
				case "*":
					num = b * a;
					break;
				case "/":
					num = b / a;
					break;
				default:
					System.out.println("Invalid input ");
					break;
				}
				stack.push(num);
			} else {
				int num = Integer.parseInt(c);
				stack.push(num);
			}
		}
		if(stack.isEmpty()) {
			System.out.println("false expression");
		}
		System.out.println(stack.pop());
		input.close();
	}
}