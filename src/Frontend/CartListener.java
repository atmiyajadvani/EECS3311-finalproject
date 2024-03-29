package Frontend;

import Backend.Item;
import Backend.StudentItemHandler;

public interface CartListener {
    void itemAddedToCart(Item item);
}
