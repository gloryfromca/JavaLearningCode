package functionPractice;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer temp = new StringBuffer("zhanghui");
		int numOfH=0;
		for (int i=0;i<temp.length();i++) {
			if (temp.charAt(i)!='h') continue;
			//"h" is String;'h' is Char.
			numOfH++;
		}
		System.out.println("numOfH of temp is "+ numOfH);
		System.out.println(temp);
	}

}
