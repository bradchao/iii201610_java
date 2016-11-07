package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;

public class Brad27 extends JFrame {
    private JButton newFile, openFile, saveFile, saveAsFile, exit;
    private JTextArea editor;

    public Brad27(){
        // super();
        super("視窗練習");
        setLayout(new BorderLayout());

        newFile = new JButton("New");
        openFile = new JButton("Open");
        saveFile = new JButton("Save");
        saveAsFile = new JButton("Save as");
        exit = new JButton("Exit");
        editor = new JTextArea();

        JPanel top = new JPanel(new FlowLayout());
        top.add(newFile);top.add(openFile);top.add(saveFile);
        top.add(saveAsFile); top.add(exit);

        add(top,BorderLayout.NORTH);
        add(editor, BorderLayout.CENTER);

        setSize(640,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Brad27();
    }
}
