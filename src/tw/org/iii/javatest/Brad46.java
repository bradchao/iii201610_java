package tw.org.iii.javatest;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad46 {
    public static void main(String[] args){
        try {
            URL url = new URL("http://pdfmyurl.com/?url=http://www.iii.org.tw");
            HttpURLConnection conn =
                    (HttpURLConnection) url.openConnection();
            conn.connect();

            InputStream in = conn.getInputStream();
            FileOutputStream fout = new FileOutputStream("upload/iii.pdf");
            byte[] buf = new byte[4096]; int len;
            while ( (len = in.read(buf)) != -1){
                fout.write(buf,0,len);
            }
            fout.flush();
            fout.close();
            in.close();

            System.out.println("Finish");

        }catch(Exception e){

        }
    }
}
