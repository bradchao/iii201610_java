package tw.org.iii.javatest;

import javax.swing.*;

public class GuessNumber {
    public static void main(String[] args){
        // 1. 產生謎底
        String answer = createAnswer();

        // 2. 開始猜
        boolean isWINNER = false;
        for (int i=0; i<3; i++) {
            String guess = JOptionPane.showInputDialog("輸入答案:");
            String result = checkAB(answer, guess);
            JOptionPane.showMessageDialog(null, result);
            if (result.equals("3A0B")){
                isWINNER = true;
                break;
            }
        }
        if (isWINNER){
            JOptionPane.showMessageDialog(null, "恭喜老爺,賀喜夫人");
        }else{
            JOptionPane.showMessageDialog(null, "恭喜魯蛇, 答案:" + answer);
        }

    }
    static String createAnswer(){
        return "417";
    }
    static String checkAB(String a, String g){
        return "3A0B";
    }
}
