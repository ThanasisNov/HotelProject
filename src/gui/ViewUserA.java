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
        String realname=null;
        String tempname="";
        String temph=null;
        String tempa=null;
        String tempm=null;
        String tempAddress=null;
        String tempCity=null;
        String tempPost=null;
        String tempDe =null;
        String temppool=null;
        String  tempbeach=null;
        String tempsea=null;
        String tempport=null;
        String tempmount=null;
        String temproad=null;
        String temphair=null;
        String tempTv=null;
        String tempfire=null;
        String tempair=null ;
        String tempfullheat=null;
        String tempwashmach=null;
        String tempdryer=null;
        String tempwif=null;
        String tempethe=null;
        String tempFridge=null;
        String tempoven=null;
        String tempcook=null;
        String tempplates=null;
        String tempdishwash=null;
        String tempcaffe=null;
        String tempmicro=null;
        String tempbalcony=null;
        String tempyard=null;
        String tempprivateparking=null;
        String temproadparking=null;

        String line;

        try (Stream<String> lines = Files.lines(Paths.get("AddBase.txt"))) {
            line = lines.skip(lineNumber).findFirst().get();
        }
        Scanner check= new Scanner(line);

        check.useDelimiter("[,\n]");

        while (check.hasNext() )
        {
            realname=check.next();
            tempname = check.next();
            temph = check.next();
            tempa=check.next();
            tempm=check.next();
            tempAddress=check.next();
            tempCity=check.next();
            tempPost=check.next();
            tempDe=check.next();
            temppool=check.next();
            tempbeach=check.next();
            tempsea=check.next();
            tempport=check.next();
            tempmount=check.next();
            temproad=check.next();
            temphair=check.next();
            tempTv=check.next();
            tempfire=check.next();
            tempair= check.next();
            tempfullheat = check.next();
            tempwashmach=check.next();
            tempdryer=check.next();
            tempwif=check.next();
            tempethe=check.next();
            tempFridge=check.next();
            tempoven=check.next();
            tempcook=check.next();
            tempplates=check.next();
            tempdishwash=check.next();
            tempcaffe=check.next();
            tempmicro=check.next();
            tempethe=check.next();
            tempbalcony=check.next();
            tempyard=check.next();
            tempprivateparking=check.next();
            temproadparking=check.next();
        }
System.out.println("WoW");
            setFrame(frame);
        JPanel panel = new JPanel();
        frame.setMinimumSize(new Dimension(400,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);
        nameLabel = new JLabel("Hotel:"+tempname);
        nameLabel.setBounds(10, 20, 300, 25);
        panel.add(nameLabel);
        typeLabel = new JLabel("Type:"+temph+" "+tempa+" "+tempm);
        typeLabel.setBounds(10, 50, 300, 25);
        panel.add(typeLabel);


        locationLabel = new JLabel("Location:"+tempAddress);
        locationLabel.setBounds(10, 80, 300, 25);
        panel.add(locationLabel);




        viewLabel = new JLabel("View:"+temppool+" "+tempbeach+" "+tempsea+" "+ tempport+" "+tempmount+" "+temproad );
        viewLabel.setBounds(10, 110, 300, 25);
        panel.add(viewLabel);

        bathroomLabel = new JLabel("Bathroom:"+temphair);
        bathroomLabel.setBounds(10, 140, 300, 25);
        panel.add(bathroomLabel);


        washLabel = new JLabel("Wash Clothes:"+tempwashmach+" "+tempdryer);
        washLabel.setBounds(10, 170, 300, 25);
        panel.add(washLabel);


        enLabel = new JLabel("Entertainment:"+tempTv);
        enLabel.setBounds(10, 200, 300, 25);
        panel.add(enLabel);


        heatLabel = new JLabel("Heat:"+tempfire+" "+tempair+" "+tempfullheat);
        heatLabel.setBounds(10, 230, 300, 25);
        panel.add(heatLabel);



        WifiLabel = new JLabel("Wifi:"+tempwif+" "+tempethe);
        WifiLabel.setBounds(10, 260, 300, 25);
        panel.add(   WifiLabel);


        areaLabel = new JLabel("Kitchen-Bath:"+tempFridge+" "+tempmicro+" "+tempcook+" "+tempplates+" "+tempdishwash+" "+tempcaffe);
        areaLabel.setBounds(10, 290, 300, 25);
        panel.add(     areaLabel);

        outsideLabel = new JLabel("Outside:"+tempbalcony+" "+tempyard);
        outsideLabel .setBounds(10, 320, 300, 25);
        panel.add(     outsideLabel );

        parkingLabel = new JLabel("Parking:"+tempprivateparking+" "+temproadparking);
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
