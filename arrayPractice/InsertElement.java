package arrayPractice;

// you can use ctrl + shift + o to remove import needless
import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {23,45,6,-56,5,42,34};
		Arrays.sort(array);
		int numWanna = 1;
		int index = Arrays.binarySearch(array, numWanna);
		System.out.format("location of numWanna:%s%n", index);
		//like System.out.printf
		int newIndex = -(index+1);
		int [] newArray = insertElmnt(array, 1, newIndex);
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(array));
	}
	private static int[] insertElmnt(int[] originalArray, int element, int insertIndex) {
		int originalLength = originalArray.length;
		int [] destination = new int[originalLength+1];
		System.arraycopy(originalArray, 0, destination, 0, insertIndex);
		destination[insertIndex] = element;
		System.arraycopy(originalArray, insertIndex, destination, insertIndex+1, originalLength - insertIndex);
		return destination;
	}

}
