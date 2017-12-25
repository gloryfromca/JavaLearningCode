package networkPractice;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class CheckRemoteFileModified {

	public static void main(String[] args) throws IOException {
		URL rf = new URL("http://127.0.0.1/java.bmp");
		URLConnection conn = rf.openConnection();
		conn.setUseCaches(false);
		long timeModified = conn.getLastModified();
		System.out.println("latest modifdied time is "+timeModified);
	}

}
