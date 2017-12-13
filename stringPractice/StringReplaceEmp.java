package stringPractice;

public class StringReplaceEmp {
	public static void main(String[] args) {
		String str = "hello world";
		System.out.println(str.replace("h", "H"));
		System.out.println(str.replaceFirst("h", "f"));
		System.out.println(str.replaceAll("h", "s"));
	}

}
