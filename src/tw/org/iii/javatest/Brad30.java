package tw.org.iii.javatest;

import java.io.File;

public class Brad30 {
    public static void main(String[] args){
        File dir1 = new File("dir1");
        if (dir1.isDirectory()){
            File[] sub = dir1.listFiles();
            for (File sfile : sub){
                System.out.println(sfile.getName());
            }
        }

        File[] roots = File.listRoots();
        for (File root : roots){
            System.out.println(root.getAbsolutePath());
        }


    }
}
