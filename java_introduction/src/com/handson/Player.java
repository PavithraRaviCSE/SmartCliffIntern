/*Create the variables for a player's name, age, height in cm, weight
in kg, rank, and mobile number, and assign the values of your choice. Display the player detail. (byte, short, int, double, String
datatypes can be used)*/

package com.handson;

public class Player {
	public static void main(String args[]) {
		
		String name;
		byte age;
		int rank;
		double height,weight;
		String mobile_number;
		
		name = "Rishi";
		age = 35;
		rank=256;
		height = 6.6;
		weight = 85;
		mobile_number="9786542313";
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.printf("Height:%.2fcm\n", height);
		System.out.printf("Weight: %.2fkg\n", weight);
		System.out.println("rank: " + rank);
		System.out.println("Mobile Number: " + mobile_number);
		
		
	}
}
