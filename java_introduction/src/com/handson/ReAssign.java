/*Declare four variables numberOne, numberTwo, numberThree,
and numberFour of integer type. Assign the values of your choice
for the variables numberOne, numberTwo and numberThree.
Assign 1000 to numberFour. Print the values. Now re-assign the
values as follows to print,
1. numberOne’s value to numberTwo
2. numberTwo’s value to numberThree
3. numberThree’s value to numberFour
4. 100 to numberOne
*/

package com.handson;

import java.util.Scanner;

public class ReAssign {
	
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		
		int numberOne;
		int numberTwo;
		int numberThree;
		int numberFour;
		
		numberOne = 3;
		numberTwo = 5;
		numberThree = 4;
		numberFour = 1000;
		
		System.out.println("numberOne: " + numberOne );
		System.out.println("numberTwo: " + numberTwo);
		System.out.println("numberThree: " + numberThree);
		System.out.println("numberFour: " + numberFour);
		
		numberFour = numberThree;
		numberThree = numberTwo;
		numberTwo = numberOne;	
	    numberOne = 100;
		
	    System.out.println("numberOne: " + numberOne );
		System.out.println("numberTwo: " + numberTwo);
		System.out.println("numberThree: " + numberThree);
		System.out.println("numberFour: " + numberFour);
	}
}
