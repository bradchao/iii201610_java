package tw.org.iii.javatest;

import java.util.Scanner;

public class Brad05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int intScore = scanner.nextInt();
        System.out.println(intScore);
        if (intScore >= 90){
            System.out.println("A");
        }else if (intScore >= 80){
            System.out.println("B");
        }else if (intScore >= 70){
            System.out.println("C");
        }else if (intScore >= 60){
            System.out.println("D");
        }else{
            System.out.println("E");
        }



    }
}
