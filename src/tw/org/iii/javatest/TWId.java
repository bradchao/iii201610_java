package tw.org.iii.javatest;

public class TWId {
    private String id;

    public TWId(){

    }
    public TWId(char area){

    }
    public TWId(boolean isMale){

    }
    public TWId(char area, boolean isMale){

    }
    public TWId(String id){
        this.id = id;
    }

    public boolean isCheckOK(){
        boolean ret = false;
        if (ret = preCheck()){
            // 編碼規則
        }
        return ret;
    }

    private boolean preCheck(){
        // 4
        return false;
    }

    public String getArea(){
        // TODO --- getArea()
        return "";
    }
    public boolean getGender(){
        // TODO --- getGender()
        return true;
    }

    public String getId(){
        return id;
    }
}
