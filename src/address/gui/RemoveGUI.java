package address.gui;

import javax.swing.*;
import java.awt.*;

public class RemoveGUI {

    private JFrame frmClass;

    public static void NewScreen()
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    RemoveGUI window = new RemoveGUI();
                    window.frmClass.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public RemoveGUI() {
        initialize();
    }

    private void initialize()
    {
        frmClass = new JFrame("Remove an Address Entry");
        frmClass.setBounds(600, 600, 600, 600);
        frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmClass.setLayout(new FlowLayout());
    }
}
