package selfPractice;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	public static void main(String agrs[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = input.nextInt();

		System.out.println("Enter the array elements: ");
		float arr[] = new float[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextFloat();
		}

		quickSortInAscendingOrder(arr, 0, n - 1);
//		QuickSortDescending(arr, 0, n-1);

		System.out.print("sorted array: ");
		for (float c : arr) {
			System.out.print(c + " ");
		}

		input.close();
	}

	private static void quickSortDescending(float[] arr, int i, int j) {
		if (i < j) {
			int position = partitionInDesc(arr, i, j);
			quickSortDescending(arr, i, position - 1);
			quickSortDescending(arr, position + 1, j);

		}
	}

	
	static float b[] = new float[10];

	private static int partitionInDesc(float[] arr, int start, int end) {

		int i = end-1;
		int j = start;
		int p_index = end;
		float pivote = arr[end];

		while (i >= j) {
			while (i >= j && arr[i] <= arr[p_index]) {

				i--;
			}

			while (j <= end && arr[j] > arr[p_index]) {
				j++;
			}
			
			if(i > j && arr[i] > arr[j]) {
				float temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		arr[end] = arr[j];
		arr[j] = pivote;
		b[j] = pivote;
		
		System.out.println("pivote position: " + j);
//		System.out.println(Arrays.toString(arr));
		return j;
	}
	
	static float a[] = new float[10];
	private static void quickSortInAscendingOrder(float[] arr, int i, int j) {

		if (i < j) {
			int position = partition(arr, i, j);
			quickSortInAscendingOrder(arr, i, position - 1);
			quickSortInAscendingOrder(arr, position + 1, j);

		}

	}
	private static int partition(float[] arr, int start, int end) {

		int i = start + 1;
		int j = end;
		int p_index = start;
		float pivote = arr[start];

		while (i <= j) {
			while (i <= j && arr[i] <= arr[p_index]) {

				i++;
			}

			while (j >= start && arr[j] > arr[p_index]) {
				
				j--;
			}
			
			if(i < j && arr[i] > arr[j]) {
				float temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		arr[start] = arr[j];
		arr[j] = pivote;
		a[j] = pivote;
		
		System.out.println("pivote position: " + j);
//		System.out.println(Arrays.toString(arr));
		return j;
	}
}
