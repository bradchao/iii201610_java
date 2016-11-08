package tw.org.iii.javatest;

import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.SocketHandler;

/**
 * Created by user01 on 2016/11/8.
 */
public class Brad42 {
    public static void main(String[] args){
        try {
            Socket socket = new Socket(
                    InetAddress.getByName(""), 9999);

            socket.close();
            System.out.println("OK");
        } catch (Exception ee) {

        }
    }
}
