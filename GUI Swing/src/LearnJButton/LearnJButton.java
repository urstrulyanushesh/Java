package LearnJButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearnJButton extends JFrame
        implements ActionListener
{

    JButton button;
    JLabel label;


    LearnJButton(){

        ImageIcon img=new ImageIcon("Img/java.png");
        ImageIcon icon=new ImageIcon("Img/java.png");

        label=new JLabel();
        label.setIcon(icon);
        label.setBounds(150,180,300,400);
        label.setVisible(false);



        button=new JButton();
        button.setBounds(150,0,260,170);
        button.setText("Java Button");
        button.addActionListener(this);
        button.setFocusable(false);//Removes Button Line


//        button.addActionListener(e -> System.out.println("Pressed"));//Lambda Expression
//        button.addActionListener(e -> label.setVisible(true) );//Lambda Expression

        button.setIcon(img);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setForeground(new Color(250,20,60));
        button.setBackground(Color.CYAN);
        button.setBorder(BorderFactory.createLineBorder(Color.MAGENTA,5));
//        button.setEnabled(false);//Button Stopped




        this.setBounds(400,100,600,650);
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }
public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("Pressed");
            label.setVisible(true);
        }
}
}
