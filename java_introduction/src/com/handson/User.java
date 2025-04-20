/*Declare three integer variables named 'hundred', 'twoHundred',
and 'threeHundred', and initialize them with the values 10, 2000,
and -30000 respectively. Then, reassign them with the
corresponding number names. Finally, print the values of all three
variables.*/

package com.handson;

import java.util.Scanner;

public class User {
	
public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		int hundred=10;
		int twoHundred=2000;
		int threeHundred=-30000;
		hundred = 100;
		twoHundred = 200;
		threeHundred = 300;
		System.out.println(hundred);
		System.out.println(twoHundred);
		System.out.println(threeHundred);
		
		input.close();
	}
}
