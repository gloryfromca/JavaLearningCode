package arrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class UnionHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array1 = {"zhang", "hui", "first"};
		String[] array2 = {"zhang", "hui", "name"};
		String[] arrayUnion =  union(array1, array2) ;
		System.out.println(Arrays.toString(arrayUnion));
	}
	public static String[] union(String[] array1, String[] array2) {
		HashSet<String> set = new HashSet<String>();
		for (String e:array1) {
			set.add(e);
		}
		for (String e:array2) {
			set.add(e);
		}
		String[] result = {};
		return set.toArray(result);
		/*set to Array, then fill result, then return result.
		 * It's like Procedure Oriented, not Object Oriented.
		 */
	}

}
