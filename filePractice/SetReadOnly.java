package filePractice;

import java.io.File;

public class SetReadOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in = new File("/home/zhanghui/zhanghui.txt");
		in.setReadOnly();
		System.out.println(in.canWrite());

	}

}
