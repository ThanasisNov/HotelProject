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







    private static JTextField username;


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

    void add(String name)    {
        setFrame(frame);
        JPanel panel = new JPanel();
        frame.setMinimumSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        username = new JTextField();
        username.setText(name);

        frame.add(panel);
        panel.setLayout(null);
        HotelName = new JLabel("Name:*");
        HotelName.setBounds(10, 20, 80, 25);
        panel.add(HotelName);
        HNText = new JTextField();
        HNText.setBounds(100, 20, 165, 25);
        panel.add(HNText);

        type = new JLabel("Type:*");
        type.setBounds(10, 50, 80, 25);
        panel.add(type);
        hotel.setBounds(50,50,60,25);
        panel.add(hotel);
        apartment.setBounds(110,50,100,25);
        panel.add(apartment);
        maisonette.setBounds(210,50,100,25);
        panel.add(maisonette);




        addressLabel = new JLabel("Address:*");
        addressLabel.setBounds(10, 80, 80, 25);
        panel.add(addressLabel);
        addressText = new JTextField();
        addressText.setBounds(100, 80, 165, 25);

        panel.add(addressText);

        cityLabel = new JLabel("City:*");
        cityLabel.setBounds(10, 110, 150, 25);
        panel.add(cityLabel);
        cityText = new JTextField();
       cityText.setBounds(100, 110, 190, 25);

        panel.add(cityText);

        postcodeLabel= new JLabel("PostCode:*");
        postcodeLabel.setBounds(10, 135, 150, 25);
        panel.add(postcodeLabel);
        postCodeText= new JTextField();
        postCodeText.setBounds(100, 135, 190, 25);
        panel.add(postCodeText);
        description= new JLabel("Description:");
        description.setBounds(10, 165, 150, 25);
        panel.add(description);
        descriptionText= new JTextField();
        descriptionText.setBounds(100, 165, 190, 25);
        panel.add(descriptionText);
        view= new JLabel("View:");
        view.setBounds(10, 195, 150, 25);
        panel.add(view);
        pool.setBounds(50,195,60,25);
        panel.add(pool);
        beach.setBounds(120,195,80,25);
        panel.add(beach);
        sea.setBounds(200,195,60,25);
        panel.add(sea);

        port.setBounds(260,195,60,25);
        panel.add(port);
        mountain.setBounds(330,195,100,25);
        panel.add(mountain);
        road.setBounds(430,195,100,25);
        panel.add(road);
        bathroom = new JLabel("Bathroom:");
        bathroom.setBounds(10, 230, 80, 25);
        hair.setBounds(110,230,100,25);
        panel.add(hair);
        panel.add(bathroom);
        entertainment = new JLabel("Entertainment:");
        entertainment.setBounds(10, 260, 100, 25);
        tv.setBounds(110,260,100,25);
        panel.add(tv);
        panel.add(entertainment);
        heat = new JLabel("Heat:");
        heat.setBounds(10, 290, 40, 25);
        fireplace.setBounds(40,290,100,25);
        panel.add(fireplace);
        aircondition.setBounds(140,290,100,25);
        panel.add(aircondition);
        fullheat.setBounds(280,290,200,25);
        panel.add(fullheat);
        panel.add(heat);
        clothingWash = new JLabel("Clothing Wash:");
        clothingWash.setBounds(10, 310, 110, 25);
        washermachine.setBounds(110,310,140,25);
        panel.add(washermachine);
        dryer.setBounds(250,310,100,25);
        panel.add(dryer);
        panel.add(clothingWash);
        wif = new JLabel("Wifi:");
        wif.setBounds(10, 330, 80, 25);
        wifi.setBounds(110,330,140,25);
        panel.add(wifi);
        Ethernet.setBounds(250,330,100,25);
        panel.add(Ethernet);
        panel.add(wif);
        kitchen = new JLabel("Kitchen:");
        kitchen.setBounds(10, 350, 80, 25);

        Fridge.setBounds(60,350,80,25);
        panel.add(Fridge);
        oven.setBounds(140,350,60,25);
        panel.add(oven);
        cookware.setBounds(200,350,100,25);
        panel.add(cookware);
        plates.setBounds(300,350,160,25);
        panel.add(plates);
        dishwasher.setBounds(460,350,140,25);
        panel.add(dishwasher);
        caffe.setBounds(600,350,140,25);
        panel.add(caffe);
        microwave.setBounds(750,350,140,25);
        panel.add(microwave);
        panel.add(kitchen);
        outside = new JLabel("Outside:");
        outside.setBounds(10, 370, 80, 25);
        panel.add(outside);
        balcony.setBounds(110,370,140,25);
        panel.add(balcony);
        courtyard.setBounds(250,370,140,25);
        panel.add(courtyard);
        parking = new JLabel("Parking:");
        parking.setBounds(10, 390, 80, 25);
        privateparking.setBounds(110,390,140,25);
        panel.add(privateparking);
        roadparking.setBounds(250,390,140,25);
        panel.add(roadparking);
        panel.add(parking);









wifi.addActionListener(new add());



        button1 = new JButton("Submit");
        button1.setBounds(10, 420, 80, 25);
        button1.addActionListener(new add());
        panel.add(button1);
        button2 = new JButton("Clear");
        button2.setBounds(195, 420, 85, 25);
        button2.addActionListener(new add());
        panel.add(button2);
        button3= new JButton("Back");
        button3.setBounds(100, 420, 85, 25);
        button3.addActionListener(new add());
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
      /*  setHotelName(HNText);
        setType(typeText);
        setLocation(locText);
        setDescription(descriptionText);
        // fac.setView(viewText.getText());
        fac.setBathroom(bathroomText.getText());
        fac.setClothes(clothingWashText.getText());
        fac.setEntertainment(entertainmentText.getText());
        fac.setHeat(heatText.getText());
        fac.setWifi(wifiText.getText());
        fac.setKitchen(kitchenText.getText());
        fac.setOutside(outsideText.getText());
        fac.setParking(parkingText.getText());*/

        if (e.getActionCommand().equals(button1.getText())) {

            try {
                if (HNText.getText().isEmpty()||(!hotel.isSelected() &&!apartment.isSelected()&& !maisonette.isSelected())||cityText.getText().isEmpty()
                       ||postCodeText.getText().isEmpty()||addressText.getText().isEmpty() ||descriptionText.getText().isEmpty() ) {
                    success.setText("Please fill all the required (*) fields");
                }
                else
                {
                    sea.getText();
                    // Εδώ μπορείς να βάλεις κατευθείαν τα hotel κτλ στα πεδία που έχουμε ασ πουμε στο wifi θα βαλεις wifi+","+"Ethernet" κτλ
                    object.add(HNText.getText(),"","",descriptionText.getText(),fac,username.getText());
                    success.setText("Add successful");

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


          /*  descriptionText.setText("");
            //viewText.setText("");
            bathroomText.setText("");
            clothingWashText.setText("");
            entertainmentText.setText("");
            heatText.setText("");
            wifiText.setText("");
            kitchenText.setText("");
            outsideText.setText("");
            parkingText.setText("");*/

        }
        else if(e.getActionCommand().equals(button3.getText()))
        {
            HNText.setText("");
            addressText.setText("");
            postCodeText.setText("");
            cityText.setText("");
            descriptionText.setText("");
            /*HNText.setText("");
            typeText.setText("");
            locText.setText("");
            descriptionText.setText("");
            // viewText.setText("");
            bathroomText.setText("");
            clothingWashText.setText("");
            entertainmentText.setText("");
            heatText.setText("");
            wifiText.setText("");
            kitchenText.setText("");
            outsideText.setText("");
            parkingText.setText("");*/

            frame.setVisible(false);
            frame.getContentPane().removeAll();
            UserB wow= new UserB();
            wow.getFrame().setVisible(true);
        }


    }
}