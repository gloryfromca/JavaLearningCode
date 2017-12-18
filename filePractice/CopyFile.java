package filePractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter out = new BufferedWriter(new FileWriter("/home/zhanghui/zhanghui.txt"));
		out.write("zhanghui\n");
		out.close();
		InputStream from = new FileInputStream(new File("/home/zhanghui/zhanghui.txt"));
		OutputStream to = new FileOutputStream(new File("/home/zhanghui/destination.txt"));
		// An output stream accepts output bytes and sends them to some sink.
		// input and output means for the data sent, not for themselves.
		byte[] buf = new byte[1024];
		int len;
		if ((len = from.read(buf)) > 0) {
			// Reads some number of bytes from the input stream and stores them into the
			// buffer array b. The number of bytes actually read is returned as an integer.
			to.write(buf, 0, len);
		}
		from.close();
		to.close();
		BufferedReader des = new BufferedReader(new FileReader("/home/zhanghui/destination.txt"));
		String str;
		while ((str = des.readLine())!=null) {
			System.out.println(str);
		}
		des.close();

	}

}
