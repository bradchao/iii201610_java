package tw.org.iii.javatest;

public class Brad23 {
    public static void main(String[] args){
        TWId id1 = new TWId("B123460300");
        if ( id1.isCheckOK()){
            System.out.println("OK");
        }else{
            System.out.println("XX");
        }

    }
}
