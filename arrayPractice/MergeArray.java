package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str1 = { "a", "b", "c", "d" };
		String[] str2 = { "a", "e", "z", "g" };

		/*
		 * List list = Arrays.asList(str1); cannot convert from List<String> to List;
		 * error reason:List from a wrong package
		 */

		/*
		 * List<String> list = Arrays.asList(str1); List<String> list1 =
		 * Arrays.asList(str2); It takes an array ia and creates a wrapper that
		 * implements List<Integer>, which makes the original array available as a list.
		 * list.addAll(list1); list UnsupportedOperationException
		 */

		List<String> list = new ArrayList(Arrays.asList(str1));
		list.addAll(new ArrayList(Arrays.asList(str2)));
		System.out.println(list.toString());

	}

}
