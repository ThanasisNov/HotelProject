package gui;

import api.start.App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Login implements ActionListener {
    static String[] functions = {"Προσθήκη καταχώρησης", "Επεξεργασία καταχώρησης", "Διαγραφή καταχώρησης", "Εμφάνιση profile"};

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button1;
    private static JButton button2;
    private static JLabel success;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);
        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
        button1 = new JButton("Login");
        button1.setBounds(10, 80, 80, 25);
        button1.addActionListener(new Login());
        panel.add(button1);
        button2 = new JButton("Clear");
        button2.setBounds(100, 80, 80, 25);
        button2.addActionListener(new Login());
        panel.add(button2);
        frame.setSize(300, 300);
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String pass = passwordText.getText();

        App object = new App();

            if (e.getSource() == button1) {
                if (object.Login(user, pass) == true) {
                    success.setText("Login Successful");
                }
                else
                {
                    success.setText("Wrong username or password");
                }


            } else if (e.getSource() == button2) {

                userText.setText("");
                passwordText.setText("");
            }

    }
}