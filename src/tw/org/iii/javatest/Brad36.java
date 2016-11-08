package tw.org.iii.javatest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad36 {
    public static void main(String[] args){
        Student s1 = new Student("Brad",70,50,30);
        System.out.println(s1.name + ":" + s1.calcScore() + ":" + s1.calcAvg());

        try {
            ObjectOutputStream oout = new ObjectOutputStream(
                    new FileOutputStream("dir1/brad.oo"));
            oout.writeObject(s1);
            oout.flush();
            oout.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
class Student implements Serializable {
    int ch, math, eng;
    String name;
    Student(String name, int ch, int math, int eng){
        this.name = name;
        this.ch = ch; this.math = math;this.eng = eng;
    }
    int calcScore(){return ch+math+eng;}
    double calcAvg(){ return calcScore()/3.0; }
}
