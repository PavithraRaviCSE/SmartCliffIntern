package selfPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String agrs[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = input.nextInt();

		System.out.println("Enter the array elements: ");
		float arr[] = new float[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextFloat();
		}

		selectionSort(arr, n);

		System.out.print("sorted array: ");
		for (float c : arr) {
			System.out.print(c + " ");
		}

		input.close();
	}

	private static void selectionSort(float[] arr, int n) {
		int j =  0;
		for(int i  = 0 ; i < n-1 ;  i ++) {
			
			float small = arr[i];
			int pos = i;
			for(j = i+1 ; j < n ; j ++) {
				if(arr[j] < small) {
					small = arr[j];
					pos = j;
				}
			}
			float temp = arr[i];
			arr[i] = small;
			arr[pos] = temp;
			
			System.out.println("Pass: " + i +"\n" + Arrays.toString(arr));
			
		}
		
	}
}

