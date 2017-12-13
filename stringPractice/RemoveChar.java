package stringPractice;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is Java";
		System.out.println(RemoveCharAt(str, 3));
	}
	// type String begins with uppercase letter;type int begins with lowercase letter 
	public static String RemoveCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos+1);
	}

}
