package printPractice;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int center = 10;
		printDiamond(center, 0);

	}
	
	static void printDiamond(int center, int merge) {
		
		
		if (merge<=2*center) {
			int whiteSpace = Math.abs(center - merge);
			printSpace(whiteSpace);
			printPoint(2 * (center - whiteSpace) + 1);
			printSpace(whiteSpace);
			System.out.println();
			printDiamond(center, ++merge);
		}

	}

	static void printSpace(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ");
		}
	}

	static void printPoint(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}

}
