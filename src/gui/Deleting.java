package gui;
import api.App;
import api.EditFile;
import org.w3c.dom.Text;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Deleting  implements ActionListener {

    private static JLabel HotelName;
    private static JLabel HNText;
    private static JLabel type;
    private static JLabel typeText = new JLabel("-");
    private static JLabel addressLabel;
    private static JLabel addressText= new JLabel("-");
    private static JLabel description;
    private static JLabel descriptionText= new JLabel("-");

    private static JLabel view;
    private static JLabel viewText= new JLabel("-");
    private static JLabel bathroom;
    private static JLabel bathroomText= new JLabel("-");
    private static JLabel clothingWash;
    private static JLabel clothesText= new JLabel("-");
    private static JLabel entertainment;
    private static JLabel entertainmentText= new JLabel("-");
    private static JLabel heat;
    private static JLabel heatText= new JLabel("-");
    private static JLabel wif;
    private static JLabel wifiText= new JLabel("-");
    private static JLabel kitchen;
    private static JLabel kitchenText= new JLabel("-");
    private static JLabel outside;
    private static JLabel outsideText= new JLabel("-");
    private static JLabel parking;
    private static JLabel parkingText= new JLabel("-");
    private static JLabel cityLabel;
    private static JLabel cityText= new JLabel("-");
    private static JLabel postcodeLabel;
    private static JLabel postcodeText= new JLabel("-");
    private static JButton buttonback ;
    private static JButton buttonDelete;

    private static JLabel success;
    private JSplitPane splitpane = new JSplitPane();
    private String username;
    private static String lineToDelete;


    private static JFrame frame = new JFrame();
    ArrayList<String> useradds = new ArrayList<String>();
    private JTextField selected ;

    void setFrame(JFrame frame)
    {
        this.frame=frame;
    }
    JFrame getFrame()
    {
        return frame;
    }
    void deleting( String line_to_delete,String name) throws FileNotFoundException {
        String str;
        username = name;
        lineToDelete = line_to_delete;
       //System.out.println(lineToDelete);
        String[] splited = line_to_delete.split(",");
        setFrame(frame);
        JPanel panel = new JPanel();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);


        HotelName = new JLabel("Name:");
        HotelName.setBounds(10, 20, 80, 25);
        panel.add(HotelName);
        HNText = new JLabel(splited[1]);
        HNText.setBounds(150, 20, 200, 25);
        panel.add(HNText);


        type = new JLabel("Type:");
        type.setBounds(10, 50, 150, 25);
        panel.add(type);
        int k=0;
        for(int i=2;i<5;i++) {
            if (k==0) {
                if (!splited[i].equals("empty")) {
                    typeText.setText(splited[i]);
                    k=1;
                }
            }else {
                if (!splited[i].equals("empty")) {
                    typeText.setText(typeText.getText() + "," + splited[i]);
                }
            }
        }
        k=0;

        typeText.setBounds(150, 50, 200, 25);
        panel.add(typeText);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(10, 80, 80, 25);
        addressText.setText(splited[5]);
        addressText.setBounds(150, 80, 80, 25);
        panel.add(addressText);
        panel.add(addressLabel);

        cityLabel = new JLabel("City:");
        cityLabel.setBounds(10, 110, 150, 25);
        panel.add(cityLabel);
        System.out.println(splited[6]+"ftoyxam");
        cityText.setText(splited[6]);
        cityText.setBounds(150, 110, 150, 25);
        panel.add(cityText);

        postcodeLabel = new JLabel("PostCode:");
        postcodeLabel.setBounds(10, 135, 150, 25);
        panel.add(postcodeLabel);
        postcodeText.setText(splited[7]);
        postcodeText.setBounds(150, 135, 150, 25);
        panel.add(postcodeText);

        description = new JLabel("Description:");
        description.setBounds(10, 165, 150, 25);
        panel.add(description);
        descriptionText.setText(splited[8]);
        descriptionText.setBounds(150, 165, 80, 25);
        panel.add(descriptionText);

        view = new JLabel("View:");
        view.setBounds(10, 195, 300, 25);
        panel.add(view);
        for(int i=9;i<15;i++) {
            if (k==0) {
                if (!splited[i].equals("empty")) {
                    viewText.setText(splited[i]);
                    k=1;
                }
            }else {
                if (!splited[i].equals("empty")) {
                    viewText.setText(viewText.getText() + "," + splited[i]);
                }
            }
        }
        k=0;
        viewText.setBounds(150, 195, 300, 25);
        panel.add(viewText);


        bathroom = new JLabel("Bathroom:");
        bathroom.setBounds(10, 230, 80, 25);
        panel.add(bathroom);
        if (!splited[15].equals("empty")) {
            bathroomText.setText(splited[15]);
        }
        bathroomText.setBounds(150, 230, 80, 25);
        panel.add(bathroomText);

        entertainment = new JLabel("Entertainment:");
        entertainment.setBounds(10, 260, 100, 25);
        panel.add(entertainment);
        if (!splited[16].equals("epmty")) {
            entertainmentText.setText(splited[16]);
        }
        entertainmentText.setBounds(150,260,150,25);
        panel.add(entertainmentText);

        heat = new JLabel("Heat:");
        heat.setBounds(10, 290, 40, 25);
        panel.add(heat);
        for(int i=17;i<20;i++) {
            if (k==0) {
                if (!splited[i].equals("empty")) {
                    heatText.setText(splited[i]);
                    k=1;
                }
            }else {
                if (!splited[i].equals("empty")) {
                    heatText.setText(heatText.getText() + "," + splited[i]);
                }
            }
        }
        k=0;
        heatText.setBounds(150,290,150,25);
        panel.add(heatText);

        clothingWash = new JLabel("Clothing Wash:");
        clothingWash.setBounds(10, 310, 110, 25);
        panel.add(clothingWash);
        for(int i=20;i<22;i++) {
            if (k==0) {
                if (!splited[i].equals("empty")) {
                    clothesText.setText(splited[i]);
                    k=1;
                }
            }else {
                if (!splited[i].equals("empty")) {
                    clothesText.setText(clothesText.getText() + "," + splited[i]);
                }
            }
        }
        k=0;
        clothesText.setBounds(150,310,150,25);
        panel.add(clothesText);

        wif = new JLabel("Wifi:");
        wif.setBounds(10, 330, 80, 25);
        panel.add(wif);
        for(int i=22;i<24;i++) {
            if (k==0) {
                if (!splited[i].equals("empty")) {
                    wifiText.setText(splited[i]);
                    k=1;
                }
            }else {
                if (!splited[i].equals("empty")) {
                    wifiText.setText(wifiText.getText() + "," + splited[i]);
                }
            }
        }
        k=0;
        wifiText.setBounds(150,350,300,25);

        kitchen = new JLabel("Kitchen:");
        kitchen.setBounds(10, 350, 80, 25);
        panel.add(kitchen);
        for(int i=24;i<31;i++) {
            if (k==0) {
                if (!splited[i].equals("empty")) {
                    kitchenText.setText(splited[i]);
                    k=1;
                }
            }else {
                if (!splited[i].equals("empty")) {
                    kitchenText.setText(kitchenText.getText() + "," + splited[i]);
                }
            }
        }
        k=0;
        kitchenText.setBounds(150,350,350,25);
        panel.add(kitchenText);


        outside = new JLabel("Outside:");
        outside.setBounds(10, 370, 80, 25);
        panel.add(outside);
        for(int i=31;i<33;i++) {
            if (k==0) {
                if (!splited[i].equals("empty")) {
                    outsideText.setText(splited[i]);
                    k=1;
                }
            }else {
                if (!splited[i].equals("empty")) {
                    outsideText.setText(outsideText.getText() + "," + splited[i]);
                }
            }
        }
        k=0;
        outsideText.setBounds(150,370,150,25);
        panel.add(outsideText);


        parking = new JLabel("Parking:");
        parking.setBounds(10, 390, 80, 25);
        panel.add(parking);
        for(int i=33;i<35;i++) {
            if (k==0) {
                if (!splited[i].equals("empty")) {
                    parkingText.setText(splited[i]);
                    k=1;
                }
            }else {
                if (!splited[i].equals("empty")) {
                    parkingText.setText(parkingText.getText() + "," + splited[i]);
                }
            }
        }
        k=0;
        parkingText.setBounds(150,390,150,25);
        panel.add(parkingText);


        buttonback = new JButton("Back ");
        buttonback.setBounds(1, 420, 100, 25);
        buttonback.addActionListener(new Deleting());
        panel.add(buttonback);
        buttonDelete = new JButton("Delete");
        buttonDelete.setBounds(150,420,100,25);
        buttonDelete.addActionListener(new Deleting());
        panel.add(buttonDelete);
        success= new JLabel("");
        success.setBounds(150,450,100,20);
        panel.add(success);



        frame.setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getActionCommand().equals(buttonback.getText())) {
            frame.setVisible(false);
            Delete wow= new Delete();
            wow.getFrame().setVisible(true);
        }
        else if (e.getActionCommand().equals(buttonDelete.getText())){
            frame.setVisible(false);
            YES_NO wow = new YES_NO();
            System.out.println(lineToDelete);
            wow.choice(lineToDelete);

        }

    }



}
