package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// you can input "sysout" to get the line that System.out.println();

		ArrayList arrayList = new ArrayList();
		ArrayList arrayList1 = new ArrayList();
		arrayList.add(0, "first element");
		arrayList.add(0, 2);
		// you really can fill up ArrayList with variables of different types only if
		// you don't set something like <String> behind arrayList.
		System.out.println(arrayList.toString());
		// System.out.println(Arrays.aslist(arrayList)); will regard arrayList as
		// element of list returned.

		List<String> list1 = Arrays.asList("zhang", "hui", "name");
		List<String> list2 = Arrays.asList("zhang", "hui", "first");
		// list is mutable, not for array.

		System.out.println("array3 equals array4?:" + Arrays.equals(new int[] { 1, 2, 2 }, new int[] { 1, 2, 2 }));
		/*
		 * System.out.println("array3 equals array4?:" + Arrays.equals(int[]
		 * {1,2,2},int[] {1,2,2})); System.out.println("array3 equals array4?:" +
		 * Arrays.equals( {1,2,2}, {1,2,2})); two line above are wrong, you must
		 * construct array completely by using prefix like 'new int[]'
		 */
		String[] array1 = { "zhang" };
		String[] array2 = { "zhang" };
		System.out.println("array1 equals array2?:" + Arrays.equals(array1, array2));
		// System.out.println(Arrays.equals(objArrayList1, objArrayList2));
		// Arrays.equals just for Array

		ArrayList<String> objArrayList1 = new ArrayList<String>(list1);
		ArrayList<String> objArrayList2 = new ArrayList<String>(list2);
		System.out.println("objArray contains 'zhang':" + objArrayList1.contains("zhang"));

		objArrayList1.retainAll(objArrayList2);
		System.out.println(objArrayList1);
		objArrayList1.removeAll(objArrayList2);
		System.out.println(objArrayList1);
		
	}

}
