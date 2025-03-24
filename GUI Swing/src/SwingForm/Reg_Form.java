package SwingForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reg_Form extends JFrame implements ActionListener {
    JLabel title;
    JLabel l1,l2,l3,l4,l5,msg;
    JTextField t1,t2;
    JRadioButton male,female;
    JComboBox day,month,year;
    JTextArea a1,display;
    JCheckBox terms;
    JButton submit,clear;



    Reg_Form(){
        setTitle("Registration Form");
        setBounds(400,30,800,850);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        title=new JLabel("REGISTRATION FORM");
        title.setBounds(200,10,400,30);
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        title.setForeground(Color.GREEN);
        add(title);

        l1=new JLabel("Name: ");
        l1.setBounds(50,70,70,30);
        add(l1);
        t1=new JTextField();
        t1.setBounds(180,70,200,30);
        add(t1);

        l2=new JLabel("Guardian's Name: ");
        l2.setBounds(50,110,120,30);
        add(l2);
        t2=new JTextField();
        t2.setBounds(180,110,200,30);
        add(t2);

        l3=new JLabel("Gender:");
        l3.setBounds(50,150,70,30);
        add(l3);
        male=new JRadioButton("Male");
        male.setBounds(180,150,60,30);
        add(male);
        female=new JRadioButton("Female");
        female.setBounds(240,150,80,30);
        add(female);
        ButtonGroup gen=new ButtonGroup();
        gen.add(male);
        gen.add(female);

        l4=new JLabel("Date Of Birth");
        l4.setBounds(50,190,100,30);
        add(l4);

        String[] days = {
                "Day","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        String[] months = {"Month","January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String[] years = {
                "Year","1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969",
                "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979",
                "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
                "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
                "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
                "2020", "2021", "2022", "2023","2024"};

        day=new JComboBox(days);
        month=new JComboBox(months);
        year=new JComboBox(years);
        day.setBounds(180,190,50,30);
        month.setBounds(230,190,90,30);
        year.setBounds(320,190,60,30);
        add(day);
        add(month);
        add(year);

        l5=new JLabel("Address:");
        l5.setBounds(50,250,100,60);
        add(l5);

        a1=new JTextArea();
        a1.setBounds(180,250,200,60);
        add(a1);

        terms=new JCheckBox("Please Accept Terms & Conditions.");
        terms.setBounds(80,360,240,50);
        terms.setFocusable(false);
        add(terms);

        submit=new JButton("Submit");
        clear=new JButton("Clear");
        submit.setBounds(100,440,100,30);
        clear.setBounds(250,440,100,30);
        submit.setFocusable(false);
        clear.setFocusable(false);
        add(submit);
        add(clear);
        submit.addActionListener(this);
        clear.addActionListener(this);

        display=new JTextArea();
        display.setBounds(400,60,380,500);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        add(display);

        msg=new JLabel();
        msg.setBounds(130,500,240,30);
        add(msg);


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
//            if (fname.isEmpty()) {
//                msg.setText("Name field cannot be empty.");
//                display.setText(" ");
//                return;
//            }
            if (fname.isEmpty()) {
               JOptionPane.showMessageDialog(null,"Name Field Cannot Be Empty",
                       "Error",JOptionPane.ERROR_MESSAGE);
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
