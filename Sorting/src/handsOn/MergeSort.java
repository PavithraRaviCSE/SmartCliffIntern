/* split the array 
 * then join the element in new array by comparing the current elements in both the arrays
 * time complexity O(nlogn), O(nlogn), O(nlogn)
*/

package handsOn;

import java.util.*;

public class MergeSort {
	public static void main(String agrs[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = input.nextInt();

		System.out.println("Enter the array elements: ");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}

		mergeSort(arr, 0, n - 1);

		System.out.print("sorted array: ");
		for (int c : arr) {
			System.out.print(c + " ");
		}

		input.close();
	}

	private static void mergeSort(int[] arr, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2 ;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

//			System.out.println("i " + i + " j : "+ j );
//			System.out.println(Arrays.toString(arr));
			merge(arr, left, right, mid);
			System.out.println(Arrays.toString(arr));
		}

	}

	private static void merge(int[] arr, int left, int right, int mid) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		
		int n = 0 ;
		for(int i = 0 ; i < n1 ; i++) {
			leftArr[n++] = arr[left+i];
		}
		
		n = 0 ;
		for(int j = 0 ; j < n2 ; j++) {
			rightArr[n++] = arr[mid+1+j];
		}
		
		
		int i = 0, j = 0 , k = left;

		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k++] = leftArr[i];
				i++;
			} else {
				arr[k++] = rightArr[j];
				j++;
			}

		}

		while (i < n1) {
			arr[k++] = leftArr[i];
			i++;

		}

		while (j < n2) {
			arr[k++] = rightArr[j];
			j++;
		}
		
	}
}
