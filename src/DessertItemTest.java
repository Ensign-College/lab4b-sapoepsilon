import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DessertItemTest {

	@Test
	public void testGetTaxPercent() {
		Candy supreme = new Candy();
		supreme.getTaxPercent();
		assertEquals(supreme.getTaxPercent(), 7.25, 0.001);

	}

	@Test
	public void testSetTaxPercent() {
		Candy supreme = new Candy();
		supreme.setTaxPercent(7.2);
		assertEquals(supreme.getTaxPercent(), 7.2, 0.001);
	}

}
