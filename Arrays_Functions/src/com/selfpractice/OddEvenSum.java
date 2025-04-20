package com.selfpractice;

import java.util.Scanner;

public class OddEvenSum {
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("odd and even number sum");
			System.out.println("Enter a positive number");
			int number = input.nextInt();
		}
		static void calculate(int number){
				
			
			int odd_sum = 0;
			int even_sum = 0;
			
			if(number<0) {
				System.out.print("Invalid Number");
			}
			else {
				for(int i=1 ; i<= number ; i++) {
					if(i % 2 == 0)
						even_sum += i;
					else
						odd_sum += i;
				}
				System.out.print("Odd sum : " + odd_sum + " Even sum : " + even_sum);
			}
		}
	}


