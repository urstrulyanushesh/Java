package JComponents;

import javax.swing.*;

public class TextArea {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setLayout(null);
        frame.setBounds(600,200,600,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea area=new JTextArea();
        area.setBounds(100,100,270,150);
        frame.add(area);
        area.setLineWrap(true);
        frame.setVisible(true);
    }

}
