package arrayPractice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		/*
		 * Array of String is defined by String []; you can set length in [] when
		 * variable declaration; ArrayList of String is defined by ArrayList<String>;
		 * ArrayLists is Array with unfixed length, which can double its capacity
		 * automatically when there is lack of space.
		 */
		char[] tem = "abcdef".toCharArray();
		for (char x : tem) {
			// arrayList.add((String) x); can't cast from char to String
			arrayList.add(String.valueOf(x));
		}
		System.out.print(arrayList.toString() + "\n");
		// \n or %n all OK
		Collections.reverse(arrayList);
		System.out.print(arrayList.toString());
	}

}
