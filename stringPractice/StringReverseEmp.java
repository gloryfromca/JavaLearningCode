package stringPractice;

public class StringReverseEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "zhanghui";
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println("before: " + str);
		System.out.println("after: " + reverse);
		// using "" not '' to wrap String.
	}

}
