package tw.org.iii.javatest;

public class Brad11 {
    public static void main(String[] args){
        int i = 0, sum = 0, n =1742;
        while(i<=n){
            sum += i++;
        }
        System.out.println("1 + 2 + ... + " + n + " = " + sum );
    }
}
