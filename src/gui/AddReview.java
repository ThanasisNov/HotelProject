package gui;

import api.App;
import api.Feedback;
import api.JTextFieldLimit;
import api.ReviewFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddReview extends JFrame implements ActionListener
{


    private static JLabel review;
private static JLabel grade;
   private static JRadioButton  one,two,three,four,five;
   private static JButton button1;
   private static JButton button2;
   private static JTextField textfield;
   private static JLabel success;
    private static ButtonGroup amazing = new ButtonGroup();
    private static JFrame old_1;
    private static String host;
    private static  String bookingname_1;
    private static String username;
   public void AddReview (JFrame old,String Hostname,String bookingname,String user)
    {
old_1=old;
host=Hostname;
username=user;
bookingname_1=bookingname;
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(550, 100));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        review= new JLabel("Review:");
      this.add(review);
        textfield = new JTextField(15);

        JTextFieldLimit wow= new JTextFieldLimit(500);
        textfield.setDocument(new JTextFieldLimit(500));
        this.add(textfield);
        grade= new JLabel("Grade:");
        this.add(grade);

        one = new JRadioButton("1");

        this.add(one);
        two = new JRadioButton("2");

        this.add(two);

        three= new JRadioButton("3");

        this.add(three);

        four = new JRadioButton("4");

        this.add(four);
        five = new JRadioButton("5");

        this.add(five);

      one.setSelected(true);
        amazing.add(one);
        one.setActionCommand("1");
        amazing.add(two);
        two.setActionCommand("2");
        amazing.add(three);
        three.setActionCommand("3");
        amazing.add(four);
        four.setActionCommand("4");
        amazing.add(five);
        five.setActionCommand("5");
        button1= new JButton("Submit");
        this.add(button1);
button1.addActionListener( this);
button2=new JButton("Back");
button2.addActionListener(this);
this.add(button2);
        success= new JLabel("");
        this.add(success);
this.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
       App w= new App();
       if(e.getActionCommand().equals("Submit"))
       {
           Feedback object = new Feedback();
           object.Amazing(textfield.getText(),Integer.valueOf(amazing.getSelection().getActionCommand()));
           ReviewFile file= new ReviewFile();
           try {
               if(file.AlreadyExists(host,bookingname_1,username)) {
                   try {
                       file.AddR(w.CommaChanger(username), w.CommaChanger(host), w.CommaChanger(bookingname_1), w.CommaChanger(object.getFeedback()), object.getRating());
                       success.setText("Submit was successful");
                   } catch (IOException ex) {
                       System.out.println("Error in AddReview GUI");
                       throw new RuntimeException(ex);
                   }
               }
               else
               {
                   success.setText("You have already submitted your review");
               }
           } catch (FileNotFoundException ex) {
               throw new RuntimeException(ex);
           }

       }
       else if(e.getActionCommand().equals(button2.getText()))
       {
           one.setSelected(true);
           success.setText("");
           this.setVisible(false);
           old_1.setVisible(true);

       }

    }
}

