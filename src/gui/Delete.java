package gui;

import api.App;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Delete implements ActionListener, ListSelectionListener
{

    private static JButton buttonback ;

    private static String username;

    private JList <String>guihotelnames;
    private static JFrame frame = new JFrame();
    ArrayList<String> useradds = new ArrayList<String>();

    private static JButton buttonRefresh;




    void setFrame(JFrame frame)
    {
        this.frame=frame;
    }
    JFrame getFrame()
    {
        return frame;
    }


    void Delete(String name) throws FileNotFoundException {
        String str ;
        username = name;
        DefaultListModel<String> hotelnames = new DefaultListModel<String>();
        int i = 0;
        Scanner myReader = new Scanner(new File("AddBase.txt"));


        setFrame(frame);
        JPanel panel = new JPanel();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);



        buttonback = new JButton("Back ");
        buttonback.setBounds(1, 400, 100, 25);
        buttonback.addActionListener(new Delete());
        frame.add(buttonback);
        buttonRefresh = new JButton("Refresh ");
        buttonRefresh.setBounds(130, 400, 100, 25);
        buttonRefresh.addActionListener(new Delete());
        frame.add(buttonRefresh);

        while(myReader.hasNext())
        {
            str = myReader.nextLine();
            String[] splited = str.split(",");
            String nm = splited[0];
            if(nm.equals(username))
            {
                useradds.add(str);
                hotelnames.addElement(splited[1]);
                i++;
            }
        }
        guihotelnames = new JList<>(hotelnames);
        guihotelnames.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        guihotelnames.addListSelectionListener(this);
        guihotelnames.setBounds(0,0,100,200);
        guihotelnames.setVisibleRowCount(7);
        guihotelnames.setVisible(true);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(guihotelnames);
        //frame.add(scrollPane);
        frame.add(guihotelnames);
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {



        if (e.getActionCommand().equals(buttonback.getText())) {
            frame.setVisible(false);

            UserB wow= new UserB();
            wow.getFrame().setVisible(true);
        }
        else  if (e.getActionCommand().equals(buttonRefresh.getText())) {

            frame.getContentPane().removeAll();
            frame.setVisible(false);
            Delete test = new Delete();
            try {

                test.Delete(username);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }

    }


    @Override
    public void valueChanged(ListSelectionEvent e)
    {
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(false);
        Deleting era = new Deleting();
        try {
            era.deleting(useradds.get(guihotelnames.getSelectedIndex()), username);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }


    }

}


