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
        System.out.println(lineToDelete);
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
        for(int i=2;i<5;i++)
        {
            if(!splited[i].equals("empty")){
                typeText.setText(typeText.getText()+","+splited[i]);
            }
            splited[i]="";
        }
        typeText.setBounds(150, 50, 200, 25);
        panel.add(typeText);

        addressLabel = new JLabel("Address:*");
        addressLabel.setBounds(10, 80, 80, 25);
        addressText.setText(splited[5]);
        addressText.setBounds(150, 80, 80, 25);
        panel.add(addressText);
        panel.add(addressLabel);

        cityLabel = new JLabel("City:*");
        cityLabel.setBounds(10, 110, 150, 25);
        panel.add(cityLabel);
        cityText.setText(splited[6]);
        cityText.setBounds(150, 110, 150, 25);
        panel.add(cityLabel);

        postcodeLabel = new JLabel("PostCode:*");
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
        if (splited[9].equals("empty")) {
            viewText.setText(splited[10] + "," + splited[11] + "," + splited[12] + "," + splited[13] + "," + splited[14]);
        } else if (splited[10].equals("empty")) {
            viewText.setText(splited[9] + "," + splited[11] + "," + splited[12] + "," + splited[13] + "," + splited[14]);
        } else if (splited[11].equals("empty")) {
            viewText.setText(splited[9] + "," + splited[10] + "," + splited[12] + "," + splited[13] + "," + splited[14]);
        } else if (splited[12].equals("empty")) {
            viewText.setText(splited[9] + "," + splited[10] + "," + splited[11] + "," + splited[13] + "," + splited[14]);
        } else if (splited[13].equals("empty")) {
            viewText.setText(splited[9] + "," + splited[10] + "," + splited[11] + "," + splited[12] + "," + splited[14]);
        } else if (splited[14].equals("empty")) {
            viewText.setText(splited[9] + "," + splited[10] + "," + splited[11] + "," + splited[12] + "," + splited[13]);
        } else{
            viewText.setText(splited[9] + "," + splited[10] + "," + splited[11] + "," + splited[12] + "," + splited[13] + "," + splited[14]);
        }
        viewText.setBounds(150, 195, 150, 25);
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
        if (splited[17].equals("empty")) {
            heatText.setText(splited[18] + "," + splited[19]);
        } else if (splited[18].equals("empty")) {
            heatText.setText(splited[17] + "," +  splited[19]);
        } else if (splited[19].equals("empty")) {
            heatText.setText(splited[17] + "," + splited[18] );
        } else {
            heatText.setText(splited[17] + "," + splited[18] + "," + splited[19] );
        }
        heatText.setBounds(150,290,150,25);
        panel.add(heatText);

        clothingWash = new JLabel("Clothing Wash:");
        clothingWash.setBounds(10, 310, 110, 25);
        panel.add(clothingWash);
        if (splited[20].equals("empty")) {
            clothesText.setText(splited[21]);
        } else if (splited[21].equals("empty")) {
            clothesText.setText(splited[20]);
        } else {
            heatText.setText(splited[20] + "," + splited[21]);
        }
        clothesText.setBounds(150,310,150,25);
        panel.add(clothesText);

        wif = new JLabel("Wifi:");
        wif.setBounds(10, 330, 80, 25);
        panel.add(wif);
        if (splited[22].equals("empty")) {
            wifiText.setText(splited[23]);
        } else if (splited[23].equals("empty")) {
            wifiText.setText(splited[22]);
        } else {
            wifiText.setText(splited[22] + "," + splited[23]);
        }

        kitchen = new JLabel("Kitchen:");
        kitchen.setBounds(10, 350, 80, 25);
        panel.add(kitchen);
        if (splited[24].equals("empty")) {
            kitchenText.setText(splited[25] + "," + splited[26] + "," + splited[27] + "," + splited[28] + "," + splited[29]+","+splited[30]);
        } else if (splited[25].equals("empty")) {
            kitchenText.setText(splited[24] + "," + splited[26] + "," + splited[27] + "," + splited[28] + "," + splited[29]+","+splited[30]);
        } else if (splited[26].equals("empty")) {
            kitchenText.setText(splited[24] + "," + splited[25] + "," + splited[27] + "," + splited[28] + "," + splited[29]+","+splited[30]);
        } else if (splited[27].equals("empty")) {
            kitchenText.setText(splited[24] + "," + splited[25] + "," + splited[26] + "," + splited[28] + "," + splited[29]+","+splited[30]);
        } else if (splited[28].equals("empty")) {
            kitchenText.setText(splited[24] + "," + splited[25] + "," + splited[26] + "," + splited[27] + "," + splited[29]+","+splited[30]);
        } else if (splited[29].equals("empty")) {
            kitchenText.setText(splited[24] + "," + splited[25] + "," + splited[26] + "," + splited[27] + "," + splited[28]+","+splited[30]);
        }else if (splited[30].equals("empty")) {
            kitchenText.setText(splited[24] + "," + splited[25] + "," + splited[26] + "," + splited[27] + "," + splited[28]+","+splited[29]);
        }
        else {
            kitchenText.setText(splited[24] + "," + splited[25] + "," + splited[26] + "," + splited[27] + "," + splited[28] + "," + splited[29]+","+splited[30]);
        }
        kitchenText.setBounds(150,350,150,25);
        panel.add(kitchen);


        outside = new JLabel("Outside:");
        outside.setBounds(10, 370, 80, 25);
        panel.add(outside);
        if (splited[31].equals("empty")) {
            outsideText.setText(splited[32]);
        } else if (splited[32].equals("empty")) {
            outsideText.setText(splited[31]);
        } else {
            outsideText.setText(splited[31] + "," + splited[32]);
        }
        outsideText.setBounds(150,370,150,25);
        panel.add(outsideText);


        parking = new JLabel("Parking:");
        parking.setBounds(10, 390, 80, 25);
        panel.add(parking);
        if (splited[33].equals("empty")) {
            parkingText.setText(splited[34]);
        } else if (splited[34].equals("empty")) {
            parkingText.setText(splited[33]);
        } else {
            parkingText.setText(splited[33] + "," + splited[34]);
        }
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
