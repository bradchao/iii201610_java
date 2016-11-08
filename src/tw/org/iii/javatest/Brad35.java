package tw.org.iii.javatest;

public class Brad35 {
    public static void main(String[] args){
        Brad353 obj1 = new Brad353();
        Brad353 obj2 = new Brad353();

    }
}
class Brad351{
    static {System.out.println("Brad351:static{...}");}
    {System.out.println("Brad351:{...}");}
    Brad351(){System.out.println("Brad351()");}
    void m1(){System.out.println("Brad351:m1()");}
    static void m2(){System.out.println("Brad351:m2()");}
}
class Brad352 extends Brad351 {
    static {System.out.println("Brad352:static{...}");}
    {System.out.println("Brad352:{...}");}
    Brad352(){System.out.println("Brad352()");}
    void m1(){System.out.println("Brad352:m1()");}
    static void m2(){System.out.println("Brad352:m2()");}
}
class Brad353 extends Brad352 {
    static {System.out.println("Brad353:static{...}");}
    {System.out.println("Brad353:{...}");}
    Brad353(){System.out.println("Brad353()");}
    void m1(){System.out.println("Brad353:m1()");}
    static void m2(){System.out.println("Brad353:m2()");}
}

