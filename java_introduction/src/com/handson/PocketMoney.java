/*Anisha and Raja took their common pocket money to the market.
Anisha bought Apples and Raju bought Bananas. On their way
back they saw a Magic Money Vending Machine which gives the
triple of the money deposited. They both tried with all the balance
amount that they had. Now write a program to,
1. Print the amount, they spent together in the market
2. Print the final amount that they had when they reach
home
3. Print the amount they deposited in the magic machine
Inputs: Pocket money, Apple cost, Banana cost
*/

package com.handson;

import java.util.Scanner;

public class PocketMoney {
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your pocket money: ");
		int total_amount = input.nextInt();
		System.out.println("Emter the amount spend to buy apple: ");
		int spent = input.nextInt();
		System.out.println("Enter the amount spend to buy bananas:");
		spent += input.nextInt();
		
		int remaining = total_amount - spent;
		
		System.out.println("Total amount spend :" + spent);
		System.out.println("Total amount they bring back to the home :" + remaining * 3 );
		
	}
}
