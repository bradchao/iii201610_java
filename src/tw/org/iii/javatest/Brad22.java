package tw.org.iii.javatest;

public class Brad22 {
    public static void main(String[] args){
        String s1 = "Brad";
        String s2 = "Brad";
        String s3 = new String("Brad");
        String s4 = new String("Brad");
        System.out.println(s1 == s4);
        System.out.println(s3.equals(s4));
        System.out.println("---");
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println("---");
        String s5 = s3;
        System.out.println(s3.concat("III"));
        System.out.println(s3);
        System.out.println("---");
        System.out.println(p1);
    }
}
class Pen extends Object{
    @Override
    public String toString() {
        return "Apple";
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
