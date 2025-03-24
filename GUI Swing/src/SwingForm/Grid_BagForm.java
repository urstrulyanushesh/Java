package SwingForm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid_BagForm extends JFrame implements ActionListener {
    JLabel title;
    JLabel l1, l2, l3, l4, l5, msg;
    JTextField t1, t2;
    JRadioButton male, female;
    JComboBox<String> day, month, year;
    JTextArea a1, display;
    JCheckBox terms;
    JButton submit, clear;

    Grid_BagForm() {
        setTitle("Registration Form");
        setBounds(400, 30, 800, 850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        title = new JLabel("REGISTRATION FORM");
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setForeground(Color.GREEN);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 0, 20, 0);
        add(title, gbc);

        l1 = new JLabel("Name: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(l1, gbc);
        t1 = new JTextField(15);
        gbc.gridx = 1;
        add(t1, gbc);

        l2 = new JLabel("Guardian's Name: ");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(l2, gbc);
        t2 = new JTextField(15);
        gbc.gridx = 1;
        add(t2, gbc);

        l3 = new JLabel("Gender:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(l3, gbc);
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);
        gbc.gridx = 1;
        gbc.gridwidth = 1;
        add(male, gbc);
        gbc.gridx = 2;
        add(female, gbc);

        l4 = new JLabel("Date Of Birth");
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(l4, gbc);

        String[] days = {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        String[] months = {"Month", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String[] years = {"Year", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969",
                "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979",
                "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
                "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
                "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
                "2020", "2021", "2022", "2023", "2024"};

        day = new JComboBox<>(days);
        month = new JComboBox<>(months);
        year = new JComboBox<>(years);
        gbc.gridx = 1;
        gbc.gridwidth = 1;
        add(day, gbc);
        gbc.gridx = 2;
        add(month, gbc);
        gbc.gridx = 3;
        add(year, gbc);

        l5 = new JLabel("Address:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(l5, gbc);
        a1 = new JTextArea(3, 15);
        gbc.gridx = 1;
        gbc.gridwidth = 3;
        add(a1, gbc);

        terms = new JCheckBox("Please Accept Terms & Conditions.");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 4;
        add(terms, gbc);

        submit = new JButton("Submit");
        clear = new JButton("Clear");
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(20, 5, 5, 5);
        add(submit, gbc);
        gbc.gridx = 1;
        add(clear, gbc);
        submit.addActionListener(this);
        clear.addActionListener(this);

        display = new JTextArea();
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 4;
        add(display, gbc);

        msg = new JLabel();
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 4;
        add(msg, gbc);

        getContentPane().setBackground(new Color(224, 224, 224));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String fname = t1.getText().trim();
            String gName = t2.getText().trim();
            String add = a1.getText().trim();

            // Validation for the Name field
            if (fname.isEmpty()) {
                msg.setText("Name field cannot be empty.");
                display.setText(" ");
                return;
            }

            // Validation for Guardian's Name field
            if (gName.isEmpty()) {
                msg.setText("Guardian's Name cannot be empty.");
                display.setText(" ");
                return;
            }

            // Validation for Gender
            if (!male.isSelected() && !female.isSelected()) {
                msg.setText("Please select a gender.");
                display.setText(" ");
                return;
            }

            // Validation for Date of Birth
            if (day.getSelectedIndex() == 0 || month.getSelectedIndex() == 0 || year.getSelectedIndex() == 0) {
                msg.setText("Please select a valid date of birth.");
                display.setText(" ");
                return;
            }

            // Validation for Address
            if (add.isEmpty()) {
                msg.setText("Address field cannot be empty.");
                display.setText(" ");
                return;
            }

            // Check if terms are accepted
            if (!terms.isSelected()) {
                msg.setText("Please accept Terms & Conditions.");
                display.setText(" ");
                return;
            }

            // If all validations pass, display the information
            String Dob = day.getSelectedItem() + "/" + month.getSelectedItem() + "/" + year.getSelectedItem();
            String gen = male.isSelected() ? "Male" : "Female";

            display.setText("Name: " + fname + "\n\n" +
                    "Guardian Name: " + gName + "\n\n" +
                    "Gender: " + gen + "\n\n" +
                    "Date Of Birth: " + Dob + "\n\n" +
                    "Address: " + add);

            msg.setText("Registration Successful.");
        }

        if (e.getSource() == clear) {
            // Reset all fields
            t1.setText(""); // Clear the name field
            t2.setText(""); // Clear the guardian's name field
            a1.setText(""); // Clear the address field
            day.setSelectedIndex(0); // Reset day
            month.setSelectedIndex(0); // Reset month
            year.setSelectedIndex(0); // Reset year
            male.setSelected(false); // Reset gender selection
            female.setSelected(false); // Reset gender selection
            terms.setSelected(false); // Uncheck terms
            display.setText(" ");
            msg.setText(""); // Clear message
        }
    }

    public static void main(String[] args) {
        new Reg_Form();
    }
}
