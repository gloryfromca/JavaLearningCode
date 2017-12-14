package functionPractice;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = { "zhang", "hui" };
		Integer[] intArray = { 1, 2 };
		Double[] doubleArray = { 1.0, 2.2 };
		PrintArray(stringArray);
		PrintArray(intArray);
		PrintArray(doubleArray);
	}

	protected static <E> void PrintArray(E[] array) {
		// you must need to add <E> between 'static' and 'void'
		// E is Double not double, is Integer not int.
		// double is primitive type, not a class.
		for (E e : array) {
			System.out.println(e);
		}

	}

}
