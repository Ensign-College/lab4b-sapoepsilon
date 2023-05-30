import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SundaeTest {

	@Test
	public void testCalculateCost() {
		Sundae supreme = new Sundae();
		supreme.calculateCost();
		assertEquals(supreme.calculateCost(), 0, 0.001);
	}

	@Test
	public void testCalculateTax() {
		Sundae supreme = new Sundae();
		supreme.calculateTax();
		assertEquals(supreme.calculateTax(), 0, 0.001);
	}

}
