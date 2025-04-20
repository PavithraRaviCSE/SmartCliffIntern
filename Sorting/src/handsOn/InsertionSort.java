/* for each iteration the current element in the in sorted array is moved 
 * to its position in the shorted array 
 * by swapping the elements to the right of their current position. 
 * Time complexity O(n), O(nlogn), O(nlogn).
*/
package handsOn;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String agrs[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = input.nextInt();

		System.out.println("Enter the array elements: ");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		insertionSort(arr, n);

		System.out.print("sorted array: ");
		for (int c : arr) {
			System.out.print(c + " ");
		}

		input.close();
	}

	private static void insertionSort(int[] arr, int n) {

		int temp = 0;
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


