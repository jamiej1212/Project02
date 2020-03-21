package address.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/********************************************
 * AddressBookGUI
 * Builds graphical user interface for address book
 ********************************************/
public class AddressBookGUI
{
    private JPanel window02;
    private JButton displayButton;
    private JButton newButton;
    private JButton removeButton;
    private JPanel box;

    /**
     * Main method
     * Creates JFrame instance and adds implemented panels onto the frame
     * @param args
     */
    public static void main(String args[])
    {
        AddressBookGUI inst = new AddressBookGUI();
        JFrame frame = new JFrame("Address Book");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(inst.windowBox());
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Creates a JPanel instance and adds windows on panel
     * @return panel
     */
    private JPanel windowBox()
    {
        box = new JPanel();
        box.setLayout(new BorderLayout());
        box.add(secondWindow(), BorderLayout.SOUTH);

        return box;
    }


    /**
     * Creates a panel and adds three buttons on it
     * Each button has own action
     * @return a panel with buttons
     */
    private JPanel secondWindow()
    {

        window02 = new JPanel();
        newButton = new JButton("New");
        displayButton = new JButton("Display");
        removeButton = new JButton("Remove");

        newButton.setPreferredSize(new Dimension(80, 30));
        displayButton.setPreferredSize(new Dimension(80, 30));
        removeButton.setPreferredSize(new Dimension(80, 30));

        newButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                AddGUI a = new AddGUI();
                a.NewScreen();


            }
        });
        displayButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });
        removeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });


        window02.add(newButton);
        window02.add(displayButton);
        window02.add(removeButton);

        return window02;
    }

}