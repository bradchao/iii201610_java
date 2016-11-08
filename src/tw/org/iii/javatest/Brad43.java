package tw.org.iii.javatest;

import java.io.IOException;
import java.net.ServerSocket;

public class Brad43 {
    public static void main(String[] args){
        try {
            ServerSocket server =
                    new ServerSocket(9999);
            server.accept();
            server.close();
            System.out.println("Server OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
