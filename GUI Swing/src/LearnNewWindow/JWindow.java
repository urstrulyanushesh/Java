package LearnNewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JWindow implements ActionListener {
    JFrame frame=new JFrame();
    JButton button=new JButton("New Window");
    JWindow(){

        button.setBounds(100,100,150,70);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

        frame.setBounds(500,300,400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=frame.getContentPane();
        c.setBackground(Color.black);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new JWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose();
            new NewWindow();
        }

    }
}
