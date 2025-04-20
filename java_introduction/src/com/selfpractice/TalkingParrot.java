package com.selfpractice;

import java.util.Scanner;

public class TalkingParrot {
	public static void main(String args[]) {

		Scanner input =new Scanner(System.in);
		System.out.print("Enter the hours brtween 0 and 23:");
		int hours = input.nextInt();
		System.out.print("Enter true if parrot is talking else false:");
		boolean talking = input.nextBoolean();
		System.out.println("trouble : " + ((hours<=6 || hours>=20) && talking));
		
		input.close();
	
	}

}
