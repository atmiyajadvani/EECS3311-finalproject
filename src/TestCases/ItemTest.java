package TestCases;

import Backend.Item;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

class ItemTest {
    private static final String CSV_FILE = "src/TestCases/CSV/ItemTest.csv";
    private List<Item> items;
    private BufferedReader br;
    private FileWriter writer;

    private void writeTestItems(List<Item> items) {
        try {
            writer = new FileWriter(CSV_FILE);
            for (Item item : items) {
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

    @BeforeEach
    void setUp() {
        items = new ArrayList<>();

        try {
            // empty csv file
            writer = new FileWriter(CSV_FILE, false);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testGetNextIDEmpty() {
        writeTestItems(items);
        assertEquals("1", Item.getNextID(CSV_FILE), "Default next item ID should be 1.");
    }

    @Test
    void testGetNextID1() {
        items.add(new Item("1", "Book Title One", "Author One", "Book", "10", 50.0, "enabled"));
        items.add(new Item("2", "Book Title Two", "Author Two", "Book", "5", 30.0, "enabled"));
        writeTestItems(items);
        assertEquals("3", Item.getNextID(CSV_FILE), "Next item ID should be 3.");
    }

    @Test
    void testGetNextID2() {
        items.add(new Item("1001", "Book Title One", "Author One", "Book", "10", 50.0, "enabled"));
        items.add(new Item("1002", "Book Title Two", "Author Two", "Book", "5", 30.0, "enabled"));
        items.add(new Item("1003", "Book Title Three", "Author Three", "Book", "5", 30.0, "enabled"));
        writeTestItems(items);
        assertEquals("1004", Item.getNextID(CSV_FILE), "Next item ID should be 1004.");
    }
}