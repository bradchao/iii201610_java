package tw.org.iii.javatest;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.SocketHandler;

// Client - send file
public class Brad42 {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        try {
            Socket socket = new Socket(
                    InetAddress.getByName("10.2.24.106"), 9999);
            OutputStream out = socket.getOutputStream();
            FileInputStream fin = new FileInputStream(
                    "dir1/android.jpg");
            int b;
            while ( (b = fin.read()) != -1){
                out.write(b);
            }
            fin.close();
            out.flush();
            out.close();

            socket.close();
            System.out.println("OK-----");
            System.out.println(System.currentTimeMillis()-start);

        } catch (Exception ee) {
            System.out.println("Client Exception: " + ee.toString());
        }
    }
}
