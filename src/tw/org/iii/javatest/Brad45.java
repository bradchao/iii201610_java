package tw.org.iii.javatest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Brad45 {
    public static void main(String[] args){
        try {
            URL url = new URL("https://test-skypoo.c9users.io/skypoo/test.php");
            HttpURLConnection urlConnection =
                    (HttpURLConnection)url.openConnection();
            urlConnection.connect();
            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
