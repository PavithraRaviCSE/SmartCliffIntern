/*Write a Java program to accept 3 sides of triangle from user and
print area of triangle as an output. (Library method can be used
to find the square root)*/

package com.handson;

import java.util.Scanner;

public class TriangleArea {
	public static void main(String args[]) {
		
		Scanner input=new Scanner(System.in);
		float side1, side2, side3;
		double semiPerimeter;
		double area;
		System.out.println("Find Area Of triangle ");
		
		System.out.print("Enter side 1: ");
		side1 =input.nextInt();
		
		System.out.print("Enter side 2: ");
		side2 =input.nextInt();
		
		System.out.print("Enter side 3: ");
		side3 =input.nextInt();
		
		semiPerimeter = (side1 + side2 + side3)/2;
		
		area=semiPerimeter  * (semiPerimeter-side1) * 
			(semiPerimeter-side2) * (semiPerimeter-side3);
		
		System.out.printf("Area of the triangle is: %.2f", area);
		
		input.close();
		
	}

}
