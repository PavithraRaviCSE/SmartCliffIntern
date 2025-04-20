package com.selfpractice;
import java.util.Scanner;
public class NetSalaryCalculator {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Basic Salary:");
        double basicSalary = input.nextDouble();

        System.out.println("Enter the Income/Professional Tax:");
        double tax = input.nextDouble();
        
        netSalary(basicSalary, tax);
	}
	static void netSalary(double basicSalary, double tax)
	{
        double da = 0.70 * basicSalary;
        double hra = 0.07 * basicSalary;
        double ma = 0.02 * basicSalary;
        double ta = 0.04 * basicSalary;

        double pf = 0.12 * basicSalary;
     
        double netSalary = basicSalary + da + hra + ma + ta - pf - tax;

        System.out.println("Net Salary: " + netSalary);
    }
}

