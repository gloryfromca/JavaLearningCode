package networkPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WebCatch {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://baidu.com");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		BufferedWriter out = new BufferedWriter(new FileWriter("/home/zhanghui/data.html"));
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
			out.write(line);
			// Enter to a new Line
			out.newLine();
		}
		in.close();
		out.close();
	}

}
