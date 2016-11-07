package tw.org.iii.javatest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Brad34 {
    public static void main(String[] args){
        try {
//            FileInputStream fin =
//                    new FileInputStream("dir1/file1");
//            InputStreamReader irs =
//                    new InputStreamReader(fin);
//            BufferedReader br =
//                    new BufferedReader(irs);

//            BufferedReader br =
//                    new BufferedReader(
//                            new InputStreamReader(
//                                    new FileInputStream("dir1/file1")));

            BufferedReader br = new BufferedReader(
                    new FileReader("dir1/file1"));


            String line; int i = 1;
            while ( (line = br.readLine()) != null){
                System.out.println(i++ + ">" + line);
            }
            br.close();
        }catch(Exception e){

        }
    }
}
