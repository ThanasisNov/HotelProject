package gui;

import api.App;
import api.ReviewFile;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class  ReviewList  implements ActionListener, ListSelectionListener {

    private static JButton button1;
    private static  JFrame f= new JFrame();
    private static DefaultListModel<String> l1 = new DefaultListModel<>();
    private static JList<String> list = new JList<>(l1);

    private static ArrayList<Integer> temp= new ArrayList<>();
    JFrame getFrame()
    {
        return f;
    }
    private static String username;
    private static JFrame old;
    private static JLabel av;
    void ReviewList(JFrame old2,String user) throws IOException {
        temp.clear();
        l1.removeAllElements();
        username=user;
        old=old2;

        f.setLayout(new FlowLayout());
        ReviewFile test= new ReviewFile();
        for(Object x : test.SearchReviewofUser(username))
        {

            l1.addElement(x.toString());
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
        av= new JLabel();
        String t=String.format("%.2f", test.getAverage());
        av.setText("Average Grade:"+t);
        f.add(av);
        button1= new JButton("Back");
        button1.setBounds(185, 170, 85, 25);
        button1.addActionListener(new ReviewList());

        f.add(button1);
        f.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {


        App object = new App();
        if (e.getActionCommand().equals(button1.getText())) {
            old.setVisible(true);
            f.setVisible(false);
            f.getContentPane().removeAll();
        }




    }


    @Override
    public void valueChanged(ListSelectionEvent e)
    {

        ViewUserA t= new ViewUserA();
        if(!list.isSelectionEmpty()) {
            try {
                String[] temp2 = list.getSelectedValue().split(" ");
                t.ViewUserA(temp2[0], f,username);
                f.setVisible(false);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }


}