package tw.org.iii.javatest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad41 {
    public static void main(String[] args){
        String mesg = "Hello, 全世界";
        byte[] data = mesg.getBytes();
        try {
            DatagramSocket socket =
                    new DatagramSocket();
            DatagramPacket packet =
                    new DatagramPacket(data,data.length,
                            InetAddress.getByName("10.2.24.255"),
                            8888);
            socket.send(packet);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
