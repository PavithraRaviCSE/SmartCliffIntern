/*Initialize an integer variable ‘number’ with the value 100. Then
print the value of ‘number’ to the console.*/

package com.handson;
import java.util.Scanner;

public class UserInput {
	
	public static void main(String args[]) {
		
		int number = 100;
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number: ");
		number = input.nextInt();
		System.out.println(number);
		input.close();
	}

}
