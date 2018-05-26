package Examples.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestGetInetAddressByName {
    public static void main(String[] args){
        InetAddress address = null;
        try{
            address = InetAddress.getByName("www.github.com");
        }catch(UnknownHostException e){
            System.exit(2);
        }
        System.out.println(address.getHostName()+"  =  " + address.getHostAddress());
        System.exit(0);
    }
}
