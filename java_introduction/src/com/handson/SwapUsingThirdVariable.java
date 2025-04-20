//swap using third variable

package com.handson;

import java.util.Scanner;

public class SwapUsingThirdVariable {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Swapping");
		
		System.out.println("Enter the value of a: ");
		int number1 =input.nextInt();
		
		System.out.print("Enter the value of b: ");
		int number2 =input.nextInt();
		
		int temp = number1;
		number1 = number2;
		number2=temp;
		
		System.out.print("the value of a and b after swapping is " + number1 + " and " + number2);
		
		input.close();

		
	}
}
