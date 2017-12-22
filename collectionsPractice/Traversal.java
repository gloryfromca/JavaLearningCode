package collectionsPractice;

import java.util.Enumeration;
import java.util.Hashtable;

public class Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hastable = new Hashtable<Integer, String>();
		hastable.put(1, "a");
		hastable.put(2, "d");
		hastable.put(3, "c");
		Enumeration<Integer> keys = hastable.keys();
		while (keys.hasMoreElements()) {
			System.out.println(hastable.get(keys.nextElement()));
		}
	}

}
