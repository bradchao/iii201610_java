package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(4));

        g2d.drawOval(100,100, 40, 40);
        g2d.fillOval(200,200, 40, 40);

    }
}
