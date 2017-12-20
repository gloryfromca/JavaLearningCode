package genericsPractice;

import java.util.ArrayList;

class pair<T> {
}

public class GenericsArray {

	public static void main(String[] args) {
		
		// Pair cannot be resolved to a type
		// Pair<String>[] table = new Pair<String>[10];

		// how to new a collections with element containing parameter
		ArrayList<pair<String>> objarray = new ArrayList<pair<String>>();
		System.out.println(objarray.getClass());
		
		objarray.add(new pair<String>());
		// The method add(pair<String>) in the type ArrayList<pair<String>> is not
		// applicable for the arguments (pair<Object>)
		//objarray.add(new pair<Object>());
	}

}
