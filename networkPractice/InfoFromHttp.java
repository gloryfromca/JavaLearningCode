package networkPractice;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class InfoFromHttp {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://baidu.com");
		URLConnection conn = url.openConnection();
		long timestamp = conn.getDate();
		System.out.println("time stamp of web is " + new Date(timestamp));

		// get headerMap of httpConn
		// map<String, List<String>> -----> entrySet with entry<String, List<String>>
		// ----->Iterator<Entry<String, List<String>>>
		System.out.println("for entrySet:");
		Map<String, List<String>> headersMap = conn.getHeaderFields();
		for (Entry<String, List<String>> x : headersMap.entrySet()) {
			System.out.println(x);
		}
		System.out.println("while entrySet' Iterator:");
		Iterator<Entry<String, List<String>>> mapIterator = headersMap.entrySet().iterator();
		while (mapIterator.hasNext()) {
			System.out.println(mapIterator.next());
		}
	}

}
