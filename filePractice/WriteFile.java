package filePractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// if you have I/O, you need to define 'throws IOException'
		// TODO Auto-generated method stub
		String str = "zhanghui is name"; 
		File zhanghui = new File("/home/zhanghui/zhanghui.txt");
		// you need to use absolutePath
		zhanghui.createNewFile();
		FileWriter out = new FileWriter(zhanghui);
		try {
			out.write(str);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			out.close();			
		}
	}

}
