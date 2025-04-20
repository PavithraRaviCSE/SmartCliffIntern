package handson;

import java.util.Scanner;
import java.util.Stack;

public class BackspaceStringCompare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string s and t: ");
		String s = input.next();
		String t = input.next();

		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '#') {
				stack1.pop();
			} else
				stack1.push(c);
		}
		for (char c : t.toCharArray()) {
			if (c == '#') {
				stack2.pop();
			} else
				stack2.push(c);
		}

		String str1 = "";
		String str2 = "";
		while (!stack1.isEmpty()) {

			str1 = stack1.pop() + str1;
		}
		while (!stack2.isEmpty()) {
			str2 = stack2.pop() + str2;
		}


		if (str1.equals(str2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
