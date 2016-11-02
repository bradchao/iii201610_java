package tw.org.iii.javatest;

/**
 * Created by user01 on 2016/11/2.
 */
public class Brad19 {
    public static void main(String[] args){
        Scooter s1 = new Scooter();
        s1.upSpeed();
        s1.upSpeed(1.2);
        s1.upSpeed(2);
        System.out.println(s1.getSpeed());

    }
}
