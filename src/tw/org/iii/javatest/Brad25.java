package tw.org.iii.javatest;

public class Brad25 {
    public static void main(String[] args){
        Brad251 obj1 = new Brad251();

        Brad252 obj2 = new Brad253();
        Brad252 obj3 = new Brad254();
        obj2.m2();
        obj3.m2();

    }
}
class Brad251 {
    int a;
    void m1(){}
    void m2(){}
}
abstract class Brad252 {
    int a;
    void m1(){}
    abstract void m2();
}
class Brad253 extends Brad252 {
    void m2(){System.out.println("Brad253:m2(){}");}
}
class Brad254 extends Brad252 {
    void m2(){System.out.println("Brad254:m2(){}");}
}
