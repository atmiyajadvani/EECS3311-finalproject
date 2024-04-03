package TestCases;

import Backend.Item;
import Backend.ItemHandler;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ItemHandlerTest {
    private ItemHandler itemHandler;
    private List<Item> items;

    @BeforeEach
    public void setUp() {
        itemHandler = new ItemHandler();
        items = new ArrayList<>();
        items.add(new Item("1", "Book Title One", "Author One", "Book", "10", 50.0, "enabled"));
        items.add(new Item("2", "Book Title Two", "Author Two", "Book", "5", 30.0, "enabled"));
    }

    @Test
    public void testFilterItems() {
        itemHandler.addItem(new Item("3", "Filtered Book", "Author Three", "BOOK", "20", 60.0, "enabled"));
        List<Item> filteredItems = itemHandler.filterItems("filtered");
        assertFalse(filteredItems.isEmpty(), "Filtered items list should not be empty");
    }

    @Test
    public void testFilterItems2() {
        itemHandler.addItem(new Item("001", "Java Programming", "Author A", "BOOK", "5", 50.0, "enabled"));
        itemHandler.addItem(new Item("002", "Python Programming", "Author B", "BOOK", "5", 45.0, "enabled"));
        itemHandler.addItem(new Item("003", "Effective Java", "Author C", "BOOK", "5", 55.0, "enabled"));
        List<Item> filteredItems = itemHandler.filterItems("Java");
        boolean allMatchJava = filteredItems.stream().allMatch(item -> item.getName().contains("Java"));
        assertTrue(allMatchJava, "All filtered items should contain 'Java' in their name");
    }


    @Test
    public void testRemoveDisabledItems() {
        items.add(new Item("4", "Disabled Book", "Author Four", "BOOK", "0", 0.0, "disabled"));
        itemHandler.addItem(items.get(2)); // Add a disabled item for testing
        itemHandler.removeDisabledItems();
        List<Item> csvData = itemHandler.getCsvData();
        boolean containsDisabled = csvData.stream().anyMatch(item -> !item.isEnabled());
        assertFalse(containsDisabled, "Disabled items should be removed");
    }


    @Test
    public void testDisableItem() {
        itemHandler.disableItem("1001");
        List<Item> csvData = itemHandler.getCsvData();
        boolean isDisabled = csvData.stream().anyMatch(item -> item.getId().equals("1") && !item.isEnabled());
        assertTrue(isDisabled, "Item should be disabled");
    }

    @Test
    public void testLoadCSVData() {
        List<Item> csvData = itemHandler.getCsvData();
        assertNotNull(csvData, "CSV data should be loaded");
        assertFalse(csvData.isEmpty(), "CSV data should not be empty");
    }
}
