package gui;

import api.EditFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class YES_NO implements ActionListener{
    public static JButton yes;
    public static JButton no;
    public static JLabel label = new JLabel();
    private static JFrame frame = new JFrame();
    private static String line;

    void setFrame(JFrame frame)
    {
        this.frame=frame;
    }

    public Component getFrame() {return frame;}

    public void choice(String ltd)
    {
        String[] splited = ltd.split(",");

        line = ltd;
        setFrame(frame);
        JPanel panel = new JPanel();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        yes = new JButton("Yes");
        yes.setBounds(30,70,70,25);
        yes.addActionListener((ActionListener) new YES_NO());
        panel.add(yes);
        no = new JButton("No");
        no.setBounds(150,70,70,25);
        no.addActionListener((ActionListener) new YES_NO());
        panel.add(no);
        label.setText("Do you want to delete "+splited[1]+"?");
        label.setBounds(40,40,200,25);
        panel.add(label);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getActionCommand().equals(yes.getText())) {
            try {
                EditFile ef = new EditFile();
                ef.remove(line);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.setVisible(false);
            UserB wow= new UserB();
            wow.getFrame().setVisible(true);
        }
        else if (e.getActionCommand().equals(no.getText())){
             frame.setVisible(false);
            Deleting wow = new Deleting();
            wow.getFrame().setVisible(true);


        }

    }



}
