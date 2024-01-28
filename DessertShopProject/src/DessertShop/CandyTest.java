package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {

	@Test
    public void testCalculateCost() {
        Candy candy = new Candy("Chocolate Candy", 2.0, 2.99);

        // Assuming the cost calculation is based on weight and price per pound
        assertEquals(2.0 * 2.99, candy.calculateCost());
    }

	@Test
	void testIsSameAs() {
	    // Test the isSameAs method
	    Candy candy1 = new Candy("Candy 1", 0.5, 5.0);
	    Candy candy2 = new Candy("Candy 2", 0.5, 5.0);
	    Candy candy3 = new Candy("Candy 1", 0.75, 4.0);

	    assertTrue(candy1.isSameAs(candy2)); // Candy 1 and Candy 2 have the same name and price per pound
	    assertFalse(candy1.isSameAs(candy3)); // Candy 1 and Candy 3 have different weights
	}

	    @Test
	    void testToString() {
	        // Test the toString method
	        Candy candy = new Candy("Test Candy", 0.5, 5.0);
	        String expected = "Test Candy (Bag)\n0 @ $5.00/lb: $2.50 [Tax: $0.18]";
	        assertEquals(expected, candy.toString());
	    }

	    @Test
	    void testGetPackaging() {
	        // Test the getPackaging method
	        Candy candy = new Candy("Test Candy", 0.5, 5.0);
	        assertEquals("Bag", candy.getPackaging());
	    }

	    @Test
	    void testSetPackaging() {
	        // Test the setPackaging method
	        Candy candy = new Candy("Test Candy", 0.5, 5.0);
	        candy.setPackaging("Box");
	        assertEquals("Box", candy.getPackaging());
	    }

	    @Test
	    void testGetWeight() {
	        // Test the getWeight method
	        Candy candy = new Candy("Test Candy", 0.5, 5.0);
	        assertEquals(0.5, candy.getWeight(), 0.01);
	    }

	    @Test
	    void testSetWeight() {
	        // Test the setWeight method
	        Candy candy = new Candy("Test Candy", 0.5, 5.0);
	        candy.setWeight(0.75);
	        assertEquals(0.75, candy.getWeight(), 0.01);
	    }

	    @Test
	    void testGetPricePerPound() {
	        // Test the getPricePerPound method
	        Candy candy = new Candy("Test Candy", 0.5, 5.0);
	        assertEquals(5.0, candy.getPricePerPound(), 0.01);
	    }

	    @Test
	    void testSetPricePerPound() {
	        // Test the setPricePerPound method
	        Candy candy = new Candy("Test Candy", 0.5, 5.0);
	        candy.setPricePerPound(6.0);
	        assertEquals(6.0, candy.getPricePerPound(), 0.01);
	    }

	    @Test
	    void testCandy() {
	        // Test the constructor with no arguments
	        Candy candy = new Candy();
	        assertEquals("Candy", candy.getName());
	        assertEquals(0.0, candy.getWeight(), 0.01);
	        assertEquals(0.0, candy.getPricePerPound(), 0.01);
	        assertEquals("", candy.getPackaging());
	    }

	    @Test
	    void testCandyStringDoubleDouble() {
	        // Test the constructor with arguments
	        Candy candy = new Candy("Test Candy", 0.5, 5.0);
	        assertEquals("Test Candy", candy.getName());
	        assertEquals(0.5, candy.getWeight(), 0.01);
	        assertEquals(5.0, candy.getPricePerPound(), 0.01);
	        assertEquals("Bag", candy.getPackaging());
	    }
	}