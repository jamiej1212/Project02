package address.gui;

import javax.swing.*;
import java.awt.*;

public class AddGUI extends JFrame
    {
        private JTextField firstName;
        private JTextField lastName;
        private JTextField street;
        private JTextField city;
        private JTextField state;
        private JTextField zip;
        private JTextField email;
        private JTextField phone;
        private JPanel panel;

       public void text()
       {
           JFrame f = new JFrame("Add");
           firstName = new JTextField("firstName");
           f.add(firstName);
           f.setSize(400,400);
           f.setLayout(null);
           f.setVisible(true);
       }




}
