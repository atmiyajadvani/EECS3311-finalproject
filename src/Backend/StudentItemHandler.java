package Backend;

import Backend.Item;
import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class StudentItemHandler {
    private String CSV_ITEM = "src/Database/ItemSpreadsheet.csv";
    private String CSV_CART = "src/Database/userIdtoCart.csv";
    private ArrayList<Item> csvData;

    private ArrayList<Item> cart;
    public StudentItemHandler() {
        loadCSVData(CSV_ITEM);
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
                            values[4].trim(), price);
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
    
    public ArrayList filterItems(String searchText) {
        ArrayList<Item> filteredItems = new ArrayList();
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

}
