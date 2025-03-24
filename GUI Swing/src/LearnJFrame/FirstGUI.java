package LearnJFrame;

import javax.swing.*;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(600,650);
        frame.setLocation(500,40);
        frame.setTitle("First GUI Program");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

//        ImageIcon image=new ImageIcon("card.png");
        ImageIcon image=new ImageIcon("Img/arg.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.CYAN);
        frame.getContentPane().setBackground(new Color(12,45,78));
    }
}
