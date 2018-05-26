package Examples.Net;

import java.net.InetAddress;

public class TestGetLocalIP {
    public static void main(String[] args) throws Exception{
        InetAddress address =InetAddress.getLocalHost();
        System.out.println("Local HostAddress: "+ address.getHostAddress());
        String hostname = address.getHostName();
        System.out.println("Local host name: "+hostname);
    }
}
