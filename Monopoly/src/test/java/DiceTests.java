import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DiceTests {
	Dice dice;
	
	@Before
	public void setUp() {
		dice = new Dice();
	}

	
	@Test
	public void testLow() {
		int badValue = 1;
		int number = dice.roll();
		assertTrue(number > badValue);
	}
	
	@Test
	public void testHigh() {
		int badValue = 13;
		int number = dice.roll();
		assertTrue(number < badValue);
	}


}
