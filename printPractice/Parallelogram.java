package printPractice;

public class Parallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5;
		int skewness = 5;
		// skewness should be equal with length.
		int width = 4;
		for(int i=0; i<length; i++) {
			Diamond.printSpace(--skewness);
			Diamond.printPoint(width);			
			System.out.println();
		}

	}

}
