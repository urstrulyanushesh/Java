package JComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class ComboBox  implements ActionListener {
    JComboBox c1;
    ComboBox(){
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] animals={"Dog","Cat","Bird"};

         c1=new JComboBox(animals);
         c1.addActionListener(this);

//        c1.setEditable(true);//Can write any value
//        System.out.println(c1.getItemCount());//Prints total item
//          c1.addItem("Dinosaur");//To add in ComboBox
//        c1.setSelectedIndex(2);//Already selected in ComboBox
//        c1.removeItem("Cat");
//


        frame.add(c1);
        frame.pack();
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==c1){
            System.out.println(c1.getSelectedItem());
        }

    }

    public static void main(String[] args) {

        new ComboBox();
    }

}
