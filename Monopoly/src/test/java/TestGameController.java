

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestGameController {
	
	
	GameController controller;
	
	@Before
	public void setUp() throws Exception {
		int playerCount = 4;
		controller = new GameController(playerCount);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNotNull() {
		Assert.assertNotNull(controller);
	}

}
