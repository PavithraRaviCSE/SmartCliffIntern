package arrayList;

public class MyArrayList {
	private int[] list;
	private int size;
	private int capacity;

	public MyArrayList(int n) {
		capacity = n;
		list = new int[n];
		size = 0;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return size;
	}

	public int capacity() {
		return capacity;
	}

	public void createArrayList(int arr[]) {
		int n = arr.length;
		if (n > capacity) {
			System.out.println("The length of the array is empty");
		} else {
			for (int i = 0; i < n; i++) {
				list[i] = arr[i];
			}

			size = n;
		}

	}

	public void insertAtBeginning(int num) {
		if (size == capacity) {
			System.out.println("Array is full");
		} else {
			for (int i = size; i > 0; i--) {
				list[i] = list[i - 1];
			}

			list[0] = num;
			size++;
		}
	}

	public void insertAtEnd(int num) {
		if (size == capacity) {
			System.out.println("Array is full");
		} else {
			list[size] = num;
			size++;
		}
	}

	public void insertAtSpecificIndex(int index, int num) {
		if (index >= capacity || index < 0 || index > size-1) {
			System.out.println("Invalid index");
			
		}
		else if(size == capacity) {
			System.out.println("List is full");
		}
		else if (index == 0) {
			insertAtBeginning(num);
		} else if (index == size-1) {
			insertAtEnd(num);
		} else {
			
			int i = 0;
			for (i = size; i > index; i--) {
				list[i] = list[i - 1];
			}

			list[i] = num;
			size++;
		}

	}

	public void deleteAtBeginning() {
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			for (int i = 0; i < size - 1; i++) {
				list[i] = list[i + 1];
			}
			size--;
		}
	}

	public void deleteAtEnd() {
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			size--;
		}
	}

	public void deleteAtIndex(int index) {
		if (index > size - 1 || index < 0) {
			System.out.println("Invalid index");
			return;
		}
		if (index == 0) {
			deleteAtBeginning();
		} else if (index == size - 1) {
			deleteAtEnd();
		} else {

			for (int i = index; i < size - 1; i++) {
				list[i] = list[i + 1];
			}

			size--;
		}

	}

	public int indexOf(int num) {
		for (int i = 0; i < size; i++) {
			if (list[i] == num) {
				return i;
			}
		}

		return -1;
	}

	public void display() {
		if (size == 0) {
			System.out.println("list is empty");
		}

		else {
			for (int i = 0; i < size; i++)
				System.out.print(list[i] + " ");

			System.out.println();
		}

	}

	public void clear() {
		size = 0;
//		Arrays.fill(list,0);
	}

}
