package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
    void testCustomer() {
        Customer customer = new Customer("Alice");
        assertNotNull(customer);
    }

    @Test
    void testGetName() {
        Customer customer = new Customer("Bob");
        assertEquals("Bob", customer.getName());
    }

    @Test
    void testGetID() {
        Customer customer = new Customer("Charlie");
        assertEquals(1000, customer.getID()); // The next customer ID should be 1001 (1000 + 1)
    }

    @Test
    void testGetOrderHistory() {
        Customer customer = new Customer("David");
        assertNotNull(customer.getOrderHistory());
        assertTrue(customer.getOrderHistory().isEmpty());
    }

    @Test
    void testSetName() {
        Customer customer = new Customer("Eve");
        customer.setName("Frank");
        assertEquals("Frank", customer.getName());
    }

    //@Test
    //void testAddToHistory() {
    //    Customer customer = new Customer("Grace");
    //  Order order1 = new Order(customer);
    //  Order order2 = new Order(customer);
    //  customer.addToHistory(order1);
    //  customer.addToHistory(order2);

    //  assertEquals(2, customer.getOrderHistory().size());
    //  assertTrue(customer.getOrderHistory().contains(order1));
    //  assertTrue(customer.getOrderHistory().contains(order2));
    //}

   
}