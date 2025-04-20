/*A factory-manufactured LED bulbs on the first day. On the second
day, it made CFL bulbs. How many bulbs did the factory make
altogether? Counts are the input*/

package com.handson;

import java.util.Scanner;

public class CountBulbs {
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		int count=0;
		System.out.println("enter the no of bulbs manufactured in first day: ");
		count += input.nextInt();
		System.out.println("enter the no of bulbs manufactured in second day: ");
		count += input.nextInt();
		System.out.println("The total no of bulbs manufactured in twodays are: " + count);
	}
}
