package Backend;

public class Item {
    private static int idCount = 1000;
    private String itemID;
    private String title;
    private String author;
    private ItemType type;
    private int quantity;
    private double price;
    private boolean isEnabled;

    public Item(String title, String author, ItemType type, double price) {
        itemID = "" + idCount++;
        this.title = title;
        this.author = author;
        this.type = type;
        quantity = 20;
        this.price = price;
        isEnabled = true;
    }
}
