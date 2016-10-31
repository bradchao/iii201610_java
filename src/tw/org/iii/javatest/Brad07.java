package tw.org.iii.javatest;
public class Brad07 {
    public static void main(String[] args){
        System.out.println( 1 ^ 3);
        int a = 10, b = 3;
        if (++a <= 10 & b-- >= 3){
            System.out.println("OK:a = " + a + ", b = " + b);
        }else{
            System.out.println("XX:a = " + a + ", b = " + b);
        }
    }
}
