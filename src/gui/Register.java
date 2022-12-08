package gui;

import api.App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class  Register implements ActionListener {


    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JLabel nameLabel;
    private static JTextField nameText;
    private static JLabel surnameLabel;
    private static JTextField surnameText;
    private static JLabel AccountLabel;
    private static JTextField AccountText;

    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JLabel success;
    private static JFrame frame = new JFrame();

    void setFrame(JFrame frame)
    {
        this.frame=frame;
    }


    void Register()
    {

       setFrame(frame);
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

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(10, 80, 80, 25);
        panel.add(nameLabel);
        nameText = new JTextField();
        nameText.setBounds(100, 80, 165, 25);
        panel.add(nameText);


        surnameLabel = new JLabel("Surname");
       surnameLabel.setBounds(10, 110, 80, 25);
        panel.add(surnameLabel);
        surnameText = new JTextField();
        surnameText.setBounds(100, 110, 165, 25);
        panel.add(surnameText);


        AccountLabel = new JLabel("Type(A or B)");
        AccountLabel.setBounds(10, 140, 80, 25);
        panel.add(AccountLabel);
        AccountText = new JTextField();
        AccountText.setBounds(100, 140, 165, 25);
        panel.add(AccountText);



        button1 = new JButton("Register");
        button1.setBounds(10, 170, 85, 25);
        button1.addActionListener(new Register());
        panel.add(button1);
        button2 = new JButton("Clear");
        button2.setBounds(100, 170, 80, 25);
        button2.addActionListener(new Register());
        panel.add(button2);
        button3= new JButton("Back");
        button3.setBounds(185, 170, 85, 25);
        button3.addActionListener(new Register());
        panel.add(button3);
        frame.setSize(300, 300);
        success = new JLabel("");
        success.setBounds(10, 200, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String user =  userText.getText();
        String pass = passwordText.getText();
        String name = nameText.getText();
        String  surname = surnameText.getText();
        String Type = AccountText.getText();
        App object = new App();

        if (e.getActionCommand().equals(button1.getText())) {
            try {

               if(object.Register(user,pass,name,surname,Type)) {
                   success.setText("Register Successful");
               }
               else
               {

                   success.setText("Mistake found either in name or type!");

               }

            } catch (IOException ex) {
                System.out.println("Error!");
            }

        }
        else if (e.getActionCommand().equals(button2.getText())) {

            userText.setText("");
            passwordText.setText("");
            nameText.setText("");
            surnameText.setText("");
            AccountText.setText("");
            success.setText("");
        }
        else if(e.getActionCommand().equals(button3.getText()))
        {

            userText.setText("");
            passwordText.setText("");
            nameText.setText("");
            surnameText.setText("");
            AccountText.setText("");
            frame.setVisible(false);
            frame.getContentPane().removeAll();
            Login wow= new Login();
            wow.getFrame().setVisible(true);



        }

    }
}