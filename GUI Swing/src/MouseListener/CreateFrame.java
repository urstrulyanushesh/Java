package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CreateFrame extends JFrame implements MouseListener {

    JLabel label;

    CreateFrame(){
        setLayout(null);
        setBounds(500,50,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        label=new JLabel();
        label.setBounds(100,100,70,70);
        label.setOpaque(true);
        label.setBackground(Color.BLACK);
        add(label);
        addMouseListener(this);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed");
        label.setBackground(Color.PINK);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released");
        label.setBackground(Color.RED);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered");
        label.setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exited");
        label.setBackground(Color.BLACK);
    }

    public static void main(String[] args) {
        new CreateFrame();
    }
}
