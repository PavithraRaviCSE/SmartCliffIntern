package selfPractice;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String agrs[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = input.nextInt();

		System.out.println("Enter array elements: ");
		float arr[] = new float[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextFloat();
		}
//		16
//		45.5 56.1 67.3 78.2 89.1 90.2 91.7 92.9 93.6 94.3 95.7 96.2 97.3 98.6 99.7 100
		System.out.println("Enter the search element: ");
		int k = input.nextInt();
		int index = linearSearch(arr, k, n);
		if (index == -1) {
			System.out.print("Element is not present at index");

		} else
			System.out.print("element is present at the index: " + index);

		input.close();
	}

	private static int linearSearch(float[] arr, int k, int n) {

		for (int i = 0; i < n; i++) {
			if (arr[i] == k) {
				return i;
			}
			else if(arr[i] > k) {
				return -1;
			}
		}
		return -1;
	}
}
