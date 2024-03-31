package Backend;

import Backend.Item;

import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class StudentItemHandler {
    private final String CSV_ITEM = "src/Database/ItemSpreadsheet.csv";
    private final String CSV_CART = "src/Database/userIdtoCart.csv";
    private List<Item> csvData;
    private ArrayList<Item> cart;

    public StudentItemHandler() {
        loadCSVData(CSV_ITEM);
    }

    public List<Item> getCsvData() {
        return csvData;
    }

    private void loadCSVData(String filePath) {
        this.csvData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 6) {
                    double price = Double.parseDouble(values[5].trim());
                    Item item = new Item(values[0].trim(), values[1].trim(), values[2].trim(), values[3].trim(),
                            values[4].trim(), price, values[6].trim());
                    csvData.add(item);
                } else {
                    System.out.println("Invalid item format: " + String.join(", ", values));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveCart(int userID) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CSV_CART, true))) {
            StringBuilder sb = new StringBuilder();
            sb.append(userID).append(",");
            for (Item item : cart) {
                sb.append(item.getId()).append(",").append(item.toString()).append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public List<Item> filterItems(String searchText) {
        List<Item> filteredItems = new ArrayList<>();
        for (Item item : csvData) {
            String itemName = item.getName().toLowerCase();
            String author = item.getAuthor().toLowerCase();
            String itemType = item.getItemType().toLowerCase();

            if (itemName.contains(searchText) || author.contains(searchText) || itemType.contains(searchText)) {
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }

    public void removeDisabledItems() {
        csvData.removeIf(item -> !item.isEnabled());
    }

    public void addItem(Item item) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/Database/ItemSpreadsheet.csv", true);
            writer.append(item.getId()).append(",")
                    .append(item.getName()).append(",")
                    .append(item.getAuthor()).append(",")
                    .append(item.getItemType()).append(",")
                    .append(item.getAmountLeft()).append(",")
                    .append(Item.formatPrice("" + item.getPrice())).append(",")
                    .append("enabled").append("\n");
        } catch (IOException e) {
            System.err.println("Error appending data to CSV file: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing FileWriter: " + e.getMessage());
            }
        }
    }

    public void enableItem(String itemID) {
        for (Item item : csvData) {
            if (item.getId().equals(itemID)) {
                item.enable();
                break;
            }
        }

        FileWriter writer = null;
        try {
            writer = new FileWriter("src/Database/ItemSpreadsheet.csv");
            for (Item item : csvData) {
                String status = item.isEnabled() ? "enabled" : "disabled";

                writer.append(item.getId()).append(",")
                        .append(item.getName()).append(",")
                        .append(item.getAuthor()).append(",")
                        .append(item.getItemType()).append(",")
                        .append(item.getAmountLeft()).append(",")
                        .append(Item.formatPrice("" + item.getPrice())).append(",")
                        .append(status).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void disableItem(String itemID) {
        for (Item item : csvData) {
            if (item.getId().equals(itemID)) {
                item.disable();
                break;
            }
        }

        FileWriter writer = null;
        try {
            writer = new FileWriter("src/Database/ItemSpreadsheet.csv");
            for (Item item : csvData) {
                String status = item.isEnabled() ? "enabled" : "disabled";

                writer.append(item.getId()).append(",")
                        .append(item.getName()).append(",")
                        .append(item.getAuthor()).append(",")
                        .append(item.getItemType()).append(",")
                        .append(item.getAmountLeft()).append(",")
                        .append(Item.formatPrice("" + item.getPrice())).append(",")
                        .append(status).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
