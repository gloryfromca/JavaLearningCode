package arrayPractice;

import java.util.ArrayList;

public class ElementRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add(0, "zero element");
		arrayList.add(1, "first element");
		arrayList.add(2, "second element");
		//you can't skip index by order.
		arrayList.remove(1);
		arrayList.remove("first element");
		System.out.println(arrayList.toString());

	}

}
