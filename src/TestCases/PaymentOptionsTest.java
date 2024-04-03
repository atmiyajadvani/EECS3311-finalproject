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
}
