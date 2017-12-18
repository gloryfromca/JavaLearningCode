package filePractice;

import java.io.File;
import java.io.IOException;

public class Rename {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File oldname = new File("/home/zhanghui/zhanghui1.txt");
		File newname = new File("/home/zhanghui/zhanghui.txt");
		if (oldname.renameTo(newname)) {
			System.out.println("OK");
		} else {
			System.out.println("error");
		}

	}

}
