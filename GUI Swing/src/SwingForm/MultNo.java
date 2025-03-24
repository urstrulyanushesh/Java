package SwingForm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultNo {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Multiplication App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Create components
        JLabel label1 = new JLabel("Enter first number:");
        JTextField textField1 = new JTextField(10);

        JLabel label2 = new JLabel("Enter second number:");
        JTextField textField2 = new JTextField(10);

        JLabel labelResult = new JLabel("Result:");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);  // Make result field non-editable

        JButton okButton = new JButton("OK");
        JButton exitButton = new JButton("Exit");

        // Add components to the panel
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(labelResult);
        panel.add(resultField);
        panel.add(okButton);
        panel.add(exitButton);

        // Add panel to the frame
        frame.add(panel);

        // Action for OK button
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the numbers from the text fields
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());

                    // Perform multiplication
                    double result = num1 * num2;

                    // Display result in the result field
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Action for Exit button
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  // Terminate the program
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}

