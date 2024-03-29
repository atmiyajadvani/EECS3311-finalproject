package Backend;

import Frontend.PayWithDebitScreen;
import Frontend.StudentPhysicalItemScreen;

import javax.security.auth.callback.TextInputCallback;
import javax.swing.*;
import java.util.List;

public class PaymentOptions {

    public double calculateTotalPrice(List<StudentPhysicalItemScreen.Item> cartItems) {
        double totalPrice = 0.0;
        if (cartItems != null) {
            for (StudentPhysicalItemScreen.Item item : cartItems) {
                totalPrice += item.getPrice();
            }
        }
        return totalPrice;
    }

    public double applyPromo(double totalPrice, String promoCode){
        double discount = 0.0;
        if ("fo40".equals(promoCode)) {
            discount = 0.4; // 40% discount
        }
        return totalPrice * (1 - discount);
    }
}
