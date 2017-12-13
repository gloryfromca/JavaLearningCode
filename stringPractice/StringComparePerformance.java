package stringPractice;

import java.util.function.LongFunction;
import java.util.logging.Logger;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class StringComparePerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		for (int i=0; i<500000; i++) {
			String str1 = "zhang";
			String str2 = "hui";
		}
		//System.out.println(str1);
		/*
		 * variables in for-loop just are inner variables not global.
		 */
		long endTime = System.currentTimeMillis();
		System.out.println("using built-in form to create String variable:" + (endTime - startTime));
		long startTime1 = System.currentTimeMillis();
		for (int i=0; i<500000; i++) {
			String str1 = new String("zhang");
			String str2 = new String("hui");
		}
		long endTime1 = System.currentTimeMillis(); 
		System.out.println("use new func to instance:" + (endTime1 - startTime1));
	}

}
