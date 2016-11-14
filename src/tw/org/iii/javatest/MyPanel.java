package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.LinkedList;

public class MyPanel extends JPanel {
    private LinkedList<HashMap<String,Integer>> line;
    private MyMouseListener myMouseListener;

    public MyPanel(){
        myMouseListener = new MyMouseListener();
        addMouseMotionListener(myMouseListener);
        addMouseListener(myMouseListener);
        line = new LinkedList<>();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        setBackground(Color.BLACK);
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(new BasicStroke(2));

        // line(4) => 0-1, 1-2, 2-3
        for (int i=1; i<line.size(); i++){
            HashMap<String,Integer> p0 = line.get(i-1);
            HashMap<String,Integer> p1 = line.get(i);
            g2d.drawLine(p0.get("x"), p0.get("y"),
                    p1.get("x"), p1.get("y"));
        }


    }

    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            int x = e.getX(); int y = e.getY();
            HashMap<String,Integer> point = new HashMap<>();
            point.put("x", x); point.put("y", y);
            line.add(point);
            repaint();
        }
        

    }
}
