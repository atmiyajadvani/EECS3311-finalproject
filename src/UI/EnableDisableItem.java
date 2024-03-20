package UI;

import javax.swing.*;
import java.awt.*;

public class EnableDisableItem extends JFrame {

    public EnableDisableItem() { initializeUI(); }

    private void initializeUI() {
        setTitle("Manager Dashboard - Enable/Disable Item");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }
}