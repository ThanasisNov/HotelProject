package gui;

import api.start.App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class  HotelList implements ActionListener {

    private static JButton button1;
  private static  JFrame f= new JFrame();


    JFrame getFrame()
    {
        return f;
    }

    void HotelList(ArrayList wow)    {


            DefaultListModel<String> l1 = new DefaultListModel<>();
          for(Object i : wow)
          {
              l1.addElement(i.toString());
          }


            JList<String> list = new JList<>(l1);
            list.setBounds(0,0, 1000,75);
            f.add(list);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500,500);
        button1= new JButton("Back");
        button1.setBounds(185, 170, 85, 25);
        button1.addActionListener(new HotelList());
        f.add(button1);
            f.setLayout(null);
            f.setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent e) {


        App object = new App();
        if (e.getActionCommand().equals(button1.getText())) {
            f.setVisible(false);
          f.getContentPane().removeAll();

          Search era= new Search();
          era.Search();
        }


    }
}