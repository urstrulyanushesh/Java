package LearnJLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LabelTurn {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
//        frame.setBounds(500,40,800,650);
        frame.setTitle("JLabel in Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);


        ImageIcon img=new ImageIcon("Img/computer-clip-art-15.jpg");
        Border border= BorderFactory.createLineBorder(Color.PINK,5);

        JLabel label=new JLabel();
        label.setText("I am learning JLabel");
        label.setIcon(img);
        frame.add(label);
        label.setHorizontalTextPosition(JLabel.CENTER);
       label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(120,255,228));
        label.setFont(new Font("MV Boli",Font.PLAIN,34));
      label.setIconTextGap(50);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(0,0,600,650);  //To use this uncomment setLayout and framesetbounds


        frame.pack();  //To use this comment labelSetBounds and FrameSetBound and Layouts


        frame.setVisible(true);
    }
}
