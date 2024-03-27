package Frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PayWithDebitScreen extends JFrame {
    private JLabel totalPriceLabel;
    private JTextField cardholderNameField;
    private JTextField cardNumberField;
    private JTextField cvvField;
    private JTextField expirationDateField;
    private List<StudentPhysicalItemScreen.Item> cartItems;
    private double totalPrice;
    private int userID;

    public PayWithDebitScreen(int userID, double totalPrice) {
        this.userID = userID;
        this.totalPrice = totalPrice;
        setTitle("Checkout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        totalPriceLabel = new JLabel("Total Price: $" + String.format("%.2f", totalPrice));

        JLabel cardholderNameLabel = new JLabel("Cardholder's Name:");
        cardholderNameField = new JTextField();

        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberField = new JTextField();

        JLabel cvvLabel = new JLabel("CVV:");
        cvvField = new JTextField();

        JLabel expirationDateLabel = new JLabel("Expiration Date (MM/YYYY):");
        expirationDateField = new JTextField();

        JButton processButton = new JButton("Process Payment");
        processButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processPayment();
            }
        });

        JPanel mainPanel = new JPanel(new GridLayout(6, 2));
        mainPanel.add(totalPriceLabel);
        mainPanel.add(new JLabel()); // Spacer
        mainPanel.add(cardholderNameLabel);
        mainPanel.add(cardholderNameField);
        mainPanel.add(cardNumberLabel);
        mainPanel.add(cardNumberField);
        mainPanel.add(cvvLabel);
        mainPanel.add(cvvField);
        mainPanel.add(expirationDateLabel);
        mainPanel.add(expirationDateField);

        add(mainPanel, BorderLayout.CENTER);
        add(processButton, BorderLayout.SOUTH);
    }

    private void processPayment() {
        // Get the entered card details
        String cardholderName = cardholderNameField.getText();
        String cardNumber = cardNumberField.getText();
        String cvv = cvvField.getText();
        String expirationDate = expirationDateField.getText();

        // Display a message with the total price and card details
        String message = "Total Price: $" + String.format("%.2f", totalPrice) + "\n\nCardholder's Name: " +
                cardholderName + "\nCard Number: " + cardNumber + "\nCVV: " + cvv +
                "\nExpiration Date: " + expirationDate;
        JOptionPane.showMessageDialog(this, message, "Payment Details", JOptionPane.INFORMATION_MESSAGE);

        // Update info
        updateUserInfo();
        updateItemQuantity();

        // Save cart items to CSV after payment is completed
        saveCart(cartItems, userID); // Replace 1002 with actual user ID

        // go back
        dispose();
        new StudentPhysicalItemScreen(userID).setVisible(true);
    }

    public void setCartItems(List<StudentPhysicalItemScreen.Item> cartItems) {
        this.cartItems = cartItems;
    }

    private void saveCart(List<StudentPhysicalItemScreen.Item> cartItems, int userId) {
        String csvFile = "src/Database/UserBooksBrought.csv";
        int daysBorrowed = 0;
        String isLost = "no";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            for (StudentPhysicalItemScreen.Item item : cartItems) {
                writer.println(userId + "," + item.getId() + "," + item.getName() + "," + item.getAuthor() + "," + item.getItemType() + "," + daysBorrowed + "," + isLost);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateUserInfo() {
        BufferedReader br = null;
        FileWriter writer = null;
        String line = "";
        List<String[]> rows = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader("src/Database/UserInfoSpreadsheet.csv"));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(Integer.toString(userID))) {
                    data[6] = String.valueOf(Integer.parseInt(data[6]) + cartItems.size());
                }
                rows.add(data);
            }

            writer = new FileWriter("src/Database/UserInfoSpreadsheet.csv");
            for (String[] rowData : rows) {
                writer.append(String.join(",", rowData));
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (writer != null) writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void updateItemQuantity() {
        BufferedReader br = null;
        FileWriter writer = null;
        String line = "";
        List<String[]> rows = new ArrayList<>();
        List<String> itemIDs = new ArrayList<>();

        for (StudentPhysicalItemScreen.Item item : cartItems) {
            itemIDs.add(item.getId());
        }

        try {
            br = new BufferedReader(new FileReader("src/Database/ItemSpreadsheet.csv"));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (itemIDs.contains(data[0])) {
                    data[4] = String.valueOf(Integer.parseInt(data[4]) - 1);
                }
                rows.add(data);
            }

            writer = new FileWriter("src/Database/ItemSpreadsheet.csv");
            for (String[] rowData : rows) {
                writer.append(String.join(",", rowData));
                writer.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
                if (writer != null) writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
