package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user01 on 2016/11/2.
 */
public class Brad20 extends JFrame {
    private JButton open, save, exit;

    public Brad20(){
        // super();
        super("偶的視窗城市");
        setSize(640,480);
        setLayout(new FlowLayout());

        open = new JButton("Open");
        save = new JButton("Save");
        exit = new JButton("Exit");
        add(open); add(save); add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }
    public static void main(String[] args){
        Brad20 b1 = new Brad20();
    }
}
