package LearnJPanel;

import javax.swing.*;
import java.awt.*;

public class LearnPanel {
    public static void main(String[] args) {
        ImageIcon img=new ImageIcon("Img/java.png");


        JLabel label=new JLabel();
        label.setText("Java");
        label.setIcon(img);
        /*       label.setVerticalAlignment(JLabel.CENTER);
        */        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(120,50,180,100);





        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,200,300);
//        redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);

        JPanel bluePanel=new JPanel();
        bluePanel.setBounds(200,0,200,300);
        bluePanel.setBackground(Color.blue);
        bluePanel.setLayout(null);

        JPanel yellowPanel=new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(0,300,400,300);
        yellowPanel.setLayout(null);



        JFrame frame=new JFrame();
        frame.setBounds(500,40,800,650);
        frame.setTitle("JFrame in Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(yellowPanel);
        yellowPanel.add(label);
    }
}
