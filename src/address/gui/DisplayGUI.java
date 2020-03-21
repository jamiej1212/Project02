package address.gui;

import javax.swing.*;
import java.awt.*;

public class DisplayGUI {
    private JFrame frmClass;

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
        frmClass = new JFrame("New Address Entry");
        frmClass.setBounds(600, 600, 600, 600);
        frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmClass.setLayout(new FlowLayout());
    }
}
