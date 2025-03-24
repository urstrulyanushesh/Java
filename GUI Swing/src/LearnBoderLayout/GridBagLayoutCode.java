package LearnBoderLayout;
import javax.swing.*;
import java.awt.*;

public class GridBagLayoutCode extends JFrame {

    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Btn 3");
    JButton btn4 = new JButton("Long Button 4");
    JButton btn5 = new JButton("Short 5");

    public GridBagLayoutCode() {
        setTitle("GridBagLayout");
        setBounds(1000, 100, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container c = getContentPane();
        GridBagLayout g = new GridBagLayout();
        c.setLayout(g);

        GridBagConstraints gbc = new GridBagConstraints();


        gbc.weightx=0.6;                    //if container has free space it takes that much space like 0.6 is 60%
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        c.add(btn1, gbc);



        gbc.gridx = 1;
        gbc.gridy = 0;
        c.add(btn2, gbc);


        gbc.gridx = 2;
        gbc.gridy = 0;
        c.add(btn3, gbc);

        gbc.gridwidth=3;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady=40;
        c.add(btn4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipady=0;
        gbc.gridwidth=2;
        gbc.weighty=1;
        gbc.anchor=GridBagConstraints.PAGE_END;//wont give space if the page is ending like  my weighty=1 so it is last it wont take space
        c.add(btn5, gbc);

        pack();
    }

    public static void main(String[] args) {
        new GridBagLayoutCode();
    }
}
