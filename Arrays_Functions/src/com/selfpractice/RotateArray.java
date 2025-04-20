package com.selfpractice;

import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = input.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter the array elements:");
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		
		System.out.println("Enter the rotate:");
		int rotate=input.nextInt();
		
		rotateArray(size, array,rotate);
		input.close();
		}
		
	static void rotateArray(int size, int array[],int rotate) {
		
		int arr[]=new int[size];
		int j=0;
		
		for (int i = rotate; i < size; i++) {
		arr[j]=array[i];
		j++;
		}
		
		for (int i = 0; i < rotate; i++) {
		arr[j]=array[i];
		j++;
		}
		
		System.out.println("output");

		for (int i = 0; i < size; i++) {
		System.out.print(arr[i]+" ");
		}
		}
		
}
