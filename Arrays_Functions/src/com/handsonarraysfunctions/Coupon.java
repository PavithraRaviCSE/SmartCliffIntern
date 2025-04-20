package com.handsonarraysfunctions;

import java.util.Scanner;

public class Coupon {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.println("Win cash price");
		System.out.print("Enter your coupon code:");
		int coupon = input.nextInt();
		int array1[] = {1,2,3,4,5,6,7};
		int array2[] = {8,9,10,11,12,13,14};
		getPrice(array1,array2, coupon);
	}
	static void getPrice(int array1[], int array2[], int coupon) {
		int flag = 0;
		loop1:
		{
		
		for(int i = 0;i< array1.length ;i++ ) {
			if(array1[i]==coupon)
			{
				flag = 1;
				break loop1;
			}
		}
		for(int i=0;i<array2.length ; i++ ) {
			if(array2[i]==coupon)
			{
				flag = 2;
				break ;
			}
		}
		}
		if(flag == 1)
			System.out.print(" Rs.10000 Cash Prize");
		else if(flag == 2)
			System.out.print("Tour Tickets for two days");
		else
			System.out.print("Better luck next time");
		
	}
}
