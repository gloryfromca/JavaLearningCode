package networkPractice;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class WebPing {

	public static void main(String[] args) {

		try {
			Socket webSocket = new Socket("www.baidu.com", 80);
			InetAddress addr = webSocket.getInetAddress();
			System.out.println("addr is " + addr);
			webSocket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
