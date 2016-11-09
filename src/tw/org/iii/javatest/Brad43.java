package tw.org.iii.javatest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// Server
public class Brad43 {
    public static void main(String[] args){
        try {
            ServerSocket server =
                    new ServerSocket(9999);
            System.out.println("Listening...");
            Socket socket = server.accept();

            String urip = socket.getInetAddress().getHostAddress();
            System.out.println(urip + ":");
            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));
            String line;
            while ( (line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();

            server.close();
            System.out.println("Server OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
