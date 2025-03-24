package LearnBoderLayout;

import javax.swing.*;
import java.awt.*;

public class BorderCode {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setLayout(new BorderLayout(20,10));
        frame.setSize(500,650);
        frame.setTitle("BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();

        p1.setBackground(Color.black);
        p2.setBackground(Color.blue);
        p3.setBackground(Color.green);
        p4.setBackground(Color.cyan);
        p5.setBackground(Color.pink);

        p1.setPreferredSize(new Dimension(100,50));
        p2.setPreferredSize(new Dimension(80,100));
        p3.setPreferredSize(new Dimension(90,100));
        p4.setPreferredSize(new Dimension(100,70));
        p5.setPreferredSize(new Dimension(100,100));



        frame.add(p1,BorderLayout.NORTH);
        frame.add(p2,BorderLayout.WEST);
        frame.add(p3,BorderLayout.EAST);
        frame.add(p4,BorderLayout.SOUTH);
        frame.add(p5,BorderLayout.CENTER);


        /*
        p5.setLayout(new BorderLayout());//Adding these sub panels in p5
        JPanel p6=new JPanel();
        JPanel p7=new JPanel();
        p6.setBackground(Color.darkGray);
        p7.setBackground(Color.orange);
        p6.setPreferredSize(new Dimension(40,40));
        p7.setPreferredSize(new Dimension(40,40));
        p5.add(p6,BorderLayout.NORTH);
        p5.add(p7,BorderLayout.SOUTH);
        */



    }
}
