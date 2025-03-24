package JComponents;

import javax.swing.*;

public class RadioButton extends JFrame {
    RadioButton(){
        setLayout(null);
        setBounds(600,200,600,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("Gender:");
        label.setBounds(80,110,50,30);
        add(label);

        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");
        r1.setBounds(150,100,70,50);
        r2.setBounds(230,100,90,50);
        add(r1);
        add(r2);


//        r2.setSelected(true);
//        r1.setEnabled(false);

        ButtonGroup gender=new ButtonGroup();
        gender.add(r1);
        gender.add(r2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButton();
    }


}
