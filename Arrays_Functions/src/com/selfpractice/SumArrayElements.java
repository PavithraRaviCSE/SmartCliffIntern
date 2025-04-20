package com.selfpractice;

import java.util.Scanner;

public class SumArrayElements {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elemens: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        for(int i= 0;i<size ; i++) {
        	arr[i] = input.nextInt();
        }
        sum(arr);
	}
	static void sum(int array[]) {
		int add = 0;
		for(int i= 0;i<array.length ; i++) {
        	add += array[i];
        	
        }
		System.out.print("total: "+ add);
	}
}
