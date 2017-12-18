package directoryPractice;

import java.io.File;

public class Mkdir {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File dir = new File("/home/zhanghui/dir_test/1/1/1/1/1/1");
		System.out.println(dir.mkdirs());
		
	}

}
