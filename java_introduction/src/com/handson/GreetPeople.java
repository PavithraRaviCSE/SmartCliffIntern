/*Read a person's name first, read another person and another.
Greet the first person first, the third person second and the second
person last. If ‘Chloe’, ‘Joey’ & ‘Zoe’ are the inputs, then the
output will be ‘Welcome Chloe! Welcome Zoe! Welcome Joey too!’*/

package com.handson;

import java.util.Scanner;

public class GreetPeople {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter your name:");
		String person1 = input.nextLine();
		System.out.print("enter your name:");
		String person2 = input.nextLine();
		System.out.print("enter your name:");
		String person3 = input.nextLine();

		System.out.print("Welcome " + person1);
		System.out.print("! Welcome " + person3);
		System.out.print("! Welcome " + person2 + " too!");

		input.close();

	}
}
