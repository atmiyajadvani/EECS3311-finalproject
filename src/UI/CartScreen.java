package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
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
        int def = 1;

        setTitle("Cart Screen");
        // Dynamically adjust window size
        setSize(1200, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        topPanel = new JPanel();
        backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to go back
                System.out.println(1);
                // Read the user's role from UserInfoSpreadsheet.csv
                String role = getUserRole(1002);
                dispose();
                // Redirect the user based on their role
                if (role.equalsIgnoreCase("student") || role.equalsIgnoreCase("visitor")) {
                    StudentDashboard studentDashboard = new StudentDashboard(userId);
                    studentDashboard.setVisible(true);
                } else if (role.equalsIgnoreCase("faculty") || role.equalsIgnoreCase("staff")) {
                    FacultyDashboard facultyDashboard = new FacultyDashboard(userId);
                    facultyDashboard.setVisible(true);
                } else if (role.equalsIgnoreCase("manager")) {
                    ManagerDashboard managerDashboard = new ManagerDashboard(userId);
                    managerDashboard.setVisible(true);
                }
            }
        });
        topPanel.add(backButton);

        middlePanel = new JPanel();
        middlePanel.setBackground(Color.WHITE); // Set white background
        middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.Y_AXIS)); // Use BoxLayout for vertical arrangement

        loadItems(1);

        bottomPanel = new JPanel();
        checkoutButton = new JButton("Checkout");
        promoCodeField = new JTextField(15);
        promoCodeButton = new JButton("Go");
        promoCodeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("got here");
                String promoCode = promoCodeField.getText().trim();
                if (promoCode.equals("sixty60")) {
                    System.out.println("gothere2");
                    loadItems(2);
                }
                if (promoCode.equals("fo40")) {
                    System.out.println("gethere3");
                    loadItems(3);
                }

            }
        });
        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goToPaymentScreen();
            }
        });


        bottomPanel.add(new JLabel("Enter promo code: "));
        bottomPanel.add(promoCodeField);
        bottomPanel.add(promoCodeButton);
        bottomPanel.add(checkoutButton);

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(middlePanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        cartItems = new ArrayList<>();
        paymentScreen = new ChoosePaymentScreen();
        loadCartItemsFromCSV();
        refreshCartView();

    }


    public int getCartItemCount() {
        return cartItems.size();
    }



    private void goToPaymentScreen() {
        paymentScreen.setCartItems(cartItems);
        paymentScreen.setVisible(true);
        this.setVisible(false); //
    }



    @Override
    public void itemAddedToCart(StudentPhysicalItemScreen.Item item) {
        cartItems.add(item);
        refreshCartView();
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




    private void loadItems(int num) {
        // Clear existing items from middlePanel
        middlePanel.removeAll();
        middlePanel.revalidate();
        middlePanel.repaint();

        // Read data from CSV and populate middlePanel
        ArrayList<String> items = readItemsFromCSV(userId, num);

        if (items.isEmpty()) {
            middlePanel.add(new JLabel("There are no items in your cart."));
        } else {

            for (String item : items) {
                JLabel label = new JLabel(item);
                label.setFont(label.getFont().deriveFont(Font.PLAIN, 16)); // Adjust font size
                label.setAlignmentX(Component.LEFT_ALIGNMENT); // Align text to the left
                middlePanel.add(label);
                middlePanel.add(Box.createVerticalStrut(10)); // Add vertical gap between items
            }
        }
    }


    private ArrayList<String> readItemsFromCSV(int userId, int flag) {
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        String csvFile = "src/UI/userIdtoCart.csv";
        String line;


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int integerNum = Integer.parseInt(data[0]);
                if (integerNum == (userId)) {
                    for (int i = 1; i < data.length; i += 2) {
                        if (flag == 1) {
                            items.add("[" + data[i] + "] - " + data[i+1] + " | Location: Scott Library | Purchase from online store. - $4.25");
                            //prices.add(4.25);
                        } else if (flag == 2) { // 60 percent off
                            items.add("[" + data[i] + "] - " + data[i+1] + " | Location: Scott Library | Purchase from online store. - $4.25 | 60% OFF → $1.70");
                            //prices.add(4.25);
                        } else { // 40 percent off
                            items.add("[" + data[i] + "] - " + data[i+1] + " | Location: Scott Library | Purchase from online store. - $4.25 | 40% OFF → $2.55");
                            //prices.add(4.25);
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
            // Skip the first line
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                if (id == userId) {
                    role = data[3]; // Assuming role is in the fourth column
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(role);
        return role;
    }

    private void checkout() {
        ChoosePaymentScreen paymentScreen = new ChoosePaymentScreen();
        paymentScreen.setVisible(true);
        // Logic to process the checkout action
    }





    public static void main(String[] args) {
        // Example usage:
        CartScreen cartScreen = new CartScreen(1002);
        cartScreen.setVisible(true);
    }
}
