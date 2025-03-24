package LearnJFrame;

import javax.swing.*;
import java.awt.*;

public class UsingConstructorObj extends JFrame {

    UsingConstructorObj(){
        this.setSize(600,650);
        this.setTitle("First GUI Program");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

//        ImageIcon image=new ImageIcon("card.png");
        ImageIcon image=new ImageIcon("Img/arg.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.CYAN);
        this.getContentPane().setBackground(new Color(12,45,78));
    }
}
