package networkPractice;

import java.io.IOException;
import java.net.ServerSocket;

public class DetectionPort {

	public static void main(String[] args) throws IOException {
		int min = 1024;
		int max = 10240;
		ServerSocket ssk = null;
		for (int port = min; port < max + 1; port++) {
			try {
				ssk = new ServerSocket(port);
				System.out.println("port:" + port + " is OK!");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("port:" + port + " is occupancy!");
			} finally {
				if (ssk != null) {
					ssk.close();
				}
			}
		}

	}

}
