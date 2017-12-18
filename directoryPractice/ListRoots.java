package directoryPractice;

import java.io.File;

public class ListRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("/home/zhanghui/");
		File[] dirs = dir.listRoots();
		for (File x:dirs) {
			System.out.println(x.toString());
		}
	}

}
