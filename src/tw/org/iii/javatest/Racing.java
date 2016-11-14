package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Racing extends JFrame {
    private JButton go;
    private JLabel[] lanes = new JLabel[8];
    private Car[] cars = new Car[8];

    public Racing(){
        super("賽馬城市");
        setLayout(new GridLayout(9,1));

        go = new JButton("Go!"); add(go);
        for (int i=0; i<lanes.length; i++){
            lanes[i] = new JLabel((i+1) + ":");
            add(lanes[i]);
        }

        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                go();
            }
        });

        setSize(800, 480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void go(){
        for (int i=0; i<cars.length; i++){
            cars[i] = new Car(i);
        }
        for (Car car : cars){
            car.start();
        }
    }

    private class Car extends Thread {
        private int whichLane;
        Car(int i){whichLane = i;}
        @Override
        public void run() {
            for (int i=0;i<100; i++){
                lanes[whichLane].setText(lanes[whichLane].getText() + ">");
                try {
                    Thread.sleep(50 + (int)(Math.random()*200));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args){
        new Racing();
    }
}
