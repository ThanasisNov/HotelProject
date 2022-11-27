package gui;

import api.start.App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Login implements ActionListener {


    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JLabel success;


    private static JFrame frame = new JFrame();
 void setFrame(JFrame frame)
 {
     this.frame=frame;
 }
    JFrame getFrame()
    {
        return frame;
    }

    void Login()    {
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

        button1 = new JButton("Login");
        button1.setBounds(10, 80, 80, 25);
        button1.addActionListener(new Login());
        panel.add(button1);
        button2 = new JButton("Register");
        button2.setBounds(100, 80, 85, 25);
        button2.addActionListener(new Login());
        panel.add(button2);
        frame.setSize(300, 300);
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        button3 = new JButton("Clear");
        button3.setBounds(195, 80, 85, 25);
        button3.addActionListener(new Login());
        panel.add(button3);
        frame.setSize(300, 300);
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        frame.setVisible(true);

    }
    String user ;
    String pass ;
void setUser(JTextField userText)
{
    user=userText.getText();

}
    void setPass(JTextField userText)
    {
        pass=passwordText.getText();

    }
    void resetUserText()
    {
        userText.setText("");
    }
    void resetPassText()
    {
        passwordText.setText("");
    }
    JTextField getUserText()
    {
        return  userText;
    }
    JPasswordField getPasswordText()
    {
        return passwordText;
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        App object = new App();

            if (e.getActionCommand().equals(button1.getText())) {
                setUser(userText);
                setPass(passwordText);
                if (object.Login(user, pass) == true) {
                    getUserText().setText("");
                    getPasswordText().setText("");
                    getFrame().setVisible(false);
                    if(object.Type(user).trim().equals("A"))
                    {
                        UserA normal= new UserA();
                            normal.UserA(user);
                    }
                    else
                    {
                 UserB special = new UserB();
                 special.UserB(user);
                    }


                }
                else
                {

                    success.setText("Wrong username or password");
                }


            } else if (e.getActionCommand().equals(button2.getText())) {
                getUserText().setText("");
                getPasswordText().setText("");

               getFrame().setVisible(false);
               Register wow= new Register();
                wow.Register();



            }
            else if (e.getActionCommand().equals(button3.getText()))
            {
                getUserText().setText("");
                getPasswordText().setText("");

            }


    }
}