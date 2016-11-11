package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyPanel extends JPanel implements MouseMotionListener {
    public MyPanel(){
        addMouseMotionListener(this);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        setBackground(Color.BLACK);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX(); int y = e.getY();
        System.out.println(x + " x " + y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {}
}
