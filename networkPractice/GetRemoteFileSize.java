package networkPractice;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class GetRemoteFileSize {

	public static void main(String[] args) throws IOException {

		// In Java, all blocks create scope. The body of an if, the body of an else, of
		// a while, etc. — they all create a new, nested variable scope
		// In Java, any time you have a { } pair, you can create a new scope.
		URL url = null;
		URLConnection conn = null;
		try {
			url = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
			conn = url.openConnection();
			// If the connect method is called when the connection has already been opened
			// (indicated by the connected field having the value true), the call is
			// ignored.
			conn.connect();
			// Operations that depend on being connected, like getContentLength, will
			// implicitly perform the connection, if necessary
			int length = conn.getContentLength();
			System.out.println("the Length of Content is " + length);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (url == null) {
				System.out.println("url isn't established!");
			} else if (conn == null) {
				System.out.println("conn isn't established!");
			} else {
				// close conn
				InputStream connInput = null;
				try {
					connInput = conn.getInputStream();
					connInput.close();
					// It depends on the specific protocol specified in the protocol. Some maintain
					// persistent connections, other close their connections when your call close in
					// the input or outputstream given by the connection. But other than remembering
					// to closing the streams you opened from the URLConnection, there is nothing
					// else you can do.
					// Invoking the close() methods on the InputStream or OutputStream of an
					// URLConnection after a request may free network resources associated with this
					// instance, unless particular protocol specifications specify different
					// behaviours for it.
					System.out.println("conn closed!");
				} catch (Exception e1) {
					System.out.println("conn is wrong!");
					e1.printStackTrace();
				}
			}
		}
	}
}
