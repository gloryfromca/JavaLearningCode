package directoryPractice;

import java.io.File;

public class DirList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("/home/zhanghui/");
		String[] children = dir.list();
		if (children == null) {
			System.out.println("dir not exist!");
		}
		else {
			for(int i=0; i<children.length;i++) {
				System.out.println(children[i]);
			}
		}

	}

}
