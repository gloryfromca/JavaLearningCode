package filePractice;

import java.io.File;

public class GetFileLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long size = getFileLength("/home/zhanghui/zhanghui.txt");
		System.out.println(size);

	}
	public static long getFileLength(String filename) {
		File in = new File(filename);
		if (!in.exists()||!in.isFile()) {
			return -1;
		}
		return in.length();
	}
	

}
