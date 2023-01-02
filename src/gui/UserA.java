package gui;

import api.App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class UserA  implements ActionListener {
    private static JButton button1;
    private static JButton button2;
    private static JLabel Welcome;
    private static JButton button6;
    private static JFrame frame = new JFrame();
    void setFrame(JFrame frame)
    {
        this.frame=frame;
    }
    private static String name;
    JFrame getFrame()
    {
        return frame;
    }

    void UserA(String name2)    {

        name=name2;
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
        button1.addActionListener(new UserA());
        panel.add(button1);
        frame.setSize(300, 300);



        button2 = new JButton("Search Hotel");
        button2.setBounds(1, 50, 200, 25);
        button2.addActionListener(new UserA());
        panel.add(button2);
        frame.setSize(300, 300);





        button6 = new JButton("View");
        button6.setBounds(1, 80, 200, 25);
        button6.addActionListener(new UserA());
        panel.add(button6);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        App object = new App();
        if (e.getActionCommand().equals(button1.getText())) {

frame.getContentPane().removeAll();
            frame.setVisible(false);
            Login wow= new Login();
            wow.getFrame().setVisible(true);


        }
        else if (e.getActionCommand().equals(button2.getText()))
        {
            frame.setVisible(false);
           Search nice = new Search();
           nice.Search(name);

        }
        else if (e.getActionCommand().equals(button6.getText()))
        {
            frame.setVisible(false);
            ReviewList test1= new ReviewList();
            try {
                test1.ReviewList(frame,name);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }

    }



}
