package address.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddGUI
{
    private JPanel window;

    private JPanel jPanelLabels;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel streetLabel;
    private JLabel cityLabel;
    private JLabel stateLabel;
    private JLabel zipLabel;

    private JPanel jPanelTextFields;
    private JTextField enterFirstNameTextField;
    private JTextField enterLastNameTextField;
    private JTextField enterStreetTextField;
    private JTextField enterCityTextField;
    private JTextField enterStateTextField;
    private JTextField enterZipTextField;
    private JButton addButton;

    private JFrame frmClass;

    public static void NewScreen()
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    AddGUI window = new AddGUI();
                    window.frmClass.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AddGUI() {
        initialize();
    }

    private void initialize()
    {
        frmClass = new JFrame("New Address Entry");
        frmClass.setBounds(600, 600, 600, 600);
        frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmClass.setLayout(new FlowLayout());


        frmClass.add(window2());
        frmClass.add(window3());

    }

    private JPanel window2()
    {
        jPanelLabels = new JPanel();
        jPanelLabels.setLayout(new BoxLayout(jPanelLabels, BoxLayout.PAGE_AXIS));
        jPanelLabels.add(firstNameLabel);
        jPanelLabels.add(lastNameLabel);
        jPanelLabels.add(streetLabel);
        jPanelLabels.add(cityLabel);
        jPanelLabels.add(stateLabel);

        firstNameLabel = new JLabel("First Name: ");
        firstNameLabel.setPreferredSize(new Dimension(130,30));

        lastNameLabel = new JLabel("Last Name: ");
        lastNameLabel.setPreferredSize(new Dimension(130,30));

        streetLabel = new JLabel("Street: ");
        streetLabel.setPreferredSize(new Dimension(130,30));

        cityLabel = new JLabel("City: ");
        cityLabel.setPreferredSize(new Dimension(130,30));

        stateLabel = new JLabel("State: ");
        stateLabel.setPreferredSize(new Dimension(130, 30));

        zipLabel = new JLabel("Zip: ");
        stateLabel.setPreferredSize(new Dimension(130, 30));

        return jPanelLabels;
    }

    private JPanel window3()
    {
        jPanelTextFields = new JPanel();
        jPanelTextFields.setLayout(new BoxLayout(jPanelTextFields, BoxLayout.PAGE_AXIS));
        jPanelTextFields.add(enterFirstNameTextField);
        jPanelTextFields.add(enterLastNameTextField);
        jPanelTextFields.add(enterStreetTextField);
        jPanelTextFields.add(enterCityTextField);
        jPanelTextFields.add(enterStateTextField);
        jPanelTextFields.add(enterZipTextField);

        enterFirstNameTextField = new JTextField("Enter first name");
        enterFirstNameTextField.setPreferredSize(new Dimension(130, 30));

        enterLastNameTextField = new JTextField("Enter last name");
        enterLastNameTextField.setPreferredSize(new Dimension(130, 30));

        enterStreetTextField = new JTextField("Enter street");
        enterLastNameTextField.setPreferredSize(new Dimension(130, 30));

        enterCityTextField = new JTextField("Enter city");
        enterLastNameTextField.setPreferredSize(new Dimension(130, 30));

        enterStateTextField = new JTextField("Enter state");
        enterLastNameTextField.setPreferredSize(new Dimension(130, 30));

        enterZipTextField = new JTextField("Enter zip");
        enterZipTextField.setPreferredSize(new Dimension(130, 30));

        // button to add entry to database
        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });
        jPanelTextFields.add(addButton);

        return jPanelTextFields;

    }


}
