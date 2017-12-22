package dataStructurePractice;

import java.util.LinkedList;

public class LinkedListManipulate {
	private LinkedList llist = new LinkedList();

	public void push(Object v) {
		llist.addFirst(v);
	}

	public Object top() {
		return llist.getFirst();
	}

	public Object pop() {
		return llist.removeFirst();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("a");
		llist.add("b");
		llist.add("c");
		llist.addFirst("f");
		llist.addLast("l");
		System.out.println(llist);
		System.out.println(llist.getFirst());
		llist.subList(1, 3).clear();
		// sublist.clear() will do work on llist.
		System.out.println(llist);

		int f1 = llist.indexOf("f");
		int al1 = llist.lastIndexOf("a");
		System.out.println(f1);
		System.out.println(al1);

		llist.set(2, "d");
		System.out.println(llist);

		// a simple llist
		LinkedListManipulate stack = new LinkedListManipulate();
		for (int i = 0; i < 40; i++) {
			stack.push(i);
		}
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
