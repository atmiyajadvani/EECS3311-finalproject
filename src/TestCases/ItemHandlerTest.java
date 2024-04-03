package TestCases;

import Backend.Item;
import Backend.PaymentOptions;
import Backend.ItemHandler;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ItemHandlerTest {

    private PaymentOptions paymentOptions;
    private ItemHandler studentItemHandler;
    private List<Item> items;

    @Before
    public void setUp() {
        paymentOptions = new PaymentOptions();
        studentItemHandler = new ItemHandler();
        items = new ArrayList<>();
        items.add(new Item("1", "Book Title One", "Author One", "Book", "10", 50.0, "enabled"));
        items.add(new Item("2", "Book Title Two", "Author Two", "Book", "5", 30.0, "enabled"));
    }

    @Test
    public void testCalculateTotalPrice() {
        double totalPrice = paymentOptions.calculateTotalPrice(items);
        Assert.assertEquals("Total price calculation is incorrect", 80.0, totalPrice, 0.0);
    }

    @Test
    public void testApplyPromo() {
        double discountedPrice = paymentOptions.applyPromo(100.0, "fo40");
        Assert.assertEquals("Discount application is incorrect", 60.0, discountedPrice, 0.0);
    }

    @Test
    public void testApplyPromoWithInvalidCode() {
        double discountedPrice = paymentOptions.applyPromo(100.0, "invalidCode");
        Assert.assertEquals("Discount with invalid promo code should not be applied", 100.0, discountedPrice, 0.0);
    }

    @Test
    public void testFilterItems() {
        studentItemHandler.addItem(new Item("3", "Filtered Book", "Author Three", "BOOK", "20", 60.0, "enabled"));
        List<Item> filteredItems = studentItemHandler.filterItems("filtered");
        Assert.assertFalse("Filtered items list should not be empty", filteredItems.isEmpty());
    }

    @Test
    public void testFilterItems2() {
        studentItemHandler.addItem(new Item("001", "Java Programming", "Author A", "BOOK", "5", 50.0, "enabled"));
        studentItemHandler.addItem(new Item("002", "Python Programming", "Author B", "BOOK", "5", 45.0, "enabled"));
        studentItemHandler.addItem(new Item("003", "Effective Java", "Author C", "BOOK", "5", 55.0, "enabled"));
        List<Item> filteredItems = studentItemHandler.filterItems("Java");
        boolean allMatchJava = filteredItems.stream().allMatch(item -> item.getName().contains("Java"));
        Assert.assertTrue("All filtered items should contain 'Java' in their name", allMatchJava);
    }


    @Test
    public void testRemoveDisabledItems() {
        items.add(new Item("4", "Disabled Book", "Author Four", "BOOK", "0", 0.0, "disabled"));
        studentItemHandler.addItem(items.get(2)); // Add a disabled item for testing
        studentItemHandler.removeDisabledItems();
        List<Item> csvData = studentItemHandler.getCsvData();
        boolean containsDisabled = csvData.stream().anyMatch(item -> !item.isEnabled());
        Assert.assertFalse("Disabled items should be removed", containsDisabled);
    }


    @Test
    public void testDisableItem() {
        studentItemHandler.disableItem("1001");
        List<Item> csvData = studentItemHandler.getCsvData();
        boolean isDisabled = csvData.stream().anyMatch(item -> item.getId().equals("1") && !item.isEnabled());
        Assert.assertTrue("Item should be disabled", isDisabled);
    }

    @Test
    public void testLoadCSVData() {
        List<Item> csvData = studentItemHandler.getCsvData();
        Assert.assertNotNull("CSV data should be loaded", csvData);
        Assert.assertFalse("CSV data should not be empty", csvData.isEmpty());
    }

    @Test
    public void testCalculateTotalPriceWithPromo() {
        double totalPrice = paymentOptions.calculateTotalPrice(items);
        double totalPriceAfterPromo = paymentOptions.applyPromo(totalPrice, "fo40");
        Assert.assertEquals("Total price after applying promo code is incorrect", 48.0, totalPriceAfterPromo, 0.0);
    }

    @Test
    public void testItemAdditionReflectsCorrectly() {
        Item newItem = new Item("6", "Advanced C++", "Author C++", "BOOK", "10", 40.0, "enabled");
        studentItemHandler.addItem(newItem);
        boolean itemExists = studentItemHandler.getCsvData().stream().anyMatch(item -> item.getId().equals("6"));
        Assert.assertTrue("Newly added item should exist in the list", itemExists);
    }

    @Test
    public void testItemEnabledStatusAfterEnableCall() {
        studentItemHandler.enableItem("2");
        boolean isEnabled = studentItemHandler.getCsvData().stream()
                .filter(item -> item.getId().equals("2"))
                .allMatch(Item::isEnabled);
        Assert.assertTrue("Item with ID '2' should be enabled after enableItem call", isEnabled);
    }




}