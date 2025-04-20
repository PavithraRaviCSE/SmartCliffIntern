package com.handsonarraysfunctions;

import java.util.Scanner;

public class ArrayPalindrome {
        public static void main(String args[]) {
    		Scanner input =new Scanner(System.in);
    		System.out.println("Check palindromic array");
    		System.out.print("Enter no of elements:");
    		int size = input.nextInt();
    		int array[] = new int[size];
    		System.out.print("Enter the elements:");
    		for(int i = 0 ; i < size ; i ++)
    		    array[i] = input.nextInt();
        boolean isPalindromic = checkPalindromic(array);
        System.out.println("is palindromic array: " + isPalindromic);
    }

    static boolean checkPalindromic(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
