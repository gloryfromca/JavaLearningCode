package filePractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTempFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File temp = new File("temp.txt");
		// type File don't have close() func.
		temp.deleteOnExit();
		BufferedWriter out = new BufferedWriter(new FileWriter(temp));
		out.write("zhanghui\n");
		out.close();

	}

}
