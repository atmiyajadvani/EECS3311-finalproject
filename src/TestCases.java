import Backend.Item;
import Backend.PaymentOptions;
import Backend.StudentItemHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestCases {

    @Test
    public void testItemCreationAndAccess() {
        Item item = new Item("1", "Test Book", "Test Author", "Book", "10", 19.99);
        Assertions.assertEquals("Test Book", item.getName(), "Item name did not match expected value.");
        Assertions.assertEquals("Test Author", item.getAuthor(), "Item author did not match expected value.");
        Assertions.assertEquals(19.99, item.getPrice(), "Item price did not match expected value.");
    }

    @Test
    public void testItemEnableDisable() {
        Item item = new Item("2", "Test Item", "Author", "Type", "5", 15.00);
        item.disable();
        Assertions.assertFalse(item.isEnabled(), "Item should be disabled.");
        item.enable();
        Assertions.assertTrue(item.isEnabled(), "Item should be enabled.");
    }

    @Test
    public void testCalculateTotalPrice() {
        List<Item> items = Arrays.asList(
                new Item("1", "Item 1", "Author 1", "Type 1", "5", 10.00),
                new Item("2", "Item 2", "Author 2", "Type 2", "3", 20.00));
        PaymentOptions paymentOptions = new PaymentOptions();
        double totalPrice = paymentOptions.calculateTotalPrice(items);
        Assertions.assertEquals(30.00, totalPrice, "Total price did not match expected value.");
    }

    @Test
    public void testApplyPromo() {
        PaymentOptions paymentOptions = new PaymentOptions();
        double totalPriceAfterDiscount = paymentOptions.applyPromo(100.00, "fo40");
        Assertions.assertEquals(60.00, totalPriceAfterDiscount, "Discounted price did not match expected value.");
    }

}
