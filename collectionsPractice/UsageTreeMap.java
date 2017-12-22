package collectionsPractice;

import java.util.TreeMap;

public class UsageTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(1, "zhang");
		tMap.put(2, "jiang");
		tMap.put(1, "wu");
		System.out.println("TreeMapKeySet:" + tMap.keySet());
		System.out.println("TreeMapValues:" + tMap.values());
		tMap.remove(tMap.firstKey());
		System.out.println("TreeMapValues:" + tMap.values());
	}

}
