package tw.org.iii.javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Brad27 extends JFrame implements ActionListener{
    private JButton newFile, openFile, saveFile, saveAsFile, exit;
    private JTextArea editor;
    private File editFile;

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

//        newFile.addActionListener(new MyListener());
//        newFile.addActionListener(this);
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFile();
            }
        });

        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });

        saveFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });

        JPanel top = new JPanel(new FlowLayout());
        top.add(newFile);top.add(openFile);top.add(saveFile);
        top.add(saveAsFile); top.add(exit);

        add(top,BorderLayout.NORTH);
        JScrollPane jsp = new JScrollPane(editor);
        add(jsp, BorderLayout.CENTER);

        setSize(640,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Brad27();
    }

    // 產生新檔
    private void newFile (){
        editFile = null;
        editor.setText("");
    }

    private void openFile(){
        JFileChooser jfc = new JFileChooser();
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            editFile = jfc.getSelectedFile();
            loadFile();
        }
    }

    private void loadFile(){
        try {
            StringBuffer sb = new StringBuffer();
            BufferedReader br = new BufferedReader(new FileReader(editFile));
            String line;
            while ( (line = br.readLine()) != null){
                sb.append(line + "\n");
            }
            br.close();
            editor.setText(sb.toString());
        } catch (Exception e) {

        }
    }

    private void saveFile(){
        if (editFile == null){
            saveAsFile();
        }else{
            save2RealFile();
        }
    }

    private void saveAsFile(){
        JFileChooser jfc = new JFileChooser();
        if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
            editFile = jfc.getSelectedFile();
            save2RealFile();
        }
    }

    private void save2RealFile(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(editFile));
            bw.write(editor.getText());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("B");
    }
}
class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("A");
    }
}
