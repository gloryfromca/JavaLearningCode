package stringPractice;

public class SearchLastString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String StrOrig = "hello world, Hello Runobb";
		int lastIndex = StrOrig.lastIndexOf("Runobb");
		if (lastIndex == -1){
			System.out.println("no 'Runobb' found!");
			}
		else {
			System.out.println("'Runobb' last location is " + lastIndex);
		}
	}

}
