package java1_InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Fcs
 * @description
 * @date 2024-11-02 17:53
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inet1 = InetAddress.getByName("192.168.1.1");
        System.out.println(inet1);

        InetAddress inet2 = InetAddress.getByName("www.baidu.com");
        System.out.println(inet2);

        InetAddress inet3 = InetAddress.getByName("localhost");
        System.out.println(inet3);
        InetAddress inet4 = InetAddress.getLocalHost();
        System.out.println(inet4);

        System.out.println(inet1.getHostName());
        System.out.println(inet1.getHostAddress());

        System.out.println(inet4.getHostName());
        System.out.println(inet4.getHostAddress());

    }
}
