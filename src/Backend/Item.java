package Backend;

import java.util.Objects;

public class Item {
    private String id;
    private String name;
    private String author;
    private String itemType;
    private String amountLeft;
    private double price; // New attribute

    public Item(String id, String name, String author, String itemType, String amountLeft, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.itemType = itemType;
        this.amountLeft = amountLeft;
        this.price = price;
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

    @Override
    public String toString() {
        return name + " | " + author + " | " + itemType + " | " + amountLeft + " Available copies.";
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
