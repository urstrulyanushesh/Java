package JComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame implements ActionListener {

    JTextField text;
    JButton btn;
    JPasswordField pass;
    JLabel l1, l2;

    TextField() {
        this.setBounds(600, 250, 500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);


        l1 = new JLabel("UserName:");
        l1.setBounds(10, 30, 160, 30); // Set bounds for username label
        l1.setFont(new Font("Consolas", Font.PLAIN, 20));
        this.add(l1);

        text = new JTextField();
        text.setBounds(120, 30, 250, 30); // Adjusted width for better alignment
        text.setFont(new Font("Consolas", Font.PLAIN, 20));
        text.setForeground(Color.MAGENTA);
        text.setBackground(Color.DARK_GRAY);
        text.setCaretColor(Color.WHITE);
        text.setText("Enter Name");
        this.add(text);

        l2 = new JLabel("Password:");
        l2.setBounds(10, 70, 160, 30); // Correctly set bounds for password label
        l2.setFont(new Font("Consolas", Font.PLAIN, 20));
        this.add(l2);

        pass = new JPasswordField();
        pass.setBounds(120, 70, 250, 30); // Adjusted width for better alignment
        pass.setFont(new Font("Consolas", Font.PLAIN, 20));
        pass.setEchoChar('*');
        this.add(pass);

        btn = new JButton("LogIn");
        btn.setBounds(150, 110, 100, 30);
        btn.addActionListener(this);
        btn.setBackground(Color.pink);
        this.add(btn);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            System.out.println("Name = " + text.getText());
            System.out.println("Password = " + pass.getText());

            // Disable the text field and button after submission
            text.setEditable(false);
            btn.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        new TextField();
    }
}
