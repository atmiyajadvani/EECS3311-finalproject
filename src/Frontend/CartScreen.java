package Frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CartScreen extends JFrame implements CartListener {
    private JPanel topPanel;
    private JPanel middlePanel;
    private JPanel bottomPanel;
    private JScrollPane scrollPane;
    private JButton backButton;
    private JButton checkoutButton;
    private JTextField promoCodeField;
    private JButton promoCodeButton;
    private ChoosePaymentScreen paymentScreen;
    private List<StudentPhysicalItemScreen.Item> cartItems;
    private static int userId;

    public CartScreen(int userId) {
        this.userId = userId;

        setTitle("Cart Screen");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        topPanel = new JPanel();
        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBack();
            }
        });
        topPanel.add(backButton);

        middlePanel = new JPanel();
        middlePanel.setBackground(Color.WHITE);
        middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS));

        bottomPanel = new JPanel();
        checkoutButton = new JButton("Checkout");
        // promoCodeField = new JTextField(15);
        // promoCodeButton = new JButton("Go");
        // promoCodeButton.addActionListener(new ActionListener() {
        // public void actionPerformed(ActionEvent e) {
        // applyPromoCode();
        // }
        // });

        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (canRentMoreItems(userId)) {
                    goToPaymentScreen();
                } else {
                    JOptionPane.showMessageDialog(getParent(), "You have more than 10 items currently rented.");
                }
            }
        });

        bottomPanel.add(new JLabel("Enter promo code: "));
        // bottomPanel.add(promoCodeField);
        // bottomPanel.add(promoCodeButton);
        bottomPanel.add(checkoutButton);

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(middlePanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        cartItems = new ArrayList<>();
        paymentScreen = new ChoosePaymentScreen(userId);
        loadCartItemsFromCSV();
        refreshCartView();

    }

    private boolean canRentMoreItems(int userID) {
        BufferedReader br = null;
        FileWriter writer = null;

        try {
            br = new BufferedReader(new FileReader("src/UI/UserInfoSpreadsheet.csv"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(Integer.toString(userID))) {
                    return Integer.parseInt(data[6]) <= 10;
                }
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

        return true;
    }

    private void goBack() {
        String role = getUserRole(userId);
        dispose();
        switch (role.toLowerCase()) {
            case "student":
            case "visitor":
                new StudentDashboard(userId).setVisible(true);
                break;
            case "faculty":
            case "staff":
                new FacultyDashboard(userId).setVisible(true);
                break;
            case "manager":
                new ManagerDashboard(userId).setVisible(true);
                break;
            default:
                // Handle unknown role
        }
    }

    private void loadCartItemsFromCSV() {
        String csvFile = "src/UI/userIdtoCart.csv";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                if (id == userId) {
                    for (int i = 1; i < data.length; i += 2) {
                        String itemId = data[i];
                        // Retrieve item details from wherever you store them
                        StudentPhysicalItemScreen.Item item = retrieveItemDetails(itemId);
                        if (item != null) {
                            cartItems.add(item);
                        }
                    }
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private StudentPhysicalItemScreen.Item retrieveItemDetails(String itemId) {
        // Implement logic to retrieve item details based on itemId
        // For example, you might fetch details from a database or another CSV file
        return null; // Placeholder return statement
    }

    public void setCartItems(List<StudentPhysicalItemScreen.Item> cartItems) {
        this.cartItems = cartItems;
    }

    private void refreshCartView() {
        middlePanel.removeAll();
        for (StudentPhysicalItemScreen.Item item : cartItems) {
            JLabel label = new JLabel(item.toString());
            label.setFont(label.getFont().deriveFont(Font.PLAIN, 16));
            label.setAlignmentX(Component.LEFT_ALIGNMENT);
            middlePanel.add(label);
            middlePanel.add(Box.createVerticalStrut(10));
        }
        middlePanel.revalidate();
        middlePanel.repaint();
    }

    // private void applyPromoCode() {
    // String promoCode = promoCodeField.getText().trim();
    // if (promoCode.equals("sixty60")) {
    // loadItems(2);
    // } else if (promoCode.equals("fo40")) {
    // loadItems(3);
    // }
    // }

    private void goToPaymentScreen() {
        paymentScreen.setCartItems(cartItems);
        paymentScreen.setVisible(true);
        this.setVisible(false);
    }

    private void loadItems(int num) {
        middlePanel.removeAll();
        middlePanel.revalidate();
        middlePanel.repaint();

        ArrayList<String> items = readItemsFromCSV(userId, num);

        if (items.isEmpty()) {
            middlePanel.add(new JLabel("There are no items in your cart."));
        } else {
            for (String item : items) {
                JLabel label = new JLabel(item);
                label.setFont(label.getFont().deriveFont(Font.PLAIN, 16));
                label.setAlignmentX(Component.LEFT_ALIGNMENT);
                middlePanel.add(label);
                middlePanel.add(Box.createVerticalStrut(10));
            }
        }
    }

    private ArrayList<String> readItemsFromCSV(int userId, int flag) {
        ArrayList<String> items = new ArrayList<>();
        String csvFile = "src/UI/userIdtoCart.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int integerNum = Integer.parseInt(data[0]);
                if (integerNum == (userId)) {
                    for (int i = 1; i < data.length; i += 2) {
                        if (flag == 1) {
                            items.add("[" + data[i] + "] - " + data[i + 1]
                                    + " | Location: Scott Library | Purchase from online store. - $4.25");
                        } else if (flag == 2) {
                            items.add("[" + data[i] + "] - " + data[i + 1]
                                    + " | Location: Scott Library | Purchase from online store. - $4.25 | 60% OFF → $1.70");
                        } else {
                            items.add("[" + data[i] + "] - " + data[i + 1]
                                    + " | Location: Scott Library | Purchase from online store. - $4.25 | 40% OFF → $2.55");
                        }
                    }
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }

    private String getUserRole(int userId) {
        String csvFile = "src/UI/UserInfoSpreadsheet.csv";
        String line;
        String role = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); // Skip the first line
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                if (id == userId) {
                    role = data[3];
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return role;
    }

    public static void main(String[] args) {
        CartScreen cartScreen = new CartScreen(userId);
        cartScreen.setVisible(true);
    }

    @Override
    public void itemAddedToCart(StudentPhysicalItemScreen.Item item) {
        cartItems.add(item);
        refreshCartView();
    }
}
