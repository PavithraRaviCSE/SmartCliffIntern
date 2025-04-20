package selfPractice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortfloat {
	public static void main(String agrs[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = input.nextInt();

		System.out.println("Enter the array elements: ");
		float arr[] = new float[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextFloat();
		}
//		25.3 33.1 64.8 12.4 45.2 29.9 85.6 41.3 56.7
//		bubbleSortAscending(arr, n);
		bubbleSortDescending(arr, n);

		System.out.print("sorted array: ");
		for (float c : arr) {
			System.out.print(c + " ");
		}

		input.close();
	}

	private static void bubbleSortDescending(float[] arr, int n) {
		float temp = 0;
		boolean flag;

		for (int i = 0; i < n - 1; i++) {
			flag = true;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					flag = false;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

//			System.out.println("Pass: " + i + "\n" + Arrays.toString(arr));
			if (flag) {
				break;
			}

		}

	}

	private static void bubbleSortAscending(float[] arr, int n) {

		float temp = 0;
		boolean flag;

		for (int i = 0; i < n - 1; i++) {
			flag = true;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					flag = false;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			System.out.println("Pass: " + i + "\n" + Arrays.toString(arr));
			if (flag) {
				break;
			}

		}

	}

}
