package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserB  implements ActionListener {
    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JButton button4;
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

    void UserB(String name2)    {
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
        button1.setBounds(195, 200, 85, 25);
        button1.addActionListener(new UserB());
        panel.add(button1);
        frame.setSize(300, 300);

        frame.setVisible(true);

        button2 = new JButton("Add Hotel");
        button2.setBounds(1, 50, 200, 25);
        button2.addActionListener(new UserB());
        panel.add(button2);
        frame.setSize(300, 300);

        frame.setVisible(true);

        button3 = new JButton("Επεξεργασία καταχώρησης");
        button3.setBounds(1, 80, 200, 25);
        button3.addActionListener(new UserB());
        panel.add(button3);
        frame.setSize(300, 300);

        frame.setVisible(true);

        button4 = new JButton("Διαφραφή καταχώρησης");
        button4.setBounds(1, 110, 200, 25);
        button4.addActionListener(new UserB());
        panel.add(button4);
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
        else if (e.getActionCommand().equals(button2.getText()))
        {
            frame.setVisible(false);
            add qoq= new add();
            qoq.add();
        }
        else if (e.getActionCommand().equals(button3.getText()))
        {
            frame.setVisible(false);
            Login wow= new Login();
            wow.getFrame().setVisible(true);
        }
        else if (e.getActionCommand().equals(button4.getText()))
        {
            frame.setVisible(false);
            Login wow= new Login();
            wow.getFrame().setVisible(true);
        }

    }



}
