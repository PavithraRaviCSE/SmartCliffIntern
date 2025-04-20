package com.selfpractice;

import java.util.Scanner;

public class ItemPrice {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int items = 15;
		System.out.print("Enter the selling price: ");
		int sprice = input.nextInt();
		System.out.print("Enter the profit: ");
		int profit = input.nextInt();
		
		int cost_price = (sprice - profit) / 15;
		
		System.out.print("the costprice of a item is: " + cost_price);
	}
}
