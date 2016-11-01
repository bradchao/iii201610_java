package tw.org.iii.javatest;
public class Brad16 {
    public static void main(String[] args){
        int[][] a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[4];
        for (int[] v : a){
            for (int x : v){
                System.out.print(x + "  ");
            }
            System.out.println();
        }
        System.out.println("------");
        int[] b = new int[]{1,2,3,4,5};
        int[] c = {1,2,3,4,5};
        int[] d;
        //d = {1,2,3,4,5};
        int[] e;
        e = new int[]{1,2,3,4,5};
        for (int v : c){
            System.out.println(v);
        }



    }
}
