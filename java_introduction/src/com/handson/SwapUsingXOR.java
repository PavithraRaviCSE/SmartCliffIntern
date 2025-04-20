//swap using XOR operator

package com.handson;

import java.util.Scanner;

public class SwapUsingXOR {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Swapping");
		
		System.out.println("Enter the value of a: ");
		int number1 =input.nextInt();
		
		System.out.print("Enter the value of b: ");
		int number2 =input.nextInt();
		
		number1 = number1 ^ number2;
		number2 = number1 ^ number2;
		number1 = number1 ^ number2;
		

		System.out.print("the value of a and b after swapping is " + number1 + " and " + number2);
		
		input.close();
	}

}
