package address.gui;

import address.DBConnection;

import javax.swing.*;
import java.awt.*;

public class DisplayGUI {
    private JFrame frmClass;
    private JPanel panel;
    private JTable table;
    private JScrollPane scrollPane;

    public static void NewScreen()
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    DisplayGUI window = new DisplayGUI();
                    window.frmClass.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public DisplayGUI() {
      initialize();
    }

    private void initialize()
    {
        frmClass = new JFrame("Display Address Entries");
        frmClass.setBounds(600, 600, 600, 600);
        frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmClass.getContentPane().setLayout(null);

        frmClass.add(createTable(), BorderLayout.SOUTH);
    }

    private JPanel createTable()
    {
        panel = new JPanel();

        DBConnection con = new DBConnection();
        JTable t = new JTable();
        frmClass.getContentPane().add(t);

        return panel;
    }

}
