package functionPractice;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] temp= {1,2,2,3,4,5,6,6};
		int find = 6;
		for (int i=0;i<temp.length;i++ ) {
			if (temp[i]==find){
				System.out.println("index of find("+find+") is "+ i);
				break;
			}
		}

	}

}
