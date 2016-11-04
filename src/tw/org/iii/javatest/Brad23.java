package tw.org.iii.javatest;

public class Brad23 {
    public static void main(String[] args){
        TWId id1 = new TWId('W',true);
        System.out.println(id1.getId());
        if ( TWId.isCheckOK(id1.getId())){
            System.out.println("OK");
        }else{
            System.out.println("XX");
        }

    }
}
