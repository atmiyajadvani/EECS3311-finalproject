package TestCases;
import com.sun.xml.internal.ws.wsdl.writer.document.Import;
import org.junit.Test;
import static org.junit.Assert.*;

import Backend.Item;
import Backend.CartScreenBackEnd;
import Frontend.CartScreen;
import java.util.List;
import java.util.ArrayList;


public class CartScreenTest {


    @Test
    //1
    public void testSaveCart() {
        // Create a CartScreenBackEnd instance
        CartScreenBackEnd backend = new CartScreenBackEnd();

        // Create a list of items to save as cart items
        List<Item> cartItems = new ArrayList<>();
        cartItems.add(new Item("1001", "Shadows Over Mars", "Evelyn Archer", "Book", "19", 5.00, "disabled"));
        cartItems.add(new Item("1002", "The Last Ember", "Marcus Reed", "Book", "17", 5.00, "enabled"));

        // Save the cart items
        backend.saveCart(1002, cartItems); // Pass a valid user ID and the list of cart items

        // Retrieve the saved cart items
        List<Item> retrievedCartItems = backend.loadCartItems(1002); // Load all cart items

        // Assert that the retrieved cart items match the saved cart items
        assertEquals(cartItems, retrievedCartItems);


    }
    @Test
    //2
    public void testGetUserRole() {
        // Create a CartScreenBackEnd instance
        CartScreenBackEnd backend = new CartScreenBackEnd();
        // Assuming the user with ID 1002 exists in the CSV file
        String role = backend.getUserRole(1002);
        assertNotNull(role);
        assertEquals("student", role); //
    }
    @Test
    //3
    public void testCanRentMoreItems() {
        // Create a CartScreenBackEnd instance
        CartScreenBackEnd backend = new CartScreenBackEnd();

        // Test user ID
        int userId = 1002;

        // Test if the user can rent more items
        boolean canRent = backend.canRentMoreItems(userId);

        // Assert that the user can rent more items
        assertTrue(canRent);
    }

    @Test
    //4
    public void testLoadCartItemsEmptyCart() {
        // Create a CartScreenBackEnd instance
        CartScreenBackEnd backend = new CartScreenBackEnd();

        // Test user ID with an empty cart
        int userId = 1001; // Assuming this user has an empty cart

        // Retrieve the cart items
        List<Item> cartItems = backend.loadCartItems(userId);

        // Assert that the cart items list is empty
        assertTrue(cartItems.isEmpty());
    }
    @Test
    //5
    public void testGetUserRoleNonExistingUser() {
        // Create a CartScreenBackEnd instance
        CartScreenBackEnd backend = new CartScreenBackEnd();
        // Assuming the user with ID 9999 does not exist in the CSV file
        String role = backend.getUserRole(9999);
        assertNull(role); // Assert that the role is null for non-existing user
    }

    @Test
    //6
    public void testLoadCartItemsForExistingUser() {
        // Create a CartScreenBackEnd instance
        CartScreenBackEnd backend = new CartScreenBackEnd();
        // Assuming the user with ID 1002 has items in the cart
        List<Item> cartItems = backend.loadCartItems(1002);
        assertFalse(cartItems.isEmpty()); // Assert that cart items are loaded for an existing user
    }
    @Test
    //7
    public void testCanRentMoreItemsForUserWithNoRentals() {
        // Create a CartScreenBackEnd instance
        CartScreenBackEnd backend = new CartScreenBackEnd();
        // Assuming the user with ID 1002 has no items rented
        boolean canRent = backend.canRentMoreItems(1002);
        assertTrue(canRent); // Assert that the user can rent more items as they have no rentals
    }











}
