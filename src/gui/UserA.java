package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserA implements ActionListener {

    private static JButton button1;
    private static JLabel Welcome;


    private static JFrame frame = new JFrame();
    void setFrame(JFrame frame)
    {
        this.frame=frame;
    }
    JFrame getFrame()
    {
        return frame;
    }

    void UserA( String name2 )    {
        setFrame(frame);
        JPanel panel = new JPanel();
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);
        Welcome = new JLabel("Hi "+name2+"!");
       Welcome.setBounds(10, 20, 100, 25);
        panel.add(Welcome);



        frame.setSize(300, 300);

        button1 = new JButton("Log out");
        button1.setBounds(195, 80, 85, 25);
        button1.addActionListener(new UserA());
        panel.add(button1);
        frame.setSize(300, 300);

        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getActionCommand().equals(button1.getText())) {


            frame.setVisible(false);
            Login wow= new Login();
            wow.getFrame().setVisible(true);


        }
    }
}
