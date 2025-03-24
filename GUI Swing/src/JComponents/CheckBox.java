package JComponents;

import javax.swing.*;
import java.awt.*;

public class CheckBox {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox c1=new JCheckBox("ML");
        JCheckBox c2=new JCheckBox("AI");
        JCheckBox c3=new JCheckBox("DL");

        c1.setFocusable(false);
        c2.setFocusable(false);
        c3.setFocusable(false);

        frame.add(c1);
        frame.add(c2);
        frame.add(c3);




        frame.pack();
        frame.setVisible(true);
    }
}
