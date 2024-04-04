package Backend;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CartScreenBackEnd {
    private ItemHandler itemHandler;
    private static final String USER_INFO_FILE = "src/Database/UserInfoSpreadsheet.csv";

    private static final String CSV_FILE_PATH = "src/Database/userIdtoCart.csv";

    public CartScreenBackEnd() {
        itemHandler = new ItemHandler();
    }

    public String getUserRole(int userId) {
        try (BufferedReader br = new BufferedReader(new FileReader(USER_INFO_FILE))) {
            String line;
            boolean headerSkipped = false;
            while ((line = br.readLine()) != null) {
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue; // Skip the header line
                }
                String[] data = line.split(",");
                if (data.length >= 4) {
                    String userIdStr = data[0].trim(); // Trim whitespace
                    try {
                        int id = Integer.parseInt(userIdStr);
                        if (id == userId) {
                            return data[3].toLowerCase(); // UserType is in the fourth column
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid user ID format: " + userIdStr);
                        // Log a warning or skip this line if needed
                    }
                } else {
                    System.err.println("Invalid data format: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; // User role not found or error occurred
    }




    public List<Item> loadCartItems(int userId) {
        List<Item> cartItems = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                if (id == userId) {
                    for (int i = 1; i < data.length; i++) {
                        String itemId = data[i];
                        Item item = retrieveItemDetails(itemId);
                        if (item != null) {
                            cartItems.add(item);
                        }
                    }
                    // Do not break here, continue reading other items for the same user ID
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cartItems;
    }


    private Item retrieveItemDetails(String itemId) {
        List<Item> itemList = itemHandler.getCsvData();
        for (Item item : itemList) {
            if (item.getId().equals(itemId)) {
                return item;
            }
        }
        return null;
    }

    public boolean canRentMoreItems(int userId) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Database/UserInfoSpreadsheet.csv"))) {
            String line;
            boolean headerSkipped = false;
            while ((line = br.readLine()) != null) {
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue;
                }
                String[] data = line.split(",");
                if (data.length >= 8) {
                    try {
                        int id = Integer.parseInt(data[0]);
                        if (id == userId) {
                            int rentedItemsCount = Integer.parseInt(data[6]);
                            return rentedItemsCount <= 10;
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid user ID format: " + data[0]);
                    }
                } else {
                    System.err.println("Invalid data format: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void saveCart(int userId, List<Item> cartItems) {
        try (FileWriter writer = new FileWriter(CSV_FILE_PATH)) {
            for (Item item : cartItems) {
                writer.append(userId + "," + item.getId() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void setCartItems(List<Item> cartItems) {
        try (FileWriter writer = new FileWriter(CSV_FILE_PATH)) {
            for (Item item : cartItems) {
                writer.append(item.getId() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}
