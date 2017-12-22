package collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionReadOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = new ArrayList<String>(Arrays.asList(new String[] { "a", "b" }));
		stringList = Collections.unmodifiableList(stringList);
		try {
			stringList.set(0, "first");
		} catch (UnsupportedOperationException e) {
			System.err.println("ReadOnly");
		}
		Set<String> set = new HashSet<String>(stringList);
		set = Collections.unmodifiableSet(set);
		Map<String, String> map = new HashMap<String, String>();
		map = Collections.unmodifiableMap(map);

	}

}
