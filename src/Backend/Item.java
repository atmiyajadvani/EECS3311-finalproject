package Backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Item {
    private String id;
    private String name;

    private String author;
    private String itemType;
    private String amountLeft;
    private double price; // New attribute
    private boolean isEnabled;

    public Item(String id, String name, String author, String itemType, String amountLeft, double price, String status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.itemType = itemType;
        this.amountLeft = amountLeft;
        this.price = price;
        isEnabled = status.equals("enabled");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getItemType() {
        return itemType;
    }

    public String getAmountLeft() {
        return amountLeft;
    }

    public void setAmountLeft(String amountLeft) {
        this.amountLeft = amountLeft;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // used in AddItem
    public static int getNextID() {
        int maxItemID = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("src/Database/ItemSpreadsheet.csv"))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    int currItemID = Integer.parseInt(line.split(",")[0]);
                    if (currItemID > maxItemID) {
                        maxItemID = currItemID;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error parsing item ID from the file: " + e.getMessage());
        }

        return maxItemID + 1;
    }

    // used in AddItem
    public static boolean isValidPrice(String price) {
        // price regular expression
        String pricePattern = "^\\$?\\d+(\\.\\d{1,2})?$"; // allows 0-2 decimal places

        // compile pattern and check if input matches pattern
        Pattern pattern = Pattern.compile(pricePattern);
        Matcher matcher = pattern.matcher(price);

        return matcher.matches();
    }

    // will go in database writeItem method
    public static String formatPrice(String price) {
        String formattedPrice = price.replace("$", "");

        if (formattedPrice.contains(".")) {
            // ensure two decimal places
            int indexOfDecimal = formattedPrice.indexOf(".");
            int decimalPlaces = formattedPrice.length() - indexOfDecimal - 1;
            if (decimalPlaces == 1) {
                formattedPrice += "0";
            }

            return formattedPrice;
        }

        // if no decimal just add two decimal places
        return formattedPrice + ".00";
    }

    @Override
    public String toString() {
        String status = isEnabled ? "enabled" : "disabled";
        return name + " | " + author + " | " + itemType + " | " + amountLeft + " Available copies. | " + status;
    }
}


//
//public class Item {
//    private static int idCount = 1000;
//    private String itemID;
//    private String title;
//    private String author;
//    private ItemType type;
//    private int quantity;
//    private double price;
//    private boolean isEnabled;
//
//    public Item(String title, String author, ItemType type, double price) {
//        itemID = "" + idCount++;
//        this.title = title;
//        this.author = author;
//        this.type = type;
//        quantity = 20;
//        this.price = price;
//        isEnabled = true;
//    }
//}