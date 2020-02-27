package proj02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressBookGUI
{
    private JPanel window01;
    private JPanel window02;
    private JScrollPane scrollPanel;
    private JButton displayButton;
    private JButton newButton;
    private JButton removeButton;
    private JPanel box;

    public static void main(String args[])
    {
        AddressBookGUI inst = new AddressBookGUI();
        JFrame frame = new JFrame("Address Book");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(inst.windowBox());
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel windowBox()
    {
        box = new JPanel();
        box.setLayout(new BorderLayout());
        box.add(firstWindow(), BorderLayout.CENTER);
        box.add(secondWindow(), BorderLayout.SOUTH);

        return box;
    }

    private JPanel firstWindow()
    {
        window01 = new JPanel();
        scrollPanel = new JScrollPane();
        scrollPanel.setPreferredSize(new Dimension(200,100));
        scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        window01.add(scrollPanel, BorderLayout.NORTH);

        return window01;
    }

    private JPanel secondWindow()
    {
        AddressBook ab = new AddressBook();
        AddressEntry ae = new AddressEntry("Jane", "Doe", "123 Abc st", "San Jose", "CA",
                95117, "408-111-1111", "janed@gmail.com");

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
                ab.add(ae);
            }
        });
        displayButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ab.list();
            }
        });
        removeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ab.remove("Do");
            }
        });


        window02.add(newButton);
        window02.add(displayButton);
        window02.add(removeButton);

        return window02;
    }

}
