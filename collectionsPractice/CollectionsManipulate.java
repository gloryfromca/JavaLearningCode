package collectionsPractice;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsManipulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Zhang", "jiang", "Li", "bo"};
		List<String> nameList=Arrays.asList(name);
		ListIterator<String>  nameIterator= nameList.listIterator();
		Set<String> nameSet = new TreeSet<String>();  

		System.out.println("nameList:"+nameList);
		Collections.shuffle(nameList);
		System.out.println("nameList:"+nameList);
		
		for (String e:nameList) {
			nameSet.add(e);
		}
		System.out.println(Collections.max(nameSet));
		System.out.println(Collections.max(nameSet, String.CASE_INSENSITIVE_ORDER));
		
		System.out.println("Before Reversal:");
		while (nameIterator.hasNext()) {
		System.out.println(nameIterator.next());
		}
		System.out.println("After Reversal:");
		Collections.reverse(nameList);
		ListIterator<String> nameReversal = nameList.listIterator();
		while (nameReversal.hasNext()) {
		System.out.println(nameReversal.next());
		}
		
	}

}
