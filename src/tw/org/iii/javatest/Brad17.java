package tw.org.iii.javatest;

/**
 * Created by user01 on 2016/11/1.
 */
public class Brad17 {
    public static void main(String[] args){
        Bike b1 = new Bike();
        Bike b2 = new Bike();
        Bike b3 = new Bike();
        System.out.println(b1.getSpeed());
        b1.upSpeed();
        b1.upSpeed();
        b1.upSpeed();
        System.out.println(b1.getSpeed());
        System.out.println("------");
        System.out.println(b2.getSpeed());
        long v2 = 4;
        b2.upSpeed(v2);
        b2.upSpeed(v2);
        b2.upSpeed(v2);
        System.out.println(b2.getSpeed());
        System.out.println("------");
        System.out.println(b3.getSpeed());
        b3.upSpeed(4.0);
        b3.upSpeed(4.0);
        b3.upSpeed(4.0);
        System.out.println(b3.getSpeed());


    }
}
