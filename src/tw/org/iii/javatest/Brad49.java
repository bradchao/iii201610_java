package tw.org.iii.javatest;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by user01 on 2016/11/11.
 */
public class Brad49 {
    public static void main(String[] args){
        TreeSet set = new TreeSet();
        while (set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        System.out.println(set.toString());

    }
}
