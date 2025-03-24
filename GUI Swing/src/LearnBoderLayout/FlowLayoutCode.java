package LearnBoderLayout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutCode {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,40));
        frame.setSize(500,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));


        JPanel panel=new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setPreferredSize(new Dimension(300,100));
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("Click ME"));
        panel.add(new JButton("Edit"));
        frame.add(panel);



        frame.setVisible(true);
    }
}
