package gui;

import api.ReviewFile;
import api.Submits;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

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
     private static   JFrame oldFrame;
    private static  String[] all;
    private static String username;
    void ViewUserA(String hotels,JFrame old,String user) throws IOException {

        setFrame(frame);
        oldFrame=old;
        username=user;
        JPanel panel = new JPanel();
        frame.setMinimumSize(new Dimension(600,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Submits test= new Submits();

 all=  test.SearchSubmit(hotels);


int i=0;
for(String x:all)
{
    if(x.equals("empty"))
    {
        all[i]="";
    }
    i++;
}

        panel.setLayout(null);

        nameLabel = new JLabel("Hotel:"+all[1]);
        nameLabel.setBounds(10, 20, 300, 25);
        panel.add(nameLabel);
        typeLabel = new JLabel("Type:"+all[2]+" "+all[3]+" "+all[4]);
        typeLabel.setBounds(10, 50, 300, 25);
        panel.add(typeLabel);


        locationLabel = new JLabel("Location:"+all[5] +" "+all[6]+" "+all[7]);
        locationLabel.setBounds(10, 70, 300, 25);
        panel.add(locationLabel);
        JLabel deLabel = new JLabel("Description:"+all[8]);
        deLabel.setBounds(10, 90, 5000, 25);
        panel.add(deLabel);



        viewLabel = new JLabel("View:"+all[9]+" "+all[10]+" "+ all[11]+" "+all[12]+" "+all[13]+" "+ all[14]);
        viewLabel.setBounds(10, 110, 300, 25);
        panel.add(viewLabel);



        bathroomLabel = new JLabel("Bathroom:"+all[15]);
        bathroomLabel.setBounds(10, 140, 300, 25);
        panel.add(bathroomLabel);


        washLabel = new JLabel("Wash Clothes:"+" "+all[20]+" "+all[21]);
        washLabel.setBounds(10, 170, 300, 25);
        panel.add(washLabel);


        enLabel = new JLabel("Entertainment:"+all[16]);
        enLabel.setBounds(10, 200, 300, 25);
        panel.add(enLabel);


        heatLabel = new JLabel("Heat:"+all[18]+" "+all[19]+" "+all[17]);
        heatLabel.setBounds(10, 230, 300, 25);
        panel.add(heatLabel);



        WifiLabel = new JLabel("Wifi:"+all[22]+" "+all[23]);
        WifiLabel.setBounds(10, 260, 300, 25);
        panel.add(   WifiLabel);


        areaLabel = new JLabel("Kitchen-Bath:"+" "+all[24]+" "+all[25]+" "+all[26]+" "+all[27]+" "+all[28]+" "+all[29]+" "+all[30]);
        areaLabel.setBounds(10, 290, 550, 25);
        panel.add(     areaLabel);

        outsideLabel = new JLabel("Outside:"+all[31]+" "+all[32]);
        outsideLabel .setBounds(10, 320, 300, 25);
        panel.add(     outsideLabel );

        parkingLabel = new JLabel("Parking:"+all[33]+" "+all[34]);
        parkingLabel .setBounds(10, 350, 300, 25);
        panel.add(     parkingLabel );



        button1 = new JButton("Add review");
        button1.setBounds(0, 390, 150, 25);
        button1.addActionListener(new ViewUserA());
        panel.add(button1);
        button2 = new JButton("Edit review");
        button2.setBounds(155, 390, 150, 25);
        button2.addActionListener(new ViewUserA());
        panel.add(button2);
        button3= new JButton("Delete review");
        button3.setBounds(0, 420, 150, 25);
        button3.addActionListener(new ViewUserA());
        panel.add(button3);
        button4= new JButton("Back");
        button4.setBounds(155, 420, 150, 25);
        button4.addActionListener(new ViewUserA());
        panel.add(button4);
        frame.setSize(300, 300);
        success = new JLabel("");
        success.setBounds(10, 450, 200, 25);
        panel.add(success);
  frame.add(panel);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals(button4.getText()))
        {
            frame.getContentPane().removeAll();
            frame.setVisible(false);
            oldFrame.setVisible(true);
        }
        else if(e.getActionCommand().equals(button1.getText()))
        {
            frame.setVisible(false
            );
            AddReview amazing= new AddReview();
            amazing.AddReview(frame,all[0],all[1],username);
        }
        else if (e.getActionCommand().equals(button2.getText()))
        {
            frame.setVisible(false);
            EditReview amazing1= new EditReview();
            try {
                amazing1.EditReview(frame,all[0],all[1],username);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if( e.getActionCommand().equals(button3.getText()))
        {
            ReviewFile wow=new ReviewFile();
            try {
                if(wow.DeleteReview(all[0],all[1],username))
                {
                    success.setText("Review has been deleted");
                }
                else
                {
                    success.setText("Review not found");
                }
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }


    }
}
