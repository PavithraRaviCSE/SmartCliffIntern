package selfPractice;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String agrs[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = input.nextInt();

		System.out.println("Enter array elements: ");
		float arr[] = new float[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextFloat();
		}

//	16
//45.5 56.1 67.3 78.2 89.1 90.2 91.7 92.9 93.6 94.3 95.7 96.2 97.3 98.6 99.7 100
		System.out.println("Enter the search element: ");
		int k = input.nextInt();
		int index = binarySearch(arr, k, 0, n - 1);
//		System.out.println(index);
		if (index == -1) {
			System.out.print("Element is not present at index");

		} else
			System.out.print("element is present at the index: " + index);

		input.close();
	}

	private static int binarySearch(float[] arr, int k, int start, int end) {

		if (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] > k) {
				return binarySearch(arr, k, start, mid - 1);
			} else {
				return binarySearch(arr, k, mid + 1, end);
			}

		}

		return -1;
	}

}
