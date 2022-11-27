package gui;

import api.start.App;
import api.start.room;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class  add implements ActionListener {


    private static JLabel HotelName;
    private static JTextField HNText;
    private static JLabel type;
    private static JTextField typeText;
    private static JLabel location;
    private static JTextField locText;
    private static JLabel description;
    private static JTextField descriptionText;
    private static JLabel view;
    private static JTextField viewText;
    private static JLabel bathroom;
    private static JTextField bathroomText;
    private static JLabel clothingWash;
    private static JTextField clothingWashText;
    private static JLabel entertainment;
    private static JTextField entertainmentText;
    private static JLabel heat;
    private static JTextField heatText;
    private static JLabel wifi;
    private static JTextField wifiText;
    private static JLabel kitchen;
    private static JTextField kitchenText;
    private static JLabel outside;
    private static JTextField outsideText;
    private static JLabel parking;
    private static JTextField parkingText;

    private static JTextField username;


    private static JButton button1;
    private static JButton button2;
    private static JButton button3;
    private static JLabel success;

    Login l = new Login();

    private static JFrame frame = new JFrame();
    void setFrame(JFrame frame)
    {
        this.frame=frame;
    }
    JFrame getFrame()
    {
        return frame;
    }

    void add(String name)    {
        setFrame(frame);
        JPanel panel = new JPanel();
        frame.setMinimumSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        username = new JTextField();
        username.setText(name);

        frame.add(panel);
        panel.setLayout(null);
        HotelName = new JLabel("Name*");
        HotelName.setBounds(10, 20, 80, 25);
        panel.add(HotelName);
        HNText = new JTextField();
        HNText.setBounds(100, 20, 165, 25);
        panel.add(HNText);

        type = new JLabel("Type*");
        type.setBounds(10, 50, 80, 25);
        panel.add(type);
        typeText = new JTextField();
        typeText.setBounds(100, 50, 165, 25);

        panel.add(typeText);

        location = new JLabel("Location*");
        location.setBounds(10, 80, 80, 25);
        panel.add(location);
        locText = new JTextField();
        locText.setBounds(100, 80, 165, 25);

        panel.add(locText);

        description = new JLabel("Description*");
        description.setBounds(10, 110, 150, 25);
        panel.add(description);
        descriptionText = new JTextField();
        descriptionText.setBounds(100, 110, 190, 25);

        panel.add(descriptionText);

        view = new JLabel("View");
        view.setBounds(10, 140, 80, 25);
        panel.add(view);
        viewText = new JTextField();
        viewText.setBounds(100, 140, 165, 25);
        panel.add(viewText);

        bathroom = new JLabel("Bathroom");
        bathroom.setBounds(10, 170, 80, 25);
        panel.add(bathroom);
        bathroomText = new JTextField();
        bathroomText.setBounds(100, 170, 165, 25);
        panel.add(bathroomText);

        clothingWash = new JLabel("Clothing Wash");
        clothingWash.setBounds(10, 200, 160, 25);
        panel.add(clothingWash);
        clothingWashText = new JTextField();
        clothingWashText.setBounds(100, 200, 165, 25);
        panel.add(clothingWashText);

        entertainment = new JLabel("Entertainment");
        entertainment.setBounds(10, 230, 80, 25);
        panel.add(entertainment);
        entertainmentText = new JTextField();
        entertainmentText.setBounds(100, 230, 165, 25);
        panel.add(entertainmentText);

        heat = new JLabel("Heat");
        heat.setBounds(10, 260, 80, 25);
        panel.add(heat);
        heatText = new JTextField();
        heatText.setBounds(100, 260, 165, 25);
        panel.add(heatText);

        wifi = new JLabel("Wifi");
        wifi.setBounds(10, 290, 80, 25);
        panel.add(wifi);
        wifiText = new JTextField();
        wifiText.setBounds(100, 290, 165, 25);
        panel.add(wifiText);

        kitchen = new JLabel("Kitchen");
        kitchen.setBounds(10, 320, 80, 25);
        panel.add(kitchen);
        kitchenText = new JTextField();
        kitchenText.setBounds(100, 320, 165, 25);
        panel.add(kitchenText);

        outside = new JLabel("Outside");
        outside.setBounds(10, 350, 80, 25);
        panel.add(outside);
        outsideText = new JTextField();
        outsideText.setBounds(100, 350, 165, 25);
        panel.add(outsideText);

        parking = new JLabel("Parking");
        parking.setBounds(10, 380, 80, 25);
        panel.add(parking);
        parkingText = new JTextField();
        parkingText.setBounds(100, 380, 165, 25);
        panel.add(parkingText);



        button1 = new JButton("Submit");
        button1.setBounds(10, 410, 80, 25);
        button1.addActionListener(new add());
        panel.add(button1);
        button2 = new JButton("Clear");
        button2.setBounds(195, 410, 85, 25);
        button2.addActionListener(new add());
        panel.add(button2);
        button3= new JButton("Back");
        button3.setBounds(100, 410, 85, 25);
        button3.addActionListener(new add());
        panel.add(button3);
        frame.setSize(300, 300);
        success = new JLabel("");
        success.setBounds(110, 490, 300, 25);
        panel.add(success);
        frame.setVisible(true);

    }
    String name ;
    String loc ;
    String des ;
    String tp;


    void setHotelName(JTextField HNText)
    {
        name=HNText.getText();

    }
    void setType(JTextField typeText)
    {
        tp=typeText.getText();

    }
    void setLocation(JTextField locText)
    {
        loc=locText.getText();
    }
    void setDescription(JTextField descriptionText)
    {
        des=descriptionText.getText();
    }



    JTextField getHNText() {return  HNText;}
    JTextField getTypeText() {return typeText;}
    JTextField getLocText(){return locText;}
    JTextField getDescriptionText(){return descriptionText;}





    @Override
    public void actionPerformed(ActionEvent e) {

        App object = new App();
        room fac = new room();
        setHotelName(HNText);
        setType(typeText);
        setLocation(locText);
        setDescription(descriptionText);
        fac.setView(viewText.getText());
        fac.setBathroom(bathroomText.getText());
        fac.setClothes(clothingWashText.getText());
        fac.setEntertainment(entertainmentText.getText());
        fac.setHeat(heatText.getText());
        fac.setWifi(wifiText.getText());
        fac.setKitchen(kitchenText.getText());
        fac.setOutside(outsideText.getText());
        fac.setParking(parkingText.getText());


        if (e.getActionCommand().equals(button1.getText())) {

            try {
                if (HNText.getText().isEmpty() || typeText.getText().isEmpty() || locText.getText().isEmpty() ||descriptionText.getText().isEmpty() ) {
                    success.setText("Please fill all the required (*) fields");
                }
                else
                {
                  object.add(HNText.getText(),typeText.getText(),locText.getText(),descriptionText.getText(),fac,username.getText());
                  success.setText("Add successful");
                }

            } catch (IOException ex) {
                System.out.println("Error!");
            }


        }
        else if (e.getActionCommand().equals(button2.getText()))
        {
            HNText.setText("");
            typeText.setText("");
            locText.setText("");
            descriptionText.setText("");
            viewText.setText("");
            bathroomText.setText("");
            clothingWashText.setText("");
            entertainmentText.setText("");
            heatText.setText("");
            wifiText.setText("");
            kitchenText.setText("");
            outsideText.setText("");
            parkingText.setText("");

        }
        else if(e.getActionCommand().equals(button3.getText()))
        {
            frame.getContentPane().removeAll();
            UserB wow= new UserB();
            wow.getFrame().setVisible(true);
        }


    }
}