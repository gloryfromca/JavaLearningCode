package collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IndexOfSubList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");

		List<String> allList = Arrays.asList("zhanghui".split(""));
		List<String> SubList = Arrays.asList("gh".split(""));
		System.out.println(Collections.lastIndexOfSubList(allList, SubList));
		System.out.println(Collections.indexOfSubList(allList, SubList));

	}

}
