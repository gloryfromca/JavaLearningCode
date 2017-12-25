package networkPractice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetLocalHostAndHostName {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress localHost = InetAddress.getLocalHost();
		System.out.println("HostAddress:" + localHost.getHostAddress());
		System.out.println("HostAdress:" + localHost.getHostName());
	}

}
