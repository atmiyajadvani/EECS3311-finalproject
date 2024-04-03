package Frontend;

import Backend.Item;
import Backend.ItemHandler;

public interface CartListener {
    void itemAddedToCart(Item item);
}
