package dataStructurePractice;

import java.util.Collections;
import java.util.Vector;

public class SortAndGetIndex {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("x");
		// Vector.add() will add the element to the last of Vector.
		v.add("e");
		v.add("d");
		v.add("a");
		Collections.sort(v);
		System.out.println(v);
		int index = Collections.binarySearch(v, "x");
		System.out.println("index of 'x':" + index);

	}
}
