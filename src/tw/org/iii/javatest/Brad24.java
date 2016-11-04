package tw.org.iii.javatest;

/**
 * Created by user01 on 2016/11/4.
 */
public class Brad24 {
    public static void main(String[] args){
        String id = "B223456789";
        if (id.matches("^[A-Z][12][0-9]{8}$")){
            System.out.println("OK");
        }else{
            System.out.println("XX");
        }
    }
}
