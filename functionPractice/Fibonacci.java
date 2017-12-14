package functionPractice;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		next(5, 1, 1);
	}
	static void next(int length, int first, int second) {
		if (length>0) {
			int third = first+second;
			System.out.print(third + ",");
			next(length-1,second, third );
		}
	}

}
