package arrayPractice;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) throws Exception {
		int[] array = { 1, 2, 2, 2, 2, 3 };
		// int array[] = { 1, 2, 2, 2, 2, 3 }; is same defined way, but I'm not fond of
		// it.
		Arrays.sort(array);
		int numFound = 2;
		int index = Arrays.binarySearch(array, numFound);
		System.out.printf("location of %s is:%s %n", numFound, index);
		// printf means that print and format. 
		printArray("nothing", array);
	}

	public static void printArray(String info, int[] array) {
		System.out.println("the length of array:" + array.length);
		for (int x : array) {
			System.out.print(x + ",");
		}

	}

}
