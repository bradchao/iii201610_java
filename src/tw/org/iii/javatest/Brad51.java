package tw.org.iii.javatest;

public class Brad51 {
    public static void main(String[] args){
        MyThread mt1 = new MyThread("A");
        MyThread mt2 = new MyThread("B");
        mt1.start();
        mt2.start();
        System.out.println("Game Over");
    }

}
class MyThread extends Thread {
    private String name;
    MyThread(String name){this.name = name;}
    @Override
    public void run() {
        super.run();
        for (int i=0; i<20; i++){
            System.out.println(name + ":" + i);
            try {
                Thread.sleep(100);
            }catch(InterruptedException ie){

            }
        }
    }
}

