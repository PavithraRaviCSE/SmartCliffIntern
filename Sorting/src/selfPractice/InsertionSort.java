package selfPractice;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String agrs[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = input.nextInt();

		System.out.println("Enter the array elements: ");
		float arr[] = new float[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextFloat();
		}

		insertionSort(arr, n);
//9
//25.3 33.1 64.8 12.4 45.2 29.9 85.6 41.3 56.7
		System.out.print("sorted array: ");
		for (float c : arr) {
			System.out.print(c + " ");
		}

		input.close();
	}

	private static void insertionSort(float[] arr, int n) {

		float temp = 0;
		for (int i = 1; i < n; i++) {
			
			temp = arr[i];
			int j = i - 1;

			while (j >= 0) {
				if (arr[j] > temp) {
					arr[j + 1] = arr[j];
					
				}
				else {
					break;
				}
				j--;
			}
			arr[j + 1] = temp;
			System.out.println("Pass: " + i +"\n" + Arrays.toString(arr));
			
			
		}
	}

}



