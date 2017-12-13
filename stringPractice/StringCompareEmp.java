package stringPractice;

public class StringCompareEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		String anotherString = "hello world";
		Object objstr = str;
		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));
		System.out.println(str.compareTo(objstr.toString()));
		// no need to add type before variable using after initialization.
	}

}
