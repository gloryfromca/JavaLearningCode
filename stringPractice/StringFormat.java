package stringPractice;

import java.util.Locale;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e = Math.E;
		System.out.format("%f%n", e);
		/*
		 * %n return and line feed, func of format don't provide the line feed automatically.
		 */
		System.out.format(Locale.CHINA, "%-10.4f%n", e);
	}

}
