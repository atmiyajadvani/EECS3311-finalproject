package UI;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    private JList<String> itemList;

    public Dashboard() {
        setTitle("Dashboard App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add components
        JPanel panel = new JPanel();
        JLabel titleLabel = new JLabel("Student Dashboard");
        JButton button1 = new JButton("Request a Book");
        JButton button2 = new JButton("Request a Newsletter");

        // Create the list with items
        itemList = new JList<>(new String[]{"Atomic Habits", "Rich Dad Poor Dad", "Atomic Habits"});
        itemList.setCellRenderer(new CenteredListItemRenderer()); // Set custom cell renderer

        JButton button3 = new JButton("Sign Out");

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(titleLabel)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(button1)
                                .addComponent(button2))
                        .addComponent(itemList, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button3)
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button1)
                                .addComponent(button2))
                        .addComponent(itemList, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button3)
        );

        add(panel);
    }

    // Custom cell renderer to center align list items
    private class CenteredListItemRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            label.setHorizontalAlignment(JLabel.CENTER); // Center align list items
            return label;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
        });
    }
}
