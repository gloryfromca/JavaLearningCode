package networkPractice;

import java.net.Inet4Address;
import java.net.InetAddress;

public class GetIpByName {

	public static void main(String[] args) {
		InetAddress address;
		try {
			address = Inet4Address.getByName("www.google.com");
			System.out.println(address.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(2);
		}
		System.exit(0);
	}

}
