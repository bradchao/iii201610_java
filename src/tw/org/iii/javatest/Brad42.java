package tw.org.iii.javatest;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.SocketHandler;

// Client
public class Brad42 {
    public static void main(String[] args){
        try {
            Socket socket = new Socket(
                    InetAddress.getByName("10.2.24.106"), 9999);

            BufferedOutputStream bout =
                    new BufferedOutputStream(
                            socket.getOutputStream());
            bout.write("Hello, Brad\nHello, World".getBytes());
            bout.flush();
            bout.close();

            socket.close();
            System.out.println("OK");
        } catch (Exception ee) {

        }
    }
}
