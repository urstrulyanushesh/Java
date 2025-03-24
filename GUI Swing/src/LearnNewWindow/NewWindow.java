package LearnNewWindow;

import javax.swing.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Welcome");

    NewWindow() {

        label.setBounds(100, 100, 150, 70);
        frame.add(label);

        frame.setBounds(0, 0, 400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }
}
