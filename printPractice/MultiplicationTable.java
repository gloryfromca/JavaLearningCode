package printPractice;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				if (j>i) {
					System.out.println();
					break;
				}
				System.out.print(i+"×"+j+"="+i*j+" ");
			}
		}
	}

}
