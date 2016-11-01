package tw.org.iii.javatest;

import java.util.Arrays;

public class PokerV2 {
    public static void main(String[] args){
        // 洗牌
        int[] poker = new int[52]; // poker[0] = 0, ....
        int temp; boolean isRepeat;
        for (int i=0; i<poker.length; i++){
            do{
                temp = (int)(Math.random()*poker.length);
                // 檢查機制
                isRepeat = false;
                for (int j=0; j<i; j++){
                    if (poker[j] == temp){
                        // 此時重複了
                        isRepeat = true;
                        break;
                    }
                }
            }while (isRepeat);
            poker[i] = temp;
            //System.out.println(poker[i]);
        }
        System.out.println("----");
        // 發牌
        int[][] players = new int[4][13];
        for (int i=0; i<poker.length; i++){
            players[i%4][i/4] = poker[i];
        }

        // 攤牌 (理牌)
        String[] suits = {"黑桃","紅心","方塊","梅花"};
        String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 "
                ,"8 ","9 ","10","J ","Q ","K "};
        for (int[] player : players){
            Arrays.sort(player);
            for (int card : player){
                System.out.print(suits[card/13] + values[card%13] + "  ");
            }
            System.out.println();
        }



    }
}
