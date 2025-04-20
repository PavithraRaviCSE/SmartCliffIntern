/*Initialize two integer variables ‘six’ and ‘four’ with the values as
the name says. Then, print the values of 'six' and 'four' to the
console.*/

package com.handson;
import java.util.Scanner;


public class UserInput2 {
	
		public static void main(String args[]) {
			
			int six,four;
			Scanner input=new Scanner(System.in);
			six = 6;
			four = 4;
			System.out.println("value of six:" + six);
			System.out.println("value of four:" + four);
			input.close();
			
		}

}


