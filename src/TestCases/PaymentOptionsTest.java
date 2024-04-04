package TestCases;

import Backend.Item;
import Backend.PaymentOptions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PaymentOptionsTest {
    private PaymentOptions paymentOptions;
    private List<Item> items;

    @BeforeEach
    public void setUp() {
        paymentOptions = new PaymentOptions();
        items = new ArrayList<>();
        items.add(new Item("1", "Book Title One", "Author One", "Book", "10", 50.0, "enabled"));
        items.add(new Item("2", "Book Title Two", "Author Two", "Book", "5", 30.0, "enabled"));
    }

    @Test
    public void testCalculateTotalPrice() {
        double totalPrice = paymentOptions.calculateTotalPrice(items);
        assertEquals(80.0, totalPrice, 0.0, "Total price calculation is incorrect");
    }

    @Test
    public void testApplyPromo() {
        double discountedPrice = paymentOptions.applyPromo(100.0, "fo40");
        assertEquals(60.0, discountedPrice, 0.0, "Discount application is incorrect");
    }

    @Test
    public void testApplyPromoWithInvalidCode() {
        double discountedPrice = paymentOptions.applyPromo(100.0, "invalidCode");
        assertEquals(100.0, discountedPrice, 0.0, "Discount with invalid promo code should not be applied");
    }

    @Test
    public void testApplyPromoWithEmptyCode() {
        double discountedPrice = paymentOptions.applyPromo(100.0, "");
        assertEquals(100.0, discountedPrice, 0.0, "Discount should not be applied when promo code is empty");
    }

    @Test
    public void testPriceWithNoItems() {
        double totalPrice = paymentOptions.calculateTotalPrice(null);
        assertEquals(0.0, totalPrice, 0.0, "Total price should be zero when items list is null");
    }

    @Test
    public void testPriceOnlyEnabledItems() {
        items.add(new Item("3", "Another Book", "Author Three", "Book", "1", 20.0, "enabled"));
        double totalPrice = paymentOptions.calculateTotalPrice(items);
        assertEquals(100.0, totalPrice, 0.0, "Total price should only include enabled items");
    }


    @Test
    public void applyPromoOnZeroTotalPrice() {
        double discountedPrice = paymentOptions.applyPromo(0.0, "fo40");
        assertEquals(0.0, discountedPrice, 0.0, "Applying promo on zero total price should result in zero");
    }

    @Test
    public void testCalculateWithNegativeItemPrice() {
        items.add(new Item("4", "Error Book", "Author Error", "Book", "1", -10.0, "enabled"));
        double totalPrice = paymentOptions.calculateTotalPrice(items);
        assertEquals(70.0, totalPrice, 0.0, "Total price calculation should not include negative item prices");
    }

    @Test
    public void testCalculateWithAllEnabledItems() {
        double totalPrice = paymentOptions.calculateTotalPrice(items);
        assertEquals(80.0, totalPrice, 0.0, "Total price should correctly sum up all enabled items.");
    }

    @Test
    public void testCalculateWhenItemsListIsEmpty() {
        double totalPrice = paymentOptions.calculateTotalPrice(new ArrayList<>());
        assertEquals(0.0, totalPrice, 0.0, "Total price should be zero for an empty items list.");
    }


}
