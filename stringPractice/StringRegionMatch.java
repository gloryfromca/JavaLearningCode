package stringPractice;

public class StringRegionMatch {
	public static void main(String[] args) {
		String first_str = "welcome to microsoft";
		String second_str = "i work with microsoft";
		boolean match1 = first_str.regionMatches(11, second_str, 12, 9);
		boolean match2 = second_str.regionMatches(true, 11, second_str, 12, 9);
		/*
		 * true in Java; True in python
		 */
		System.out.println("RegionMatch:" + match1);
		System.out.println("RegionMathc:" + match2);
		
	}

}
