package LearnJMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ShowMenu extends JFrame implements ActionListener {
    JMenuBar menuB;
    JMenu file,edit,help;
    JMenuItem open,save,exit;
    ShowMenu(){
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuB=new JMenuBar();

        file=new JMenu("File");
        edit=new JMenu("Edit");
        help=new JMenu("Help");
        menuB.add(file);
        menuB.add(edit);
        menuB.add(help);

        open=new JMenuItem("Open");
        save=new JMenuItem("Save");
        exit=new JMenuItem("Exit   E");
        file.add(open);
        file.add(save);
        file.add(exit);

        exit.addActionListener(this);
        exit.setMnemonic(KeyEvent.VK_E);

        setJMenuBar(menuB);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ShowMenu();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==exit){
        System.exit(0);
        }
    }

}
