package tw.org.iii.javatest;

import java.io.*;

public class Brad32 {
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("dir1/file1");
            int c;
            while ( (c = reader.read()) != -1){
                System.out.print((char)c);
            }


            reader.close();
        }catch (FileNotFoundException fe){

        }catch (IOException fe){

        }
    }
}
