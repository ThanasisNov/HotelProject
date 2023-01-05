package gui;


import api.App;
import api.EditFile;
import api.room;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Editing implements ActionListener {


    private static JLabel HotelName;
    private static JTextField HNText;
    private static JTextField newHNText;

    private static JLabel type;
    private static JLabel description;
    private static JTextField descriptionText;
    private static JLabel view;

    private static JLabel bathroom;

    private static JLabel clothingWash;

    private static JLabel entertainment;

    private static JLabel heat;

    private static JLabel wif;

    private static JLabel kitchen;

    private static JLabel outside;

    private static JLabel parking;



    private static final JCheckBox hotel = new JCheckBox("Hotel");
    private static final JCheckBox apartment = new JCheckBox("Apartment");
    private static final JCheckBox maisonette = new JCheckBox("Maisonette");
    private static JLabel addressLabel;
    private static JTextField addressText;
    private static JLabel cityLabel;
    private static JTextField cityText;
    private static JLabel postcodeLabel;
    private static JTextField postCodeText;
    private static final JCheckBox sea = new JCheckBox("Sea");
    private static final JCheckBox port= new JCheckBox("Port");
    private static final JCheckBox pool = new JCheckBox("Pool");
    private static final JCheckBox beach = new JCheckBox("Beach");
    private static final JCheckBox mountain = new JCheckBox("Mountain");
    private static final JCheckBox road = new JCheckBox("Road");
    private static final JCheckBox hair = new JCheckBox("Hair Dryer");
    private static final JCheckBox washermachine = new JCheckBox("Wash Machine");
    private static final JCheckBox dryer = new JCheckBox("Dryer");
    private static final JCheckBox tv = new JCheckBox("TV");
    private static final JCheckBox fireplace = new JCheckBox("Fireplace");
    private static final JCheckBox aircondition = new JCheckBox("Air Condition");
    private static final JCheckBox fullheat = new JCheckBox("Full house Heat");
    private static final JCheckBox wifi = new JCheckBox("Wifi");
    private static final JCheckBox Ethernet = new JCheckBox("Ethernet");
    private static final JCheckBox oven = new JCheckBox("Oven");
    private static final JCheckBox Fridge = new JCheckBox("Fridge");
    private static final JCheckBox microwave = new JCheckBox("Microwave");
    private static final JCheckBox cookware = new JCheckBox("cookware");
    private static final JCheckBox plates = new JCheckBox("Plates an Cutlery");
    private static final JCheckBox dishwasher = new JCheckBox("Dishwasher");
    private static final JCheckBox balcony = new JCheckBox("balcony");
    private static final JCheckBox courtyard = new JCheckBox("Courtyard");
    private static final JCheckBox caffe = new JCheckBox("Caffe Machine");
    private static final JCheckBox privateparking = new JCheckBox("Private parking");
    private static final JCheckBox roadparking = new JCheckBox("Road Parking");


    private static String username;


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

    public static String stringForEdit ;
    void Editting(String selected, String name) {
        username = name ;
        System.out.println("KOYRAMPIES");
        stringForEdit = selected;
        String[] splited = selected.split(",");


        setFrame(frame);
        JPanel panel = new JPanel();
        frame.setMinimumSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);
        HotelName = new JLabel("Name:*");
        HotelName.setBounds(10, 20, 80, 25);
        panel.add(HotelName);
        HNText = new JTextField(splited[1]);
        HNText.setBounds(100, 20, 165, 25);
        panel.add(HNText);



        type = new JLabel("Type:*");
        type.setBounds(10, 50, 80, 25);
        panel.add(type);
        hotel.setBounds(50,50,60,25);
        panel.add(hotel);
        if(splited[2].equals("empty"))
        {
            hotel.setSelected(false);
        }
        else
        {
            hotel.setSelected(true);
        }
        apartment.setBounds(110,50,100,25);
        panel.add(apartment);
        if(splited[3].equals("empty"))
        {
            apartment.setSelected(false);
        }
        else
        {
            apartment.setSelected(true);
        }
        maisonette.setBounds(210,50,100,25);
        panel.add(maisonette);
        if(splited[4].equals("empty"))
        {
            maisonette.setSelected(false);
        }
        else
        {
            maisonette.setSelected(true);
        }




        addressLabel = new JLabel("Address:*");
        addressLabel.setBounds(10, 80, 80, 25);
        panel.add(addressLabel);
        addressText = new JTextField(splited[5]);
        addressText.setBounds(100, 80, 165, 25);

        panel.add(addressText);

        cityLabel = new JLabel("City:*");
        cityLabel.setBounds(10, 110, 150, 25);
        panel.add(cityLabel);
        cityText = new JTextField(splited[6]);
        cityText.setBounds(100, 110, 190, 25);
        panel.add(cityText);
        postcodeLabel= new JLabel("PostCode:*");
        postcodeLabel.setBounds(10, 135, 150, 25);
        panel.add(postcodeLabel);
        postCodeText= new JTextField(splited[7]);
        postCodeText.setBounds(100, 135, 190, 25);
        panel.add(postCodeText);
        description= new JLabel("Description:");
        description.setBounds(10, 165, 150, 25);
        panel.add(description);
        descriptionText= new JTextField(splited[8]);
        descriptionText.setBounds(100, 165, 190, 25);
        panel.add(descriptionText);
        view= new JLabel("View:");
        view.setBounds(10, 195, 150, 25);
        panel.add(view);
        pool.setBounds(50,195,60,25);
        panel.add(pool);
        if(splited[9].equals("empty"))
        {
            pool.setSelected(false);
        }
        else
        {
            pool.setSelected(true);
        }
        beach.setBounds(120,195,80,25);
        panel.add(beach);
        if(splited[10].equals("empty"))
        {
            beach.setSelected(false);
        }
        else
        {
            beach.setSelected(true);
        }
        sea.setBounds(200,195,60,25);
        panel.add(sea);
        if(splited[11].equals("empty"))
        {
            sea.setSelected(false);
        }
        else
        {
            sea.setSelected(true);
        }
        port.setBounds(260,195,60,25);
        panel.add(port);
        if(splited[12].equals("empty"))
        {
            port.setSelected(false);
        }
        else
        {
            port.setSelected(true);
        }
        mountain.setBounds(330,195,100,25);
        panel.add(mountain);
        if(splited[13].equals("empty"))
        {
            mountain.setSelected(false);
        }
        else
        {
            mountain.setSelected(true);
        }
        road.setBounds(430,195,100,25);
        panel.add(road);
        if(splited[14].equals("empty"))
        {
            road.setSelected(false);
        }
        else
        {
            road.setSelected(true);
        }
        bathroom = new JLabel("Bathroom:");
        bathroom.setBounds(10, 230, 80, 25);
        panel.add(bathroom);
        hair.setBounds(110,230,100,25);
        panel.add(hair);
        if(splited[15].equals("empty"))
        {
            hair.setSelected(false);
        }
        else
        {
            hair.setSelected(true);
        }
        entertainment = new JLabel("Entertainment:");
        entertainment.setBounds(10, 260, 100, 25);
        tv.setBounds(110,260,100,25);
        panel.add(tv);
        if(splited[16].equals("empty"))
        {
            tv.setSelected(false);
        }
        else
        {
            tv.setSelected(true);
        }
        panel.add(entertainment);
        heat = new JLabel("Heat:");
        heat.setBounds(10, 290, 40, 25);
        fireplace.setBounds(40,290,100,25);
        panel.add(fireplace);
        if(splited[17].equals("empty"))
        {
            fireplace.setSelected(false);
        }
        else
        {
            fireplace.setSelected(true);
        }
        aircondition.setBounds(140,290,100,25);
        panel.add(aircondition);
        if(splited[18].equals("empty"))
        {
            maisonette.setSelected(false);
        }
        else
        {
            maisonette.setSelected(true);
        }
        fullheat.setBounds(280,290,200,25);
        panel.add(fullheat);
        if(splited[19].equals("empty"))
        {
            fullheat.setSelected(false);
        }
        else
        {
            fullheat.setSelected(true);
        }
        panel.add(heat);
        clothingWash = new JLabel("Clothing Wash:");
        clothingWash.setBounds(10, 310, 110, 25);
        washermachine.setBounds(110,310,140,25);
        panel.add(washermachine);
        if(splited[20].equals("empty"))
        {
            washermachine.setSelected(false);
        }
        else
        {
            washermachine.setSelected(true);
        }
        dryer.setBounds(250,310,100,25);
        panel.add(dryer);
        if(splited[21].equals("empty"))
        {
            dryer.setSelected(false);
        }
        else
        {
            dryer.setSelected(true);
        }
        panel.add(clothingWash);
        wif = new JLabel("Wifi:");
        wif.setBounds(10, 330, 80, 25);
        wifi.setBounds(110,330,140,25);
        panel.add(wifi);
        if(splited[22].equals("empty"))
        {
            wifi.setSelected(false);
        }
        else
        {
            wifi.setSelected(true);
        }
        Ethernet.setBounds(250,330,100,25);
        panel.add(Ethernet);
        if(splited[23].equals("empty"))
        {
            Ethernet.setSelected(false);
        }
        else
        {
            Ethernet.setSelected(true);
        }
        panel.add(wif);
        kitchen = new JLabel("Kitchen:");
        kitchen.setBounds(10, 350, 80, 25);

        Fridge.setBounds(60,350,80,25);
        panel.add(Fridge);
        if(splited[24].equals("empty"))
        {
            Fridge.setSelected(false);
        }
        else
        {
            Fridge.setSelected(true);
        }
        oven.setBounds(140,350,60,25);
        panel.add(oven);
        if(splited[25].equals("empty"))
        {
            oven.setSelected(false);
        }
        else
        {
            oven.setSelected(true);
        }
        cookware.setBounds(200,350,100,25);
        panel.add(cookware);
        if(splited[26].equals("empty"))
        {
            cookware.setSelected(false);
        }
        else
        {
            cookware.setSelected(true);
        }
        plates.setBounds(300,350,160,25);
        panel.add(plates);
        if(splited[27].equals("empty"))
        {
            plates.setSelected(false);
        }
        else
        {
            plates.setSelected(true);
        }
        dishwasher.setBounds(460,350,140,25);
        panel.add(dishwasher);
        if(splited[28].equals("empty"))
        {
            dishwasher.setSelected(false);
        }
        else
        {
            dishwasher.setSelected(true);
        }
        caffe.setBounds(600,350,140,25);
        panel.add(caffe);
        if(splited[29].equals("empty"))
        {
            caffe.setSelected(false);
        }
        else
        {
            caffe.setSelected(true);
        }
        microwave.setBounds(750,350,140,25);
        panel.add(microwave);
        if(splited[30].equals("empty"))
        {
            microwave.setSelected(false);
        }
        else
        {
            microwave.setSelected(true);
        }

        panel.add(kitchen);
        outside = new JLabel("Outside:");
        outside.setBounds(10, 370, 80, 25);
        panel.add(outside);
        balcony.setBounds(110,370,140,25);
        panel.add(balcony);

    if(splited[31].equals("empty"))
    {
        balcony.setSelected(false);
    }
    else
    {
        balcony.setSelected(true);
    }
        courtyard.setBounds(250,370,140,25);
        panel.add(courtyard);

        if(splited[32].equals("empty"))
        {
            courtyard.setSelected(false);
        }
        else
        {
            courtyard.setSelected(true);
        }
        parking = new JLabel("Parking:");
        parking.setBounds(10, 390, 80, 25);
        privateparking.setBounds(110,390,140,25);
        panel.add(privateparking);

    if(splited[33].equals("empty"))
    {
        privateparking.setSelected(false);
    }
    else
    {
        privateparking.setSelected(true);
    }
        roadparking.setBounds(250,390,140,25);
        panel.add(roadparking);
        panel.add(parking);

        if(splited[34].equals("empty"))
        {
            roadparking.setSelected(false);
        }
        else
        {
            roadparking.setSelected(true);
        }

//PURAHFPIEWRUHFpiwueh
        button1 = new JButton("Submit");
        button1.setBounds(10, 420, 80, 25);
        button1.addActionListener(new Editing());
        panel.add(button1);
        button2 = new JButton("Clear");
        button2.setBounds(195, 420, 85, 25);
        button2.addActionListener(new Editing());
        panel.add(button2);
        button3= new JButton("Back");
        button3.setBounds(100, 420, 85, 25);
        button3.addActionListener(new Editing());
        panel.add(button3);
        frame.setMinimumSize(new Dimension(900,700));
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


    JTextField getDescriptionText(){return descriptionText;}





    @Override
    public void actionPerformed(ActionEvent e) {

        App object = new App();
        room fac = new room();
        setHotelName(HNText);
        setDescription(descriptionText);
        String[] checkIfExists  =new String[34];


        if (e.getActionCommand().equals(button1.getText())) {
            System.out.println(HNText.getText() + "MOTHERFUCKER");

            EditFile ef = new EditFile();
            try {
                ef.remove(stringForEdit);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
           try {
                if (HNText.getText().isEmpty()||(!hotel.isSelected() &&!apartment.isSelected()&& !maisonette.isSelected())||cityText.getText().isEmpty()
                        ||postCodeText.getText().isEmpty()||addressText.getText().isEmpty() ||descriptionText.getText().isEmpty() ) {
                    success.setText("Please fill all the required (*) fields");
                }
                else
                {
                    int i = 0;
                    for (String x : checkIfExists) {
                        name = "";
                        checkIfExists[i] = "empty";
                        i++;}
                    if(hotel.isSelected())checkIfExists[0]=hotel.getText();
                    if(apartment.isSelected())checkIfExists[1]=apartment.getText();
                    if(maisonette.isSelected()) checkIfExists[2]=maisonette.getText();
                    if(pool.isSelected())checkIfExists[3]=pool.getText();
                    if(beach.isSelected()) checkIfExists[4]=beach.getText();
                    if(sea.isSelected()) checkIfExists[5]=sea.getText();
                    if(port.isSelected()) checkIfExists[6]=port.getText();
                    if(mountain.isSelected())  checkIfExists[7]= mountain.getText();
                    if(road.isSelected()) checkIfExists[8]=road.getText();
                    if(hair.isSelected())checkIfExists[9]= hair.getText();
                    if(tv.isSelected())  checkIfExists[10]=tv.getText();
                    if(fireplace.isSelected())  checkIfExists[11]=fireplace.getText();
                    if(aircondition.isSelected())  checkIfExists[12]=aircondition.getText();
                    if(fullheat.isSelected())checkIfExists[13]=fullheat.getText();
                    if(washermachine.isSelected()) checkIfExists[14]=washermachine.getText();
                    if(dryer.isSelected())  checkIfExists[15]=dryer.getText();
                    if(wifi.isSelected()) checkIfExists[16]=wifi.getText();
                    if(Ethernet.isSelected())checkIfExists[17]=Ethernet.getText();
                    if(Fridge.isSelected())checkIfExists[18]=Fridge.getText() ;
                    if(oven.isSelected()) checkIfExists[19]=oven.getText();
                    if(microwave.isSelected())checkIfExists[20]=microwave.getText();
                    if(cookware.isSelected())checkIfExists[21]=cookware.getText();
                    if(plates.isSelected())checkIfExists[22]=plates.getText();
                    if(dishwasher.isSelected())checkIfExists[23]=dishwasher.getText();
                    if(caffe.isSelected())checkIfExists[24]=caffe.getText();
                    if(balcony.isSelected())checkIfExists[25]=balcony.getText();
                    if(courtyard.isSelected())checkIfExists[26]=courtyard.getText();
                    if(privateparking.isSelected())checkIfExists[27]=privateparking.getText();
                    if(roadparking.isSelected()) checkIfExists[28]= roadparking.getText();
                    fac.setView(checkIfExists[3]+","+checkIfExists[4]+","+checkIfExists[5]+","+checkIfExists[6]+","+checkIfExists[7]+","+checkIfExists[8]);
                    fac.setBathroom(checkIfExists[9]);
                    fac.setClothes(checkIfExists[10]+","+checkIfExists[11]);
                    fac.setEntertainment(checkIfExists[12]);
                    fac.setHeat(checkIfExists[13]+","+checkIfExists[14]+","+checkIfExists[15]);
                    fac.setWifi(checkIfExists[16]+","+checkIfExists[17]);
                    fac.setKitchen(checkIfExists[18]+","+checkIfExists[19]+","+checkIfExists[20]+","+checkIfExists[21]+","+checkIfExists[22]+","+checkIfExists[23]+","+checkIfExists[24]);
                    fac.setOutside(checkIfExists[25]+","+checkIfExists[26]);
                    fac.setParking(checkIfExists[27]+","+checkIfExists[28]);
                    object.add(object.CommaChanger(HNText.getText()),checkIfExists[0]+","+checkIfExists[1]+","+checkIfExists[2]
                            ,object.CommaChanger(addressText.getText())+","+object.CommaChanger(cityText.getText())+","+object.CommaChanger(postCodeText.getText())
                            ,object.CommaChanger(descriptionText.getText()), fac, username);
                    success.setText("Edit successfully");

                }

            } catch (IOException ex) {
                System.out.println("Error!");
            }


        }
        else if (e.getActionCommand().equals(button2.getText()))
        {
            HNText.setText("");
            addressText.setText("");
            postCodeText.setText("");
            cityText.setText("");
            descriptionText.setText("");
            hotel.setSelected(false);
            apartment.setSelected(false);
            maisonette.setSelected(false);
            pool.setSelected(false);
            beach.setSelected(false);
            sea.setSelected(false);
            port.setSelected(false);
            mountain.setSelected(false);
            road.setSelected(false);
            hair.setSelected(false);
            tv.setSelected(false);
            fireplace.setSelected(false);
            aircondition.setSelected(false);
            fullheat.setSelected(false);
            washermachine.setSelected(false);
            dryer.setSelected(false);
            wifi.setSelected(false);
            Ethernet.setSelected(false);
            Fridge.setSelected(false);
            oven.setSelected(false);
            microwave.setSelected(false);
            cookware.setSelected(false);
            plates.setSelected(false);
            dishwasher.setSelected(false);
            caffe.setSelected(false);
            balcony.setSelected(false);
            courtyard.setSelected(false);
            privateparking.setSelected(false);
            roadparking.setSelected(false);



        }
        else if(e.getActionCommand().equals(button3.getText()))
        {
            HNText.setText("");
            addressText.setText("");
            postCodeText.setText("");
            cityText.setText("");
            hotel.setSelected(false);
            apartment.setSelected(false);
            maisonette.setSelected(false);
            pool.setSelected(false);
            beach.setSelected(false);
            sea.setSelected(false);
            port.setSelected(false);
            mountain.setSelected(false);
            road.setSelected(false);
            hair.setSelected(false);
            tv.setSelected(false);
            fireplace.setSelected(false);
            aircondition.setSelected(false);
            fullheat.setSelected(false);
            washermachine.setSelected(false);
            dryer.setSelected(false);
            wifi.setSelected(false);
            Ethernet.setSelected(false);
            Fridge.setSelected(false);
            oven.setSelected(false);
            microwave.setSelected(false);
            cookware.setSelected(false);
            plates.setSelected(false);
            dishwasher.setSelected(false);
            caffe.setSelected(false);
            balcony.setSelected(false);
            courtyard.setSelected(false);
            privateparking.setSelected(false);
            roadparking.setSelected(false);


            frame.setVisible(false);
            frame.getContentPane().removeAll();
            Edit wow= new Edit();
            wow.getFrame().setVisible(true);
        }


    }
}