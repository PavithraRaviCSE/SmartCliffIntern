/*
 * Here we use the divide and conquire methodology
 * split the array and find the first element position in each array 
 * and place the element in its right position.
 * these position is called pivit position
 * Time complexity O(nlogn) , O(nlogn) , O(n^2)
 * 
 */

package handsOn;

import java.util.*;
import java.util.Scanner;

public class QuickSort {
	public static void main(String agrs[]) {
    HashMap<Integer,Integer> map = new HashMap<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = input.nextInt();

		System.out.println("Enter the array elements: ");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		quickSortInAscendingOrder(arr, 0, n - 1);
//		QuickSortDescending(arr, 0, n-1);

		System.out.print("sorted array: ");
		for (int c : arr) {
			System.out.print(c + " ");
		}

		input.close();
	}

	private static void QuickSortDescending(int[] arr, int i, int j) {
		if (i < j) {
			int position = partitionInDesc(arr, i, j);
			QuickSortDescending(arr, i, position - 1);
			QuickSortDescending(arr, position + 1, j);

		}
	}

	
	static int b[] = new int[10];

	private static int partitionInDesc(int[] arr, int start, int end) {

		int i = end-1;
		int j = start;
		int p_index = end;
		int pivote = arr[end];

		while (i >= j) {
			while (i >= j && arr[i] <= arr[p_index]) {

				i--;
			}

			while (j <= end && arr[j] > arr[p_index]) {
				j++;
			}
			
			if(i > j && arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		arr[end] = arr[j];
		arr[j] = pivote;
		b[j] = pivote;
		
		System.out.println("pivote position: " + j);
		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(b));
		return j;
	}
	
	static int a[] = new int[10];
	private static void quickSortInAscendingOrder(int[] arr, int i, int j) {

		if (i < j) {
			int position = partition(arr, i, j);
			quickSortInAscendingOrder(arr, i, position - 1);
			quickSortInAscendingOrder(arr, position + 1, j);

		}

	}
	private static int partition(int[] arr, int start, int end) {

		int i = start + 1;
		int j = end;
		int p_index = start;
		int pivote = arr[start];

		while (i <= j) {
			while (i <= j && arr[i] <= arr[p_index]) {

				i++;
			}

			while (j >= start && arr[j] > arr[p_index]) {
				
				j--;
			}
			
			if(i < j && arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		arr[start] = arr[j];
		arr[j] = pivote;
		a[j] = pivote;
		
		System.out.println("pivote position: " + j);
//		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(arr));
		return j;
	}
}
