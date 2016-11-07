package tw.org.iii.javatest;

import java.io.File;

public class Brad30 {
    public static void main(String[] args){
        File dir1 = new File("dir1");
        File dir2 = new File("dir2");
        if (dir2.exists()){
            System.out.println("Exist!");
        }else{
            dir2.mkdir();
        }
        File dir5 = new File("dir1/dir2/dir3/dir4/dir5");
        if (dir5.exists()){
            System.out.println("Exist!");
        }else{
            dir5.mkdirs();
        }
    }
}
