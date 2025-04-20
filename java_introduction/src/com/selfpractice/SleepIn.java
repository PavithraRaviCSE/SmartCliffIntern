package com.selfpractice;

import java.util.Scanner;

public class SleepIn {
	
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter true if it is week end else enter false: ");
		boolean weekend = input.nextBoolean();
		System.out.println("enter true if it is vecation else enter false: ");
		boolean vecation = input.nextBoolean();
		if(weekend && vecation) 
		    System.out.println("true");
		else
		    System.out.println("false");
		
		input.close();
		
	}	

}
