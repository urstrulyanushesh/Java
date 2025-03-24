package JColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetColor extends JFrame implements ActionListener {

    JLabel label;
    JButton btn;

    SetColor(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        label=new JLabel();
        label.setText("I am Good");
        label.setFont(new Font("Serif", Font.PLAIN,80));
        add(label);

        btn=new JButton("Pick A Color");
        btn.addActionListener(this);
        add(btn);




    pack();
    setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==btn){
        Color getClr=JColorChooser.showDialog(null,"Pick a Color",Color.BLACK);
        label.setForeground(getClr);
    }
    }


    public static void main(String[] args) {
        new SetColor();
    }
}
