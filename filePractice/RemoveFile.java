package filePractice;

import java.io.File;
import java.io.IOException;

public class RemoveFile {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		File in = new File("/home/zhanghui/zhanghui.txt");
		if (in.delete()) {
			System.out.println("removal success!");
		}else {
			System.out.println("removal fail!");
		}

	}

}
