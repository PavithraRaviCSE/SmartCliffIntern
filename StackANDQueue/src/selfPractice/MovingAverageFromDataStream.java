package selfPractice;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream {
	private Queue<Integer> queue;
	private int maxSize;
	private double sum;

	public MovingAverageFromDataStream(int size) {
		this.queue = new LinkedList<>();
		this.maxSize = size;
		this.sum = 0;
	}

	public double next(int val) {
		if (queue.size() == maxSize) {
			sum -= queue.poll(); // Remove the oldest element from the queue
		}
		queue.offer(val);
		sum += val;
		return sum / queue.size();
	}

	public static void main(String args[]) {
		String[] commands = { "MovingAverage", "next", "next", "next", "next" };
		int[][] inputs = { { 3 }, { 1 }, { 10 }, { 3 }, { 5 } };

		// Processing the input
		MovingAverageFromDataStream m = null;
		for (int i = 0; i < commands.length; i++) {
			String command = commands[i];
			if (command.equals("MovingAverage")) {
				m = new MovingAverageFromDataStream(inputs[i][0]);
				System.out.println("null");
			} else if (command.equals("next")) {
				double result = m.next(inputs[i][0]);
				System.out.println(result);
			}
		}
	}
}
