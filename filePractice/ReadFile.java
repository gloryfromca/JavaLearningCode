package filePractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		File in = new File("/home/zhanghui/zhanghui.txt");
		FileReader fr = new FileReader(in);
		BufferedReader bfr = new BufferedReader(fr);
		try {
			int num;
			while ((num = fr.read()) != -1) {
				System.out.println((char) num);
			}

			String line;
			while ((line = bfr.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			fr.close();
			bfr.close();
		}

	}

}
