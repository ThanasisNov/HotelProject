package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class  ViewUserA implements ActionListener {




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
    private static JButton button4;
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

    void ViewUserA(String hotels,int lineNumber) throws IOException {
        String realname="";
        String tempUsername = "";
        String tempType = "";
        String temploc="";
        String tempview="";
        String tempWifi="" ;
        String tempparking="";
        String tempbathroom="";
        String temparea="" ;
        String tempwash="";
        String tempen="";
        String tempheat="";
        String tempoutside="";

        String line;
        try (Stream<String> lines = Files.lines(Paths.get("AddBase.txt"))) {
            line = lines.skip(lineNumber).findFirst().get();
        }
        Scanner check= new Scanner(line);

        check.useDelimiter("[,\n]");
        while (check.hasNext() )
        {
            realname=check.next();
            tempUsername = check.next();
            tempType = check.next();
            temploc=check.next();
            String tempde=check.next();
            tempview=check.next();
            tempbathroom=check.next();
            tempwash=check.next();
            tempen=check.next();
            tempheat=check.next();
            tempWifi=check.next();
            temparea=check.next();
            tempoutside=check.next();
            tempparking=check.next();
        }
            setFrame(frame);
        JPanel panel = new JPanel();
        frame.setMinimumSize(new Dimension(400,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);
        nameLabel = new JLabel("Hotel:"+tempUsername);
        nameLabel.setBounds(10, 20, 300, 25);
        panel.add(nameLabel);
        typeLabel = new JLabel("Type:"+tempType);
        typeLabel.setBounds(10, 50, 300, 25);
        panel.add(typeLabel);


        locationLabel = new JLabel("Location:"+temploc);
        locationLabel.setBounds(10, 80, 300, 25);
        panel.add(locationLabel);




        viewLabel = new JLabel("View:"+tempview);
        viewLabel.setBounds(10, 110, 300, 25);
        panel.add(viewLabel);

        bathroomLabel = new JLabel("Bathroom:"+tempbathroom);
        bathroomLabel.setBounds(10, 140, 300, 25);
        panel.add(bathroomLabel);


        washLabel = new JLabel("Wash Clothes:"+tempwash);
        washLabel.setBounds(10, 170, 300, 25);
        panel.add(washLabel);


        enLabel = new JLabel("Entertainment:"+tempen);
        enLabel.setBounds(10, 200, 300, 25);
        panel.add(enLabel);


        heatLabel = new JLabel("Heat:"+tempheat);
        heatLabel.setBounds(10, 230, 300, 25);
        panel.add(heatLabel);



        WifiLabel = new JLabel("Wifi:"+tempWifi);
        WifiLabel.setBounds(10, 260, 300, 25);
        panel.add(   WifiLabel);


        areaLabel = new JLabel("Kitchen-Bath:"+temparea);
        areaLabel.setBounds(10, 290, 300, 25);
        panel.add(     areaLabel);

        outsideLabel = new JLabel("Outside:"+tempoutside);
        outsideLabel .setBounds(10, 320, 300, 25);
        panel.add(     outsideLabel );

        parkingLabel = new JLabel("Parking:"+tempparking);
        parkingLabel .setBounds(10, 350, 300, 25);
        panel.add(     parkingLabel );



        button1 = new JButton("Add review");
        button1.setBounds(0, 390, 100, 25);
        button1.addActionListener(new Search());
        panel.add(button1);
        button2 = new JButton("Edit review");
        button2.setBounds(135, 390, 150, 25);
        button2.addActionListener(new Search());
        panel.add(button2);
        button3= new JButton("Delete review");
        button3.setBounds(0, 420, 150, 25);
        button3.addActionListener(new Search());
        panel.add(button3);
        button4= new JButton("Back");
        button4.setBounds(155, 420, 150, 25);
        button4.addActionListener(new ViewUserA());
        panel.add(button4);
        frame.setSize(300, 300);
        success = new JLabel("");
        success.setBounds(10, 395, 150, 25);
        panel.add(success);

        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
