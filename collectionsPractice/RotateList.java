package collectionsPractice;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class RotateList {

	public static void main(String[] args) {
		// don't need to add 'new' key word.
		List list= Arrays.asList("zhanghui is name".split(" "));
		Collections.rotate(list, 1);
		System.out.println(list);

	}

}
