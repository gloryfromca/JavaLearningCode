package arrayPractice;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class MaxMinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {1,2,3,3,4,4,5};
		
		/*
		 * array can have duplicate values;
		 * int min = Collections.min(numbers);
		 * you cant use this way to get max or min
		 */
		IntSummaryStatistics stat = Arrays.stream(numbers).summaryStatistics();
		int min = stat.getMin();
		int max = stat.getMax();
		System.out.format("min:%s%nmax:%s", min, max);
	}

}
