/*Write a Java application that takes a duration in minutes as input
and calculates the equivalent duration in years and days.*/

package com.handson;

import java.util.Scanner;

public class EquivalentYearAndDays {
	public static void main(String args[]) {
			
			Scanner input=new Scanner(System.in);
			System.out.println("Enter Minutes: " );
			int minute = input.nextInt();
			float year = minute/525600;
			float days = minute/1440;
			System.out.println("year: " + year);
			System.out.println("number of days: " + days);
			
	}
}
