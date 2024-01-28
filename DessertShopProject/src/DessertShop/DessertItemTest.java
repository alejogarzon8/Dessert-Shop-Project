package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DessertItemTest {

	@Test
	public void testDefaultConstructor() {
		Candy candy = new Candy();
		assertEquals("Default Dessert Item", candy.getName());
	}

	@Test
	public void testParameterizedConstructor() {
		double candyWeight = 0;
		double pricePerPound = 0;
		Candy candy = new Candy("Chocolate Cake", candyWeight, pricePerPound);
		assertEquals("Chocolate Cake", candy.getName());
	}

	@Test
	public void testSetName() {
		DessertItem dessertItem = new Candy();
		dessertItem.setName("Vanilla Ice Cream");
		assertEquals("Vanilla Ice Cream", dessertItem.getName());

	}

	@Test
	public void testGetTaxPercent() {
		Candy candy = new Candy(); // Using Candy class as it's a concrete subclass
		assertEquals(7.25, candy.getTaxPercent(), 0.001); // Assuming taxPercent is initialized to 7.25
	}

	@Test
	public void testSetTaxPercent() {
		Candy candy = new Candy(); // Using Candy class as it's a concrete subclass
		candy.setTaxPercent(8.0);
		assertEquals(8.0, candy.getTaxPercent(), 0.001);
	}

	@Test
	public void testCompareTo_CostLess() {
		Candy candy1 = new Candy("Candy1", 1.0, 2.0);
		Candy candy2 = new Candy("Candy2", 2.0, 2.0);
		int result = candy1.compareTo(candy2);
		assertEquals(-1, result);
	}

	@Test
	public void testCompareTo_CostGreater() {
		Candy candy1 = new Candy("Candy1", 3.0, 2.0);
		Candy candy2 = new Candy("Candy2", 2.0, 2.0);
		int result = candy1.compareTo(candy2);
		assertEquals(1, result);
	}

	@Test
	public void testCompareTo_SameCost() {
		Candy candy1 = new Candy("Candy1", 2.0, 2.0);
		Candy candy2 = new Candy("Candy2", 2.0, 2.0);
		int result = candy1.compareTo(candy2);
		assertEquals(0, result);

	}
}