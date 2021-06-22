import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PlayerTest {

	Player firstPlayer;
	
	@Before
	public void setUp() throws Exception {
		firstPlayer = new Player(500, "AD");
	}

	@After
	public void tearDown() throws Exception {
		firstPlayer = null;
	}

	@Test
	public void PlayerCreatetest() {
		
		assertNotNull(firstPlayer);
	}
	
	@Test
	public void testCons() {
		int expectedMoney = 500;
		String expectedToken = "AD";
		
		int actualMoney = firstPlayer.getMoney();
		String actualToken = firstPlayer.getToken();
		
		assertEquals(expectedMoney, actualMoney);
		assertTrue(expectedToken.equalsIgnoreCase(actualToken));
	}
	
	@Test
	public void testUpdateMoney() throws Exception {
		int transaction = -500;
		int expectedMoney = 0;
		
		firstPlayer.updateMoney(transaction);
		
		assertEquals(firstPlayer.getMoney(), expectedMoney);
		
	}
	
	@Test
	public void testUpdateMoneyWhereNotEnough() throws Exception {
		int transaction = -501;
		int expectedMoney = -1;
		
		assertEquals(expectedMoney, firstPlayer.updateMoney(transaction));
	}
	

	
//	public void playerProperties() {
//		int actualPropert;
//		int expectedProperty;
//		
//		
//		
//	}

}