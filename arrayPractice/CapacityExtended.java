package arrayPractice;

import java.util.Arrays;

public class CapacityExtended {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[] { "A", "B", "C" };
		// new String[] is alternative.
		String[] extended = new String[5];
		extended[3] = "D";
		extended[4] = "E";
		System.arraycopy(names, 0, extended, 0, names.length);
		System.out.println(Arrays.toString(extended));
	}

}
