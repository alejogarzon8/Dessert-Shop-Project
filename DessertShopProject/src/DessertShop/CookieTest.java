package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {

	@Test
    void testCalculateCost() {
        // Create a test cookie
        Cookie cookie = new Cookie("Chocolate Chip", 12, 0.10);

        // Calculate the cost and compare it to the expected value
        assertEquals(0.12, cookie.calculateCost(), 0.10);
    }

    @Test
    void testIsSameAs() {
        // Create two cookies with the same properties
        Cookie cookie1 = new Cookie("Oatmeal Raisin", 24, 0.08);
        Cookie cookie2 = new Cookie("Oatmeal Raisin", 24, 0.08);

        // Check if they are considered the same
        assertTrue(cookie1.isSameAs(cookie2));
    }

    @Test
    void testIsNotSameAs() {
        // Create two cookies with different properties
        Cookie cookie1 = new Cookie("Sugar Cookie", 36, 0.12);
        Cookie cookie2 = new Cookie("Chocolate Chip", 12, 0.10);

        // Check if they are not considered the same
        assertFalse(cookie1.isSameAs(cookie2));
    }

    @Test
    void testGetPackaging() {
        // Create a test cookie and set the packaging
        Cookie cookie = new Cookie("Macadamia Nut", 20, 0.12);
        cookie.setPackaging("Box");

        // Check if the getPackaging method returns the expected packaging
        assertEquals("Box", cookie.getPackaging());
    }

    @Test
    void testSetQuantity() {
        // Create a test cookie and set the quantity
        Cookie cookie = new Cookie("Shortbread", 24, 0.10);
        cookie.setQuantity(30);

        // Check if the getQuantity method returns the expected quantity
        assertEquals(30, cookie.getQuantity());
    }

    @Test
    void testGetQuantity() {
        // Create a test cookie with a specific quantity
        Cookie cookie = new Cookie("Snickerdoodle", 15, 0.12);

        // Check if the getQuantity method returns the expected quantity
        assertEquals(15, cookie.getQuantity());
    }

    @Test
    void testGetPricePerDozen() {
        // Create a test cookie with a specific price per dozen
        Cookie cookie = new Cookie("Double Chocolate", 10, 0.20);

        // Check if the getPricePerDozen method returns the expected price per dozen
        assertEquals(0.20, cookie.getPricePerDozen(), 0.01);
    }

    @Test
    void testSetPricePerDozen() {
        // Create a test cookie and set the price per dozen
        Cookie cookie = new Cookie("Gingerbread", 18, 0.15);
        cookie.setPricePerDozen(0.18);

        // Check if the getPricePerDozen method returns the expected price per dozen
        assertEquals(0.18, cookie.getPricePerDozen(), 0.01);
    }
}