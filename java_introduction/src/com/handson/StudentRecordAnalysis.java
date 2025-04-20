package com.handson;

import java.util.Scanner;

public class StudentRecordAnalysis {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int girls_like_Orange = 136;
		int girls_like_Mango = 240;
		int boys_like_Orange = 120;
		int boys_like_Mango = 243;
		System.out.println("Number of students like orange: " +  (girls_like_Orange + boys_like_Orange));
		System.out.println("Number of students like mango: " +  (girls_like_Mango + boys_like_Mango));
		System.out.println("Total Number of students : " + (girls_like_Orange + boys_like_Orange 
				+ girls_like_Mango + boys_like_Mango));
		
		int totalGirls = girls_like_Orange + girls_like_Mango;
		int totalBoys = boys_like_Orange + boys_like_Mango;
		//Determine whether the number of girls exceeds the
		//number of boys. State 'true' or 'false'.
		System.out.print("Number of girls exceeds the boys : ");
		if(totalGirls>totalBoys) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		input.close();
	}

}
