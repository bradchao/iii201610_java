package tw.org.iii.javatest;

import javax.swing.*;
import java.util.Scanner;

public class Brad06 {
    public static void main(String[] args){
        String strScore = JOptionPane.showInputDialog("輸入成績");
        int intScore = Integer.parseInt(strScore);
        System.out.println(intScore);
        if (intScore >= 90){
            JOptionPane.showMessageDialog(null, "A");
            //System.out.println("A");
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
