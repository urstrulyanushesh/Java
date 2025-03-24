package LearnJOptionPane;

import javax.swing.*;

public class Example {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null,"Chill Boy ","Learn",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Chill Boy ","Learn",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Chill Boy ","Learn",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Chill Boy ","Learn",JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Chill Boy ","Learn",JOptionPane.WARNING_MESSAGE);

//        int ans=JOptionPane.showConfirmDialog(null,"What is your name??","Name",JOptionPane.YES_NO_OPTION);
//        System.out.println(ans);

//        String name=JOptionPane.showInputDialog("What is your name??");
//        System.out.println("Hello Its "+name);

        ImageIcon img=new ImageIcon("Img/java.png");
        String []chose={"Argentina","Brazil","Germany","USA"};
        JOptionPane.showOptionDialog(null,"Countries","WCup",JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,img,chose,0);

    }


}
