package tw.org.iii.javatest;

public class Brad13 {
    public static void main(String[] args){
        int p1, p2, p3, p4, p5, p6;
        p1 = p2 = p3 = p4 = p5 = p6 = 0;

        for (int i=0; i<100; i++){
            int point = (int)(Math.random()*6); // 0 - 5
            switch (point){
                case 0: p1++; break;
                case 1: p2++; break;
                case 2: p3++; break;
                case 3: p4++; break;
                case 4: p5++; break;
                case 5: p6++; break;
            }
        }
        System.out.println("1點出現" + p1 + "次");
        System.out.println("2點出現" + p2 + "次");
        System.out.println("3點出現" + p3 + "次");
        System.out.println("4點出現" + p4 + "次");
        System.out.println("5點出現" + p5 + "次");
        System.out.println("6點出現" + p6 + "次");

    }
}
