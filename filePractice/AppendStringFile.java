package filePractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendStringFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("/home/zhanghui/zhanghui.txt"));
			out.write("zhanghui\n");
			out.close();
			BufferedWriter append = new BufferedWriter(new FileWriter("/home/zhanghui/zhanghui.txt", true));
			append.write("append");
			append.close();

			BufferedReader in = new BufferedReader(new FileReader("/home/zhanghui/zhanghui.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
