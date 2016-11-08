package tw.org.iii.javatest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Brad37 {
    public static void main(String[] args){
        try {
            ObjectInputStream oin =
                    new ObjectInputStream(new FileInputStream("dir1/brad.oo"));
            Object obj = oin.readObject();
            Student s2 = (Student) obj;
            System.out.println(s2.name + ":" + s2.calcScore() + ":" + s2.calcAvg());
            oin.close();
        } catch (ClassNotFoundException e) {

        } catch (IOException e) {
        }
    }
}
