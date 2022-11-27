package gui;

import api.start.App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Search implements ActionListener {




    private static JLabel nameLabel;
    private static JTextField nameText;
    private static JLabel surnameLabel;
    private static JTextField surnameText;

    private static JLabel typeLabel;
    private static JTextField typeText;
    private static JLabel locationLabel;
    private static JTextField locationText;
    private static JLabel facilitiesLabel;
    private static JTextField facilitiesText;

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

    void Search()
    {

        setFrame(frame);
        JPanel panel = new JPanel();
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);
        nameLabel = new JLabel("Name");
        nameLabel.setBounds(10, 20, 80, 25);
        panel.add(nameLabel);
        nameText = new JTextField();
        nameText.setBounds(100, 20, 165, 25);
        panel.add(nameText);

      typeLabel = new JLabel("Type");
        typeLabel.setBounds(10, 50, 80, 25);
        panel.add(typeLabel);
       typeText = new JPasswordField();
        typeText.setBounds(100, 50, 165, 25);
        panel.add(typeText);

        locationLabel = new JLabel("Location");
        locationLabel.setBounds(10, 80, 80, 25);
        panel.add(locationLabel);
        locationText = new JTextField();
        locationText.setBounds(100, 80, 165, 25);
        panel.add(locationText);


        facilitiesLabel = new JLabel("Facilities");
        facilitiesLabel.setBounds(10, 110, 80, 25);
        panel.add(facilitiesLabel);
        facilitiesText = new JTextField();
        facilitiesText.setBounds(100, 110, 165, 25);
        panel.add(facilitiesText);



        button1 = new JButton("Search");
        button1.setBounds(10, 170, 85, 25);
        button1.addActionListener(new Search());
        panel.add(button1);
        button2 = new JButton("Clear");
        button2.setBounds(100, 170, 80, 25);
        button2.addActionListener(new Search());
        panel.add(button2);
        button3= new JButton("Back");
        button3.setBounds(185, 170, 85, 25);
        button3.addActionListener(new Search());
        panel.add(button3);
        frame.setSize(300, 300);
        success = new JLabel("");
        success.setBounds(10, 200, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }
    JTextField getNameText()
    {
        return  nameText;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       String name =  nameText.getText();
        String type = typeText.getText();
        String location = locationText.getText();
        String  facilities = facilitiesText.getText();
        App object = new App();
        if (e.getActionCommand().equals(button1.getText())) {

        }
        else if (e.getActionCommand().equals(button2.getText())) {


            getNameText().setText("");
            typeText.setText("");
            locationText.setText("");
            facilitiesText.setText("");
            success.setText("");
        }
        else if(e.getActionCommand().equals(button3.getText()))
        {

           getNameText().setText("");
            typeText.setText("");
            locationText.setText("");
            facilitiesText.setText("");
            frame.setVisible(false);
            UserA wow= new UserA();
            wow.getFrame().setVisible(true);


        }

    }
}