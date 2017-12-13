package arrayPractice;

import java.util.Arrays;

public class FillTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[6];
		Arrays.fill(array, 100);
		System.out.println(Arrays.toString(array));
		System.out.println(array.toString());
		int[] array1 = { 1, 2, 3, 3 };
		System.out.println(array1.toString());
		// result is same as the way getting String below; like [I@4e25154f
	}

}
