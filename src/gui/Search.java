package gui;

import api.start.App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class  Search implements ActionListener {




    private static JLabel nameLabel;
    private static JTextField nameText;
    private static JLabel typeLabel;
    private static JTextField typeText;
    private static JLabel locationLabel;
    private static JTextField locationText;
    private static JLabel facilitiesLabel;
    private static JTextField facilitiesText;
    private static JLabel viewLabel;
    private static JTextField viewText;
    private static JLabel bathroomLabel;
    private static JTextField bathroomText;
    private static JLabel washLabel;
    private static JTextField washText;
    private static JLabel enLabel;
    private static JTextField enText;
    private static JLabel heatLabel;
    private static JTextField heatText;
    private static JLabel WifiLabel;
    private static JTextField WifiText;
    private static JLabel areaLabel;
    private static JTextField areaText;
    private static JLabel outsideLabel;
    private static JTextField outsideText;
    private static JLabel parkingLabel;
    private static JTextField  parkingText;
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
        frame.setMinimumSize(new Dimension(400,500));
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
       typeText = new JTextField();
        typeText.setBounds(100, 50, 165, 25);
        panel.add(typeText);

        locationLabel = new JLabel("Location");
        locationLabel.setBounds(10, 80, 80, 25);
        panel.add(locationLabel);
        locationText = new JTextField();
        locationText.setBounds(100, 80, 165, 25);
        panel.add(locationText);



        viewLabel = new JLabel("View");
        viewLabel.setBounds(10, 110, 80, 25);
        panel.add(viewLabel);
        viewText = new JTextField();
        viewText.setBounds(100, 110, 165, 25);
        panel.add(viewText);
        bathroomLabel = new JLabel("Bathroom");
        bathroomLabel.setBounds(10, 140, 80, 25);
        panel.add(bathroomLabel);
        bathroomText = new JTextField();
        bathroomText.setBounds(100, 140, 165, 25);
        panel.add(bathroomText);

        washLabel = new JLabel("Wash Clothes");
       washLabel.setBounds(10, 170, 80, 25);
        panel.add(washLabel);
        washText = new JTextField();
        washText.setBounds(100, 170, 165, 25);
        panel.add(washText);

        enLabel = new JLabel("Entertainment");
        enLabel.setBounds(10, 200, 80, 25);
        panel.add(enLabel);
        enText = new JTextField();
        enText.setBounds(100, 200, 165, 25);
        panel.add(enText);

        heatLabel = new JLabel("Heat");
        heatLabel.setBounds(10, 230, 80, 25);
        panel.add(heatLabel);
        heatText = new JTextField();
        heatText.setBounds(100, 230, 165, 25);
        panel.add(heatText);


        WifiLabel = new JLabel("Wifi");
        WifiLabel.setBounds(10, 260, 80, 25);
        panel.add(   WifiLabel);
        WifiText = new JTextField();
        WifiText.setBounds(100, 260, 165, 25);
        panel.add(WifiText);

        areaLabel = new JLabel("Kitchen-Bath");
        areaLabel.setBounds(10, 290, 150, 25);
        panel.add(     areaLabel);
        areaText = new JTextField();
        areaText.setBounds(100  , 290, 165, 25);
        panel.add( areaText);
        outsideLabel = new JLabel("Outside");
        outsideLabel .setBounds(10, 320, 110, 25);
        panel.add(     outsideLabel );
        outsideText = new JTextField();
        outsideText.setBounds(100, 320, 165, 25);
        panel.add(   outsideText);
        parkingLabel = new JLabel("Parking");
        parkingLabel .setBounds(10, 350, 110, 25);
        panel.add(     parkingLabel );
        parkingText = new JTextField();
        parkingText .setBounds(100, 350, 165, 25);
        panel.add(   parkingText );


        button1 = new JButton("Search");
        button1.setBounds(10, 390, 85, 25);
        button1.addActionListener(new Search());
        panel.add(button1);
        button2 = new JButton("Clear");
        button2.setBounds(100, 390, 80, 25);
        button2.addActionListener(new Search());
        panel.add(button2);
        button3= new JButton("Back");
        button3.setBounds(185, 390, 85, 25);
        button3.addActionListener(new Search());
        panel.add(button3);
        frame.setSize(300, 300);
        success = new JLabel("");
        success.setBounds(10, 395, 300, 25);
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
       String view=viewText.getText();
       String Wifi= WifiText.getText();
       String parking=parkingText.getText();
       String bathroom=bathroomText.getText();
       String area= areaText.getText();
       String wash=washText.getText();
       String en=enText.getText();
       String heat=heatText.getText();
       String outside=outsideText.getText();
        App object = new App();
        if (e.getActionCommand().equals(button1.getText())) {
HotelList test= new HotelList();
            ArrayList<String>temp=object.Search(name,type,location,view,bathroom,wash,en,heat,Wifi,area,outside,parking);

            frame.setVisible(false);
            frame.getContentPane().removeAll();

test.HotelList(temp,object.getfound());

        }
        else if (e.getActionCommand().equals(button2.getText())) {


            nameText.setText("");
           typeText.setText("");
            locationText.setText("");
            viewText.setText("");
            WifiText.setText("");
          parkingText.setText("");
            bathroomText.setText("");
            areaText.setText("");
            washText.setText("");
            enText.setText("");
            heatText.setText("");
            outsideText.setText("");
            success.setText("");

        }
        else if(e.getActionCommand().equals(button3.getText()))
        {
            getNameText().setText("");
            typeText.setText("");
            locationText.setText("");

            viewText.setText("");
            WifiText.setText("");
            parkingText.setText("");
            bathroomText.setText("");
            areaText.setText("");
            washText.setText("");
            enText.setText("");
            heatText.setText("");
            outsideText.setText("");
            success.setText("");
            frame.setVisible(false);
            frame.getContentPane().removeAll();
            UserA wow= new UserA();
            wow.getFrame().setVisible(true);


        }

    }
}