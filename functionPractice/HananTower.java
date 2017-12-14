package functionPractice;

public class HananTower {

	public static void main(String[] args) {
		/*
		 * Best way to do hanan is that every disk just take one step to the
		 * destination. It means putting the disk of nested disks tower's bottom into
		 * destination C directly. for example, you must put disks above the largest
		 * disk to another place and have a empty position if you want to move the
		 * largest disk. So why not put disks above the largest disk to B and then put
		 * the largest disk to destination C.
		 */

		int length = 3;
		move(length - 1, "A", "C", "B");
		System.out.println("from A to C");
		move(length - 1, "B", "A", "C");
		// main must use 'static', can't use 'this' in itself.
	}

	/**
	 * Java doc comment begin with /**, and before function body.
	 * 
	 * @param A
	 *            from, B inter, C to.
	 * @return print move step.
	 */
	public static void move(int length, String A, String B, String C) {

		if (length > 0) {
			move(length - 1, A, C, B);
			System.out.println("from " + A + " to " + C);
			move(length - 1, B, A, C);
		}
	}

}
