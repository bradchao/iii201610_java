package tw.org.iii.javatest;

import java.io.File;
import java.io.IOException;

/**
 * Created by user01 on 2016/11/11.
 */
public class Brad48 {
    public static void main(String[] args){
        try {
            MultipartUtility mu =
                    new MultipartUtility(
                            "http://10.2.24.106/brad02.php","utf-8");
            mu.addFilePart("upload", new File("upload/android.jpg"));
            mu.finish();
            System.out.println("Upload OK");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
