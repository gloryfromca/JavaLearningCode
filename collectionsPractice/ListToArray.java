package collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("zhanghui".split(""));
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		// java.lang.ClassCastException
		// String[] array= (String[]) list.toArray();

		String[] array1 = list1.toArray(new String[0]);
		for (String e : array1) {
			System.out.println(e);
		}
	}

}
