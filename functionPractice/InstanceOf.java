package functionPractice;

import java.util.ArrayList;
import java.util.Vector;

public class InstanceOf {
	public static void main(String[] args) {
		Object arraylist = new ArrayList();
		displayObjectClass(arraylist);
	}

	protected static void displayObjectClass(Object object) {
		if (object instanceof Vector) {
			System.out.println("object is a instance of Vector");
		} else if (object instanceof ArrayList) {
			System.out.println("object is a instance of ArrayList");
		} else {
			System.out.println("object is a instance of " + object.getClass());
		}
	}

}
