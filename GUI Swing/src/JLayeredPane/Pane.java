package JLayeredPane;

import javax.swing.*;
import java.awt.*;

public class Pane {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setBounds(400,100,600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1=new JLabel();
        JLabel l2=new JLabel();
        JLabel l3=new JLabel();

        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);

        l1.setOpaque(true);
        l2.setOpaque(true);
        l3.setOpaque(true);


        l1.setBounds(40,40,100,100);
        l2.setBounds(60,60,100,100);
        l3.setBounds(80,80,100,100);

        l1.setBackground(Color.BLACK);
        l2.setBackground(Color.GREEN);
        l3.setBackground(Color.PINK);

        JLayeredPane pane=new JLayeredPane();
        pane.setBounds(100,150,300,300);
//        pane.add(l1);
//        pane.add(l2);
//        pane.add(l3);


// OR
//        pane.add(l3,JLayeredPane.DRAG_LAYER);
//        pane.add(l1,JLayeredPane.DEFAULT_LAYER);
//        pane.add(l2,JLayeredPane.MODAL_LAYER);


//OR
        pane.add(l1,Integer.valueOf(1));
        pane.add(l2,Integer.valueOf(2));
        pane.add(l3,Integer.valueOf(0));


        frame.add(pane);
        frame.setVisible(true);
    }
}
