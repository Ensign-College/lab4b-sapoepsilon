import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IceCreamTest {

	@Test
	public void testCalculateCost() {
		IceCream supreme = new IceCream();
		supreme.calculateCost();
		assertEquals(supreme.calculateCost(), 0, 0.001);
	}

	@Test
	public void testCalculateTax() {
		IceCream supreme = new IceCream();
		supreme.calculateTax();
		assertEquals(supreme.calculateTax(), 0, 0.001);
	}

}
