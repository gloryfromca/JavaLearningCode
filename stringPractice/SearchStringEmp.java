package stringPractice;

public class SearchStringEmp {
	public static void main(String[] args) {
		String str = "hui zhang zhang hui";
		int Intindex = str.indexOf("zhang");
		// no need to new for build-in type without variable name.
		if(Intindex == -1) {
			System.out.println("no subtring found!");
		}
		else {
			System.out.println("'zhang' find in "+ Intindex);
		}
	}

}
