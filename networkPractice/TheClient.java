package networkPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TheClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", new Integer(args[0]));
		try {
			OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
			InputStreamReader is = new InputStreamReader(socket.getInputStream());

			// send message to Server
			BufferedWriter out = new BufferedWriter(os);
			out.write("I'm Client, I want some food!\n");
			out.flush();

			// get message from Server
			BufferedReader in = new BufferedReader(is);
			// you can use ``while`` condition unless Server will close automatically.
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			socket.close();
			System.out.println("client closed!");
		}

	}

}
