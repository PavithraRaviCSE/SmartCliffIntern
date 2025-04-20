package handson;

import java.util.Scanner;

import stackpackage.MyStack;

public class SpecialStack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size and the element of the stack: ");
		int n = input.nextInt();
		MyStack stack= new MyStack(n);

		for (int i = 0; i < n; i++) {
			stack.push(input.nextInt());
		}

		int min = stack.getMin();
		System.out.println(min);
	}
}
