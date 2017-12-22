package dataStructurePractice;

import java.util.LinkedList;
import java.util.Queue;

public class UsageQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		queue.offer("zhang");
		queue.offer("hui");
		queue.offer("is");
		queue.offer("my");
		queue.offer("name");
		for (String e : queue) {
			System.out.println(e);
		}
		System.out.println("======");
		System.out.println("poll:" + queue.poll());
		for (String e : queue) {
			System.out.println(e);
		}
		System.out.println("======");
		System.out.println("element:" + queue.element());

		for (String e : queue) {
			System.out.println(e);
		}
		System.out.println("======");
		System.out.println("peek:" + queue.peek());

		for (String e : queue) {
			System.out.println(e);
		}
		System.out.println("======");

	}

}
