package address.gui;

import javax.swing.*;
import java.awt.*;

public class AddGUI extends JFrame
{
    private JPanel outPanel;
    private JPanel newWindowContainer;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel firstLabel;
    private JLabel lastLabel;
    private JLabel streetLabel;
    private JLabel cityLabel;
    private JLabel stateLabel;
    private JLabel zipLabel;
    private JLabel emailLabel;
    private JLabel phoneLabel;
    private JTextField firstName;
    private JTextField lastName;
    private JTextField street;
    private JTextField state;
    private JTextField city;
    private JTextField zip;
    private JTextField email;
    private JTextField phone;
    private JButton addButton;


    public static void main(String args[])
    {
        JFrame jf = new JFrame();
        JPanel outPanel = new JPanel();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setContentPane(outPanel);
        jf.pack();
        jf.setSize(1000, 500);
        jf.setVisible(true);

    }

    public JPanel panel01()
    {
        outPanel.setLayout(new BorderLayout());
        outPanel.add(panel02(), BorderLayout.CENTER);
        outPanel.add(container(), BorderLayout.EAST);
        outPanel.add(panel02(), BorderLayout.SOUTH);

        return outPanel;
    }

    public JPanel container()
    {
        newWindowContainer = new JPanel();

        firstName = new JTextField(30);
        lastName = new JTextField(30);
        street = new JTextField(30);
        city = new JTextField(30);
        state = new JTextField(30);
        zip = new JTextField(30);
        email = new JTextField(30);
        phone = new JTextField(30);

        newWindowContainer.add(firstName);
        newWindowContainer.add(lastName);
        newWindowContainer.add(street);
        newWindowContainer.add(city);
        newWindowContainer.add(state);
        newWindowContainer.add(zip);
        newWindowContainer.add(email);
        newWindowContainer.add(phone);
        newWindowContainer.add(addButton);

        return newWindowContainer;
    }

    public JPanel panel02()
    {
        panel2 = new JPanel();

        setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
        firstLabel = new JLabel("First Name: ");
        lastLabel = new JLabel("Last Name: ");
        streetLabel = new JLabel("Street: ");
        stateLabel = new JLabel("State: ");
        cityLabel = new JLabel("City: ");
        zipLabel = new JLabel("Zip: ");
        emailLabel = new JLabel("Email: ");
        phoneLabel = new JLabel("Phone: ");

        panel2.add(firstLabel);
        panel2.add(lastLabel);
        panel2.add(streetLabel);
        panel2.add(stateLabel);
        panel2.add(cityLabel);
        panel2.add(zipLabel);
        panel2.add(emailLabel);
        panel2.add(phoneLabel);
        panel3.add(addButton);

        return panel2;
    }

    public JPanel panel03()
    {
        panel3 = new JPanel();
        JButton addButton = new JButton();
        addButton.setPreferredSize(new Dimension(50, 30));

        return panel3;

    }

}
