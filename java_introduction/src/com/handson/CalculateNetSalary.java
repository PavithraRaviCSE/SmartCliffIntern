/*Write a Java program to calculate Net Salary. User must input
Basic Salary and Output should be net salary calculated based on
following allowances:
Allowances:
DA = 70% of Basic Salary
HRA = 7% of Basic Salary
MA = 2% of Basic Salary
TA = 4% of Basic Salary
Deduction:
PF = 12% of Basic Salary
Income/professional tax = User Input (e.g., 500)
Net Salary = Basic Salary + Allowances – Deduction*/

package com.handson;

import java.util.Scanner;

public class CalculateNetSalary {

	public static void main(String args[]) {
			
			Scanner input=new Scanner(System.in);
			System.out.println("Enter basic pay: " );
			int basic_pay = input.nextInt();
			
			//ALLOWENCE CALULATION
			float DA = (70 * basic_pay) / 100;
			float HRA = (7 * basic_pay) / 100;
		    float MA = (2 * basic_pay) / 100;
			float TA = (4 * basic_pay) / 100;
			float allowance = DA + HRA + MA+ TA;
			
			//DETUCTION
			float PF = (12 * basic_pay) / 100;
			System.out.println("Enter income tax: " );
			
			float income = input.nextInt();
			float deduction = PF + income;
			
			//net salary
			float net_salary = basic_pay +  allowance - deduction;
			 
			System.out.print("net salary : " + net_salary);
			
			input.close();
	}
}
