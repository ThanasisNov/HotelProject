package gui;

import api.App;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class  HotelList implements ActionListener, ListSelectionListener {

    private static JButton button1;
    private static JButton Refresh;
  private static  JFrame f= new JFrame();
   private static DefaultListModel<String> l1 = new DefaultListModel<>();
    private static JList<String> list = new JList<>(l1);

    private static ArrayList<Integer> temp= new ArrayList<>();
    JFrame getFrame()
    {
        return f;
    }
    private static ArrayList wow1,found1;

private static String username;
    void HotelList(ArrayList wow,ArrayList found,String user) throws IOException {
temp.clear();
l1.removeAllElements();
username=user;
wow1=wow;
found1=found;
        for(Object i :found)
        {
            temp.add((int)i);

        }
        App test= new App();

          for(int i : temp)
          {

              l1.addElement(test.StringMaker(i));
          }
          list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
          list.addListSelectionListener(this);
          list.setBounds(0,0, 400,110);
        f.add(list);
        JScrollPane scrollPne = new JScrollPane(list);
        scrollPne.setBounds(0,0, 400,110);
        f.add(scrollPne);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f.setSize(500,500);
          button1= new JButton("Back");
          button1.setBounds(185, 170, 85, 25);
          button1.addActionListener(new HotelList());
        Refresh= new JButton("Refresh");
        Refresh.setBounds(110, 170, 85, 25);
        Refresh.addActionListener(new HotelList());
        f.add(Refresh);
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
          era.Search(username);
        }
else if(e.getActionCommand().equals(Refresh.getText()))
        {
            f.setVisible(false);
            f.getContentPane().removeAll();
            HotelList era= new HotelList();
            try {
                era.HotelList(wow1,found1,username);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }



    }


    @Override
    public void valueChanged(ListSelectionEvent e)
    {


        if(!list.isSelectionEmpty()) {
            try {
                ViewUserA t= new ViewUserA();
                String[] temp2 = list.getSelectedValue().split(",");

                t.ViewUserA(temp2[0], f,username);
                f.setVisible(false);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }


}