import static org.junit.Assert.*;

import org.junit.Test;


public class CandyTest {

	@Test
	public void testCalculateCost() {
		Candy supreme = new Candy();
		supreme.calculateCost();
		assertEquals(supreme.calculateCost(), 0, 0.001);
	}

	@Test
	public void testCalculateTax() {
		Candy supreme = new Candy();
		supreme.calculateTax();
		assertEquals(supreme.calculateTax(), 0, 0.001);
	}

}
