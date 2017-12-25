package networkPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TheServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverListener = new ServerSocket(new Integer(args[0]));
		try {
			Socket socket = serverListener.accept();
			System.out.println("connection from " + socket.getInetAddress().getHostAddress());
			
			// get message from Client.
			BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// don't use `while` condition, because it will iterate forever until readLine()
			// gets EOF or the socket is closed.
			// String line;
			// while ((line = socketReader.readLine()) != null) {
			// System.out.println(line);}
			System.out.println(socketReader.readLine());
			
			// return message to Client.
			BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			socketWriter.write("I'm the Server, it's your food!\n");
			socketWriter.flush();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			serverListener.close();
			System.out.println("server closed!");
		}
	}

}
