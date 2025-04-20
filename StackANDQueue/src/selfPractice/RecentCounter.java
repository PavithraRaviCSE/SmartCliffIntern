package selfPractice;

import java.util.LinkedList;
import java.util.Queue;
import queuepackage.LinkedQueue;

public class RecentCounter {
	LinkedQueue queue;

	RecentCounter() {
		queue = new LinkedQueue();
	}

	public static void main(String args[]) {
		String[] commands = { "RecentCounter", "ping", "ping", "ping", "ping" };
		int[][] inputs = { {}, { 1 }, { 100 }, { 3001 }, { 3002 } };

		RecentCounter m = null;
		for (int i = 0; i < commands.length; i++) {
			String command = commands[i];
			if (command.equals("RecentCounter")) {
				m = new RecentCounter();
				System.out.println("null");
			} else if (command.equals("ping")) {
				int x = m.ping(inputs[i][0]);
				int result = ( x == 0) ? 0 : x;
				System.out.println(result);
			}
		}
	}

	public int ping(int n) {
		return queue.recentCall(n);
	}

}
