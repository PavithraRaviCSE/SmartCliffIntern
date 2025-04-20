// for each iteration choose swap the larger element to the end of the unsorted array

package handsOn;

import java.util.*;
public class BubbleSort {
	public static void main(String agrs[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = input.nextInt();
		
		System.out.println("Enter the array elements: ");
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = input.nextInt();
		}
		
		bubbleSortAscending(arr, n);
		
		System.out.print("sorted array: ");
		for(int  c : arr) {
			System.out.print(c + " ");
		}
		
		input.close();
	}

	private static void bubbleSortDescending(int[] arr, int n) {
		int temp = 0;
		boolean flag;
		
		for(int i = 0 ; i < n - 1 ; i++) {
			flag = true;
			for(int j = 0 ; j < n-i-1 ; j++) {
				if(arr[j] < arr[j + 1]) {
					flag = false;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
	
			System.out.println("Pass: " + i +"\n" + Arrays.toString(arr));
			if(flag) {
				break;
			}
			
		}
		
		
	}

	private static void bubbleSortAscending(int[] arr, int n) {
		
		int temp = 0;
		boolean flag;
		
		for(int i = 0 ; i < n - 1 ; i++) {
			flag = true;
			for(int j = 0 ; j < n-i-1 ; j++) {
				if(arr[j] > arr[j + 1]) {
					flag = false;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
	
			System.out.println("Pass: " + i +"\n" + Arrays.toString(arr));
			if(flag) {
				break;
			}
			
		}
		
		
	}
	
}
