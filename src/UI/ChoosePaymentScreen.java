package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ChoosePaymentScreen extends JFrame {
    private JLabel cartLabel;
    private JRadioButton creditCardRadio;
    private JRadioButton debitCardRadio;
    private JRadioButton paypalRadio;
    private List<StudentPhysicalItemScreen.Item> cartItems;

    public ChoosePaymentScreen() {
        setTitle("Payment GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        cartLabel = new JLabel("Items in Cart: ");

        creditCardRadio = new JRadioButton("Credit Card");
        debitCardRadio = new JRadioButton("Debit Card");
        paypalRadio = new JRadioButton("PayPal");

        ButtonGroup paymentGroup = new ButtonGroup();
        paymentGroup.add(creditCardRadio);
        paymentGroup.add(debitCardRadio);
        paymentGroup.add(paypalRadio);

        JButton payButton = new JButton("Proceed to Pay");
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proceedToPay();
            }
        });

        JPanel mainPanel = new JPanel(new GridLayout(4, 1));
        mainPanel.add(cartLabel);
        mainPanel.add(creditCardRadio);
        mainPanel.add(debitCardRadio);
        mainPanel.add(paypalRadio);

        add(mainPanel, BorderLayout.CENTER);
        add(payButton, BorderLayout.SOUTH);
    }

    private void proceedToPay() {
        int itemsInCart = cartItems.size();
        String selectedPaymentMethod = getSelectedPaymentMethod();
        JOptionPane.showMessageDialog(this,
                "Items in Cart: " + itemsInCart + "\nSelected Payment Method: " + selectedPaymentMethod,
                "Payment Details",
                JOptionPane.INFORMATION_MESSAGE);
        if (selectedPaymentMethod.equals("Debit Card")) {
            PayWithDebitScreen debitScreen = new PayWithDebitScreen();
            debitScreen.setCartItems(cartItems); // Pass the cart items to the PayWithDebitScreen
            debitScreen.setVisible(true);
            saveCart(cartItems, 1002); // Save cart items to CSV after payment is completed, replace 1002 with actual user ID
            this.setVisible(false); // Hide the ChoosePaymentScreen
        } else {
            // Handle other payment methods
        }
    }

    private String getSelectedPaymentMethod() {
        if (creditCardRadio.isSelected()) {
            return "Credit Card";
        } else if (debitCardRadio.isSelected()) {
            return "Debit Card";
        } else if (paypalRadio.isSelected()) {
            return "PayPal";
        } else {
            return "No payment method selected";
        }
    }

    public void setCartItems(List<StudentPhysicalItemScreen.Item> cartItems) {
        this.cartItems = cartItems;
    }

    private void saveCart(List<StudentPhysicalItemScreen.Item> cartItems, int userId) {
        String csvFile = "src/UI/UserBooksBrought.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            for (StudentPhysicalItemScreen.Item item : cartItems) {
                writer.println(userId + "," + item.getId() + "," + item.getName() + "," + item.getAuthor() + "," + item.getItemType());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChoosePaymentScreen().setVisible(true);
            }
        });
    }
}
