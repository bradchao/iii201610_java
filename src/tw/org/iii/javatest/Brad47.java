package tw.org.iii.javatest;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad47 {
    public static void main(String[] args){
        try {
            URL url = new URL("http://127.0.0.1/brad02.php");
            HttpURLConnection conn =
                    (HttpURLConnection) url.openConnection();
            conn.connect();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line = br.readLine();
            br.close();

            System.out.println(line);
            System.out.println("Finish");

        }catch(Exception e){

        }
    }
}
