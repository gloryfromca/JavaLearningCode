package functionPractice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = multiply(-100);
		System.out.println(result);
	}

	protected static long multiply(long factor) {
		if (factor >= 1) {
			return factor * multiply(factor - 1);
		} else if (factor == 1) {
			return 1;
		} else if (factor == 0) {
			return 1;
		} else {
			return -1;
		}
		// if you use 'if', you must use 'else' when you set type of value returned with
		// somthing not 'void'.
		// because you must return long-type value in any case.
	}

}
