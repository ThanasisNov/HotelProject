package gui;

import api.start.App;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class  HotelList implements ActionListener, ListSelectionListener {

    private static JButton button1;
  private static  JFrame f= new JFrame();
   private static DefaultListModel<String> l1 = new DefaultListModel<>();
    private static JList<String> list = new JList<>(l1);

    private static ArrayList<Integer> temp= new ArrayList<>();
    JFrame getFrame()
    {
        return f;
    }

    void HotelList(ArrayList wow,ArrayList found)    {

        for(Object i :found)
        {
            temp.add((int)i);
        }

          for(Object i : wow)
          {
              l1.addElement(i.toString());
          }

          list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
          list.addListSelectionListener(this);
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


    @Override
    public void valueChanged(ListSelectionEvent e)
    {
       System.out.println(list.getSelectedValue()+temp.get(list.getSelectedIndex()));
       f.setVisible(false);
        ViewUserA t= new ViewUserA();
        try {
            t.ViewUserA(list.getSelectedValue(),temp.get(list.getSelectedIndex()));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


}