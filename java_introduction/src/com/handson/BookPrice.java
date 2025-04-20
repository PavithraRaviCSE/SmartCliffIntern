/*Declare a variable ‘bookPrice’ (Choose the right datatype). Assign
the value 150.50 to ‘bookPrice’. Print the price. Now, re-assign a
value to ‘bookPrice’ then print ‘bookPrice’.
*/

package com.handson;

import java.util.Scanner;

public class BookPrice {
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		float bookPrice=150.50f;
		System.out.print("Enter the Book price in Rs: ");
		bookPrice = input.nextFloat();
		System.out.print("Book price: Rs "+bookPrice);
		input.close();
	}
}
