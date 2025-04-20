package stackpackage;

public class MyStack {

	private int capacity;
	private int top;
	private int size;
	private int stack[];

	public MyStack(int capacity) {
		this.capacity = capacity;
		top = -1;
		stack = new int[capacity];
	}

	public void push(int num) {
		if (isFull()) {
			System.out.println("Stack is full");
			return;
		}

		stack[++top] = num;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int n = stack[top];
		top--;
		return n;
	}

	public int peek() {
		if (isEmpty()) {
//			System.out.println("Stack is empty");
			return -1;
		}
		return stack[top];

	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}

		for (int i = top; i >= 0; i--) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == capacity - 1);
	}
	
	public int size() {
		if(top == -1)
		return 0;
		
		return top;
	}

	public int getMin() {
		if(isEmpty()) {
			return 0;
		}
		int min = stack[0];
		for(int i = 1 ; i <= size() ; i++) {
			min = Math.min(min, stack[i]);
		}
		
		return min;
		
	}
}
