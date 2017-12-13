package stringPractice;

public class StringConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int _length = 500000;
		long startTime0 = System.currentTimeMillis();
		for (int i = 0; i < _length; i++) {
			String result = "this is testing difference between Strgin and StringBuffer";

		}
		long endTime0 = System.currentTimeMillis();

		System.out.println("using nothing:" + (endTime0 - startTime0));

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < _length; i++) {
			String result = "this" + "is" + "testing" + "difference" + "between" + "String" + "and" + "StringBuffer";
			// this method just like result = "this is testing difference between Strgin and
			// StringBuffer";

		}
		long endTime = System.currentTimeMillis();
		System.out.println("using '+' operators:" + (endTime - startTime));

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < _length; i++) {
			String s1 = "this";
			String s2 = "is";
			String s3 = "testing";
			String s4 = "difference";
			String s5 = "between";
			String s6 = "String";
			String s7 = "and";
			String s8 = "StringBuffer";
			String result = s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8;

		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("StringConcatenate:" + (endTime1 - startTime1));

		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < _length; i++) {
			/*
			 * StringBuffer result = "this"; wrong initialization of StringBuffer, it's just
			 * for String!
			 */
			StringBuffer result = new StringBuffer("this");
			result.append("is");
			result.append("testing");
			result.append("difference");
			result.append("between");
			result.append("String");
			result.append("and");
			result.append("StringBuffer");

		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("using StringBuffer:" + (endTime2 - startTime2));

		long startTime3 = System.currentTimeMillis();
		for (int i = 0; i < _length; i++) {

			String result = "this";
			result += "is";
			result += "testing";
			result += "difference";
			result += "between";
			result += "String";
			result += "and";
			result += "StringBuffer";

		}
		long endTime3 = System.currentTimeMillis();
		System.out.println("using '+=' operator:" + (endTime3 - startTime3));

	}

}
