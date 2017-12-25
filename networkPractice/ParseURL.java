package networkPractice;

import java.io.IOException;
import java.net.URL;

public class ParseURL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("http://www.runoob.com/html/html-tutorial.html");
		System.out.println(url.getProtocol());
		System.out.println(url.getFile());
		System.out.println(url.getPath());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getContent());
		System.out.println(url.getDefaultPort());

	}

}
