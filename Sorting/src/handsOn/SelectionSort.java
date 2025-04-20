/*
 * for each iteration we choose the smallest element in the unsorted array 
 * and swapped it into left side of the unsorted array.
 * time complexity On2, On2, On2;
 */

package handsOn;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String agrs[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = input.nextInt();

		System.out.println("Enter the array elements: ");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		SelectionSort(arr, n);

		System.out.print("sorted array: ");
		for (int c : arr) {
			System.out.print(c + " ");
		}

		input.close();
	}

	private static void SelectionSort(int[] arr, int n) {
		int j =  0;
		for(int i  = 0 ; i < n-1 ;  i ++) {
			
			int small = arr[i];
			int pos = i;
			for(j = i+1 ; j < n ; j ++) {
				if(arr[j] < small) {
					small = arr[j];
					pos = j;
				}
			}
			int temp = arr[i];
			arr[i] = small;
			arr[pos] = temp;
			
			System.out.println("Pass: " + i +"\n" + Arrays.toString(arr));
			
		}
		
	}
}

