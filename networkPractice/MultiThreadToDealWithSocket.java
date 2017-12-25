package networkPractice;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadToDealWithSocket implements Runnable {

	Socket cSocket;

	public MultiThreadToDealWithSocket(Socket socket) {
		this.cSocket = cSocket;
	}

	// the thread can't throw the exception to any other thread (nor to the main
	// thread). and you cannot make the inherited run() method throw any checked
	// exceptions since you can only throw less than the inherited code, not more.
	public void run() {
		try {
			PrintStream printStream = new PrintStream(cSocket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(1734);
		while (true) {
			// accept will return a new socket
			Socket socket = serverSocket.accept();
			// you should wrap the Runnable object with ``Thread``, then start it.
			// Or you can make the class implement ``Thread``, then start it directly.
			Thread socketThread = new Thread(new MultiThreadToDealWithSocket(socket));
			socketThread.start();
		}

	}

}
