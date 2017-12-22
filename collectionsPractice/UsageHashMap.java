package collectionsPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class UsageHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> nameMap = new HashMap<Integer, String>();
		nameMap.put(1, "1st");
		nameMap.put(2, "2nd");
		nameMap.put(3, "3rd");
		Collection<String> valueMap = nameMap.values();
		valueMap.remove("3rd");
		// convert Collection to List.
		List<String> valueList = new ArrayList<String>(valueMap);
		Iterator<String> valueIterator = valueList.iterator();
		while (valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}
	}

}
