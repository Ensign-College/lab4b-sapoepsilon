import static org.junit.Assert.*;

import org.junit.Test;

public class CookieTest {
	@Test
	public void testCalculateCost() {
		Cookie supreme = new Cookie();
		supreme.calculateCost();
		assertEquals(supreme.calculateCost(), 0, 0.001);
	}

	@Test
	public void testCalculateTax() {
		Cookie supreme = new Cookie();
		supreme.calculateTax();
		assertEquals(supreme.calculateTax(), 0, 0.001);
	}

}
