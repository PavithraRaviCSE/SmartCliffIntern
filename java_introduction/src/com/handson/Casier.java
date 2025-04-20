/*A cashier in a shop has currency notes of denominations 10,50
and 100. If the amount to be returned is the input, find the total
number of currency notes of each denomination that the cashier
should give to the customer. Write a program to accomplish the
above task. Assume that the input is in 10’s multiples.
*/

package com.handson;

import java.util.Scanner;

public class Casier {
	public static void main(String args[]) {
			
			Scanner input=new Scanner(System.in);
			
			System.out.println("enter the amount: ");
			int amount = input.nextInt();
			int no_of_hundred = amount / 100;
			amount = amount % 100;
			int no_of_50 = amount / 50;
			amount = amount % 50;
			int no_of_10 = amount / 10;
			
			System.out.println("no to hundred's: "  + no_of_hundred);
			System.out.println("no to fifty's: "  + no_of_50);
			System.out.println("no to ten's: "  + no_of_10);
	}

}
